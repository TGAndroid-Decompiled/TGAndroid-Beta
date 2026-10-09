package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class iv extends org.telegram.ui.ActionBar.g5 {
    public final boolean f27488f;
    public final lv h;

    public iv(lv lvVar, boolean z10) {
        this.h = lvVar;
        this.f27488f = z10;
    }

    @Override
    public final boolean h() {
        lv lvVar = this.h;
        ha1 ha1Var = lvVar.f28599c;
        boolean z10 = ha1Var.T;
        if (z10) {
            if (z10) {
                ha1Var.T = false;
                ha1Var.m();
                ha1Var.l(false);
            }
            return false;
        }
        try {
            lvVar.f28603r.getWindow().clearFlags(128);
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
        lv lvVar = this.h;
        int i10 = lvVar.Q;
        RadialProgressView radialProgressView = lvVar.f28602n;
        fv fvVar = lvVar.f28598b;
        ha1 ha1Var = lvVar.f28599c;
        if (this.f27488f && lvVar.f28599c.g(lvVar.K, null, null, lvVar.I, true)) {
            radialProgressView.setVisibility(4);
            fvVar.setVisibility(4);
            ha1Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        fvVar.setVisibility(0);
        lvVar.f28604s.setVisibility(0);
        lvVar.v.setVisibility(4);
        fvVar.setKeepScreenOn(true);
        ha1Var.setVisibility(4);
        ha1Var.getControlsView().setVisibility(4);
        ha1Var.getTextureView().setVisibility(4);
        if (ha1Var.getTextureImageView() != null) {
            ha1Var.getTextureImageView().setVisibility(4);
        }
        lvVar.f28599c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = ha1Var.getYoutubeId();
            if (youtubeId != null) {
                lvVar.h.setVisibility(0);
                lvVar.f28607y = true;
                fvVar.addJavascriptInterface(new kv(lvVar), "YoutubeProxy");
                String str2 = lvVar.I;
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
                        lvVar.f28598b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        return;
                    }
                }
                intValue = 0;
                lvVar.f28598b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                return;
            }
            fvVar.loadUrl(lvVar.K, hashMap);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
