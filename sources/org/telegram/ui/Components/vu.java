package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class vu extends org.telegram.ui.ActionBar.e5 {
    public final boolean f29724f;
    public final yu h;

    public vu(yu yuVar, boolean z10) {
        this.h = yuVar;
        this.f29724f = z10;
    }

    @Override
    public final boolean g() {
        yu yuVar = this.h;
        r91 r91Var = yuVar.f30810c;
        boolean z10 = r91Var.T;
        if (z10) {
            if (z10) {
                r91Var.T = false;
                r91Var.m();
                r91Var.l(false);
            }
            return false;
        }
        try {
            yuVar.f30813r.getWindow().clearFlags(128);
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        String str;
        int intValue;
        yu yuVar = this.h;
        int i10 = yuVar.Q;
        RadialProgressView radialProgressView = yuVar.f30812n;
        su suVar = yuVar.f30809b;
        r91 r91Var = yuVar.f30810c;
        if (this.f29724f && yuVar.f30810c.g(yuVar.K, null, null, yuVar.I, true)) {
            radialProgressView.setVisibility(4);
            suVar.setVisibility(4);
            r91Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        suVar.setVisibility(0);
        yuVar.f30814s.setVisibility(0);
        yuVar.v.setVisibility(4);
        suVar.setKeepScreenOn(true);
        r91Var.setVisibility(4);
        r91Var.getControlsView().setVisibility(4);
        r91Var.getTextureView().setVisibility(4);
        if (r91Var.getTextureImageView() != null) {
            r91Var.getTextureImageView().setVisibility(4);
        }
        yuVar.f30810c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = r91Var.getYoutubeId();
            if (youtubeId != null) {
                yuVar.h.setVisibility(0);
                yuVar.f30817y = true;
                suVar.addJavascriptInterface(new xu(yuVar), "YoutubeProxy");
                String str2 = yuVar.I;
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (str != null) {
                        if (str.contains("m")) {
                            String[] split = str.split("m");
                            intValue = (Utilities.parseInt((CharSequence) split[0]).intValue() * 60) + Utilities.parseInt((CharSequence) split[1]).intValue();
                        } else {
                            intValue = Utilities.parseInt((CharSequence) str).intValue();
                        }
                        yuVar.f30809b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                        return;
                    }
                }
                intValue = 0;
                yuVar.f30809b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                return;
            }
            suVar.loadUrl(yuVar.K, hashMap);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
