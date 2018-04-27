package com.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
/**
 * 测试控制器
 * @author zhangxing
 *
 */
public class TestController {
	
	@RequestMapping(value="test", method=RequestMethod.GET)
	public String gotoTest(Model model){
		model.addAttribute("message","首页展示");
		return "/test/test";
	}
}
