package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.Utilities;
public final class tt extends org.telegram.ui.ActionBar.u4 {
    public final boolean f38411r;
    public final vt f38412s;

    public tt(vt vtVar, boolean z9) {
        this.f38412s = vtVar;
        this.f38411r = z9;
    }

    @Override
    public final void v() {
        String str;
        int intValue;
        vt vtVar = this.f38412s;
        int i7 = vtVar.H1;
        RadialProgressView radialProgressView = vtVar.f39671o1;
        rt rtVar = vtVar.f39667i1;
        f71 f71Var = vtVar.f39668j1;
        if (this.f38411r && vtVar.f39668j1.g(vtVar.B1, null, null, vtVar.f39682z1, true)) {
            radialProgressView.setVisibility(4);
            rtVar.setVisibility(4);
            f71Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        rtVar.setVisibility(0);
        vtVar.f39673q1.setVisibility(0);
        vtVar.f39674r1.setVisibility(4);
        rtVar.setKeepScreenOn(true);
        f71Var.setVisibility(4);
        f71Var.getControlsView().setVisibility(4);
        f71Var.getTextureView().setVisibility(4);
        if (f71Var.getTextureImageView() != null) {
            f71Var.getTextureImageView().setVisibility(4);
        }
        vtVar.f39668j1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = f71Var.getYoutubeId();
            if (youtubeId != null) {
                vtVar.n1.setVisibility(0);
                vtVar.f39677u1 = true;
                rtVar.addJavascriptInterface(new ut(vtVar), "YoutubeProxy");
                String str2 = vtVar.f39682z1;
                if (str2 != null) {
                    try {
                        Uri parse = Uri.parse(str2);
                        if (i7 > 0) {
                            str = "" + i7;
                        } else {
                            str = null;
                        }
                        if (str == null && (str = parse.getQueryParameter("t")) == null) {
                            str = parse.getQueryParameter("time_continue");
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (str != null) {
                        if (str.contains("m")) {
                            String[] split = str.split("m");
                            intValue = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                        } else {
                            intValue = Utilities.z(str).intValue();
                        }
                        vtVar.f39667i1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        return;
                    }
                }
                intValue = 0;
                vtVar.f39667i1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                return;
            }
            rtVar.loadUrl(vtVar.B1, hashMap);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean x() {
        vt vtVar = this.f38412s;
        f71 f71Var = vtVar.f39668j1;
        boolean z9 = f71Var.T;
        if (z9) {
            if (z9) {
                f71Var.T = false;
                f71Var.m();
                f71Var.l(false);
            }
            return false;
        }
        try {
            vtVar.f39672p1.getWindow().clearFlags(128);
            return true;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return true;
        }
    }
}
