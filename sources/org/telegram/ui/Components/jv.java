package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class jv extends org.telegram.ui.ActionBar.g5 {
    public final boolean f27791f;
    public final mv h;

    public jv(mv mvVar, boolean z10) {
        this.h = mvVar;
        this.f27791f = z10;
    }

    @Override
    public final boolean h() {
        mv mvVar = this.h;
        ia1 ia1Var = mvVar.f28903c;
        boolean z10 = ia1Var.T;
        if (z10) {
            if (z10) {
                ia1Var.T = false;
                ia1Var.m();
                ia1Var.l(false);
            }
            return false;
        }
        try {
            mvVar.f28907r.getWindow().clearFlags(128);
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return true;
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        String str;
        int intValue;
        mv mvVar = this.h;
        int i10 = mvVar.Q;
        RadialProgressView radialProgressView = mvVar.f28906n;
        gv gvVar = mvVar.f28902b;
        ia1 ia1Var = mvVar.f28903c;
        if (this.f27791f && mvVar.f28903c.g(mvVar.K, null, null, mvVar.I, true)) {
            radialProgressView.setVisibility(4);
            gvVar.setVisibility(4);
            ia1Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        gvVar.setVisibility(0);
        mvVar.f28908s.setVisibility(0);
        mvVar.v.setVisibility(4);
        gvVar.setKeepScreenOn(true);
        ia1Var.setVisibility(4);
        ia1Var.getControlsView().setVisibility(4);
        ia1Var.getTextureView().setVisibility(4);
        if (ia1Var.getTextureImageView() != null) {
            ia1Var.getTextureImageView().setVisibility(4);
        }
        mvVar.f28903c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = ia1Var.getYoutubeId();
            if (youtubeId != null) {
                mvVar.h.setVisibility(0);
                mvVar.f28911y = true;
                gvVar.addJavascriptInterface(new lv(mvVar), "YoutubeProxy");
                String str2 = mvVar.I;
                if (str2 != null) {
                    try {
                        Uri parse = Uri.parse(str2);
                        if (i10 > 0) {
                            str = "" + i10;
                        } else {
                            str = null;
                        }
                        if (str == null && (str = parse.getQueryParameter("t")) == null) {
                            str = parse.getQueryParameter("time_continue");
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (str != null) {
                        if (str.contains("m")) {
                            String[] split = str.split("m");
                            intValue = (Utilities.parseInt((CharSequence) split[0]).intValue() * 60) + Utilities.parseInt((CharSequence) split[1]).intValue();
                        } else {
                            intValue = Utilities.parseInt((CharSequence) str).intValue();
                        }
                        mvVar.f28902b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        return;
                    }
                }
                intValue = 0;
                mvVar.f28902b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                return;
            }
            gvVar.loadUrl(mvVar.K, hashMap);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
