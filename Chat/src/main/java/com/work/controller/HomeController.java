package com.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/chatServer")
	public String chatServer() {
		return "chatServer";
	}
	
}
