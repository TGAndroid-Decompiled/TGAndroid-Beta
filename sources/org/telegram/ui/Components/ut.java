package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.Utilities;
public final class ut extends org.telegram.ui.ActionBar.u4 {
    public final boolean f38801r;
    public final wt f38802s;

    public ut(wt wtVar, boolean z9) {
        this.f38802s = wtVar;
        this.f38801r = z9;
    }

    @Override
    public final void v() {
        String str;
        int intValue;
        wt wtVar = this.f38802s;
        int i7 = wtVar.H1;
        RadialProgressView radialProgressView = wtVar.f40153o1;
        st stVar = wtVar.f40149i1;
        m71 m71Var = wtVar.f40150j1;
        if (this.f38801r && wtVar.f40150j1.g(wtVar.B1, null, null, wtVar.f40164z1, true)) {
            radialProgressView.setVisibility(4);
            stVar.setVisibility(4);
            m71Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        stVar.setVisibility(0);
        wtVar.f40155q1.setVisibility(0);
        wtVar.f40156r1.setVisibility(4);
        stVar.setKeepScreenOn(true);
        m71Var.setVisibility(4);
        m71Var.getControlsView().setVisibility(4);
        m71Var.getTextureView().setVisibility(4);
        if (m71Var.getTextureImageView() != null) {
            m71Var.getTextureImageView().setVisibility(4);
        }
        wtVar.f40150j1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = m71Var.getYoutubeId();
            if (youtubeId != null) {
                wtVar.n1.setVisibility(0);
                wtVar.f40159u1 = true;
                stVar.addJavascriptInterface(new vt(wtVar), "YoutubeProxy");
                String str2 = wtVar.f40164z1;
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
                        wtVar.f40149i1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        return;
                    }
                }
                intValue = 0;
                wtVar.f40149i1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                return;
            }
            stVar.loadUrl(wtVar.B1, hashMap);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean x() {
        wt wtVar = this.f38802s;
        m71 m71Var = wtVar.f40150j1;
        boolean z9 = m71Var.T;
        if (z9) {
            if (z9) {
                m71Var.T = false;
                m71Var.m();
                m71Var.l(false);
            }
            return false;
        }
        try {
            wtVar.f40154p1.getWindow().clearFlags(128);
            return true;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return true;
        }
    }
}
