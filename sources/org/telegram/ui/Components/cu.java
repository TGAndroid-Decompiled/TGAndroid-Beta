package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public final class cu extends org.telegram.ui.ActionBar.e5 {

    public final boolean f27546f;
    public final fu h;

    public cu(fu fuVar, boolean z10) {
        this.h = fuVar;
        this.f27546f = z10;
    }

    @Override
    public final boolean g() {
        fu fuVar = this.h;
        i81 i81Var = fuVar.f28451c;
        boolean z10 = i81Var.P;
        if (z10) {
            if (z10) {
                i81Var.P = false;
                i81Var.m();
                i81Var.l(false);
            }
            return false;
        }
        try {
            fuVar.f28455r.getWindow().clearFlags(128);
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
            return true;
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        String queryParameter;
        int iIntValue;
        fu fuVar = this.h;
        int i10 = fuVar.M;
        RadialProgressView radialProgressView = fuVar.f28454n;
        zt ztVar = fuVar.f28450b;
        i81 i81Var = fuVar.f28451c;
        if (this.f27546f && fuVar.f28451c.g(fuVar.G, null, null, fuVar.E, true)) {
            radialProgressView.setVisibility(4);
            ztVar.setVisibility(4);
            i81Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        ztVar.setVisibility(0);
        fuVar.f28456s.setVisibility(0);
        fuVar.v.setVisibility(4);
        ztVar.setKeepScreenOn(true);
        i81Var.setVisibility(4);
        i81Var.getControlsView().setVisibility(4);
        i81Var.getTextureView().setVisibility(4);
        if (i81Var.getTextureImageView() != null) {
            i81Var.getTextureImageView().setVisibility(4);
        }
        fuVar.f28451c.g(null, null, null, null, false);
        HashMap map = new HashMap();
        map.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = i81Var.getYoutubeId();
            if (youtubeId == null) {
                ztVar.loadUrl(fuVar.G, map);
                return;
            }
            fuVar.h.setVisibility(0);
            fuVar.f28459y = true;
            ztVar.addJavascriptInterface(new eu(fuVar), "YoutubeProxy");
            String str = fuVar.E;
            if (str != null) {
                try {
                    Uri uri = Uri.parse(str);
                    if (i10 > 0) {
                        queryParameter = "" + i10;
                    } else {
                        queryParameter = null;
                    }
                    if (queryParameter == null && (queryParameter = uri.getQueryParameter("t")) == null) {
                        queryParameter = uri.getQueryParameter("time_continue");
                    }
                    if (queryParameter == null) {
                        iIntValue = 0;
                    } else if (queryParameter.contains("m")) {
                        String[] strArrSplit = queryParameter.split("m");
                        iIntValue = (Utilities.parseInt((CharSequence) strArrSplit[0]).intValue() * 60) + Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                    } else {
                        iIntValue = Utilities.parseInt((CharSequence) queryParameter).intValue();
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            } else {
                iIntValue = 0;
            }
            fuVar.f28450b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(iIntValue)), "text/html", "UTF-8", "https://youtube.com");
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
