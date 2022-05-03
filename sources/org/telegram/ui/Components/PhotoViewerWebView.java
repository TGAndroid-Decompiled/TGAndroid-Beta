package org.telegram.ui.Components;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.PhotoViewer;

public class PhotoViewerWebView extends FrameLayout {
    private int currentAccount = UserConfig.selectedAccount;
    private TLRPC$WebPage currentWebpage;
    private boolean isYouTube;
    private View pipItem;
    private float playbackSpeed;
    private RadialProgressView progressBar;
    private View progressBarBlackBackground;
    private boolean setPlaybackSpeed;
    private WebView webView;

    protected void drawBlackBackground(Canvas canvas, int i, int i2) {
    }

    protected void processTouch(MotionEvent motionEvent) {
    }

    public class YoutubeProxy {
        private YoutubeProxy() {
        }

        @JavascriptInterface
        public void postEvent(String str, String str2) {
            if ("loaded".equals(str)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewerWebView.YoutubeProxy.this.lambda$postEvent$0();
                    }
                });
            }
        }

        public void lambda$postEvent$0() {
            PhotoViewerWebView.this.progressBar.setVisibility(4);
            PhotoViewerWebView.this.progressBarBlackBackground.setVisibility(4);
            if (PhotoViewerWebView.this.setPlaybackSpeed) {
                PhotoViewerWebView.this.setPlaybackSpeed = false;
                PhotoViewerWebView photoViewerWebView = PhotoViewerWebView.this;
                photoViewerWebView.setPlaybackSpeed(photoViewerWebView.playbackSpeed);
            }
            PhotoViewerWebView.this.pipItem.setEnabled(true);
            PhotoViewerWebView.this.pipItem.setAlpha(1.0f);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public PhotoViewerWebView(Context context, View view) {
        super(context);
        this.pipItem = view;
        WebView webView = new WebView(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                PhotoViewerWebView.this.processTouch(motionEvent);
                return super.onTouchEvent(motionEvent);
            }
        };
        this.webView = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setDomStorageEnabled(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 21) {
            this.webView.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
        }
        this.webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onLoadResource(WebView webView2, String str) {
                super.onLoadResource(webView2, str);
            }

            @Override
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                if (!PhotoViewerWebView.this.isYouTube || Build.VERSION.SDK_INT < 17) {
                    PhotoViewerWebView.this.progressBar.setVisibility(4);
                    PhotoViewerWebView.this.progressBarBlackBackground.setVisibility(4);
                    PhotoViewerWebView.this.pipItem.setEnabled(true);
                    PhotoViewerWebView.this.pipItem.setAlpha(1.0f);
                }
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                if (!PhotoViewerWebView.this.isYouTube) {
                    return super.shouldOverrideUrlLoading(webView2, str);
                }
                Browser.openUrl(webView2.getContext(), str);
                return true;
            }
        });
        addView(this.webView, LayoutHelper.createFrame(-1, -1, 51));
        View view2 = new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                PhotoViewerWebView.this.drawBlackBackground(canvas, getMeasuredWidth(), getMeasuredHeight());
            }
        };
        this.progressBarBlackBackground = view2;
        view2.setBackgroundColor(-16777216);
        this.progressBarBlackBackground.setVisibility(4);
        addView(this.progressBarBlackBackground, LayoutHelper.createFrame(-1, -1.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressBar = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(this.progressBar, LayoutHelper.createFrame(-2, -2, 17));
    }

    private void runJsCode(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.webView.evaluateJavascript(str, null);
            return;
        }
        try {
            WebView webView = this.webView;
            webView.loadUrl("javascript:" + str);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.webView.getParent() == this) {
            TLRPC$WebPage tLRPC$WebPage = this.currentWebpage;
            int i3 = tLRPC$WebPage.embed_width;
            int i4 = 100;
            if (i3 == 0) {
                i3 = 100;
            }
            int i5 = tLRPC$WebPage.embed_height;
            if (i5 != 0) {
                i4 = i5;
            }
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float f = i3;
            float f2 = i4;
            float min = Math.min(size / f, size2 / f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.webView.getLayoutParams();
            int i6 = (int) (f * min);
            layoutParams.width = i6;
            int i7 = (int) (f2 * min);
            layoutParams.height = i7;
            layoutParams.topMargin = (size2 - i7) / 2;
            layoutParams.leftMargin = (size - i6) / 2;
        }
        super.onMeasure(i, i2);
    }

    public boolean isLoaded() {
        return this.progressBar.getVisibility() != 0;
    }

    public boolean openInPip() {
        boolean z = this.isYouTube && "inapp".equals(MessagesController.getInstance(this.currentAccount).youtubePipType);
        if ((!z && !checkInlinePermissions()) || this.progressBar.getVisibility() == 0) {
            return false;
        }
        if (PipVideoOverlay.isVisible()) {
            PipVideoOverlay.dismiss();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewerWebView.this.openInPip();
                }
            }, 300L);
            return true;
        }
        WebView webView = this.webView;
        TLRPC$WebPage tLRPC$WebPage = this.currentWebpage;
        if (PipVideoOverlay.show(z, (Activity) getContext(), webView, tLRPC$WebPage.embed_width, tLRPC$WebPage.embed_height)) {
            PipVideoOverlay.setPhotoViewer(PhotoViewer.getInstance());
        }
        return true;
    }

    public void setPlaybackSpeed(float f) {
        this.playbackSpeed = f;
        if (this.progressBar.getVisibility() == 0) {
            this.setPlaybackSpeed = true;
        } else if (this.isYouTube) {
            runJsCode("setPlaybackSpeed(" + f + ");");
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void init(int i, TLRPC$WebPage tLRPC$WebPage) {
        int intValue;
        this.currentWebpage = tLRPC$WebPage;
        String youTubeVideoId = WebPlayerView.getYouTubeVideoId(tLRPC$WebPage.embed_url);
        String str = tLRPC$WebPage.url;
        requestLayout();
        try {
            if (youTubeVideoId != null) {
                this.progressBarBlackBackground.setVisibility(0);
                this.isYouTube = true;
                String str2 = null;
                if (Build.VERSION.SDK_INT >= 17) {
                    this.webView.addJavascriptInterface(new YoutubeProxy(), "YoutubeProxy");
                }
                if (str != null) {
                    try {
                        Uri parse = Uri.parse(str);
                        if (i > 0) {
                            str2 = "" + i;
                        }
                        if (str2 == null && (str2 = parse.getQueryParameter("t")) == null) {
                            str2 = parse.getQueryParameter("time_continue");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (str2 != null) {
                        if (str2.contains("m")) {
                            String[] split = str2.split("m");
                            intValue = (Utilities.parseInt(split[0]).intValue() * 60) + Utilities.parseInt(split[1]).intValue();
                        } else {
                            intValue = Utilities.parseInt(str2).intValue();
                        }
                        this.webView.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function setPlaybackSpeed(speed) {        player.setPlaybackRate(speed);    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youTubeVideoId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                    }
                }
                intValue = 0;
                this.webView.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function setPlaybackSpeed(speed) {        player.setPlaybackRate(speed);    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youTubeVideoId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("Referer", "messenger.telegram.org");
                this.webView.loadUrl(tLRPC$WebPage.embed_url, hashMap);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.pipItem.setEnabled(false);
        this.pipItem.setAlpha(0.5f);
        this.progressBar.setVisibility(0);
        if (youTubeVideoId != null) {
            this.progressBarBlackBackground.setVisibility(0);
        }
        this.webView.setVisibility(0);
        this.webView.setKeepScreenOn(true);
        if (youTubeVideoId != null && "disabled".equals(MessagesController.getInstance(this.currentAccount).youtubePipType)) {
            this.pipItem.setVisibility(8);
        }
    }

    public boolean checkInlinePermissions() {
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(getContext())) {
            return true;
        }
        AlertsCreator.createDrawOverlayPermissionDialog((Activity) getContext(), null);
        return false;
    }

    public void exitFromPip() {
        if (this.webView != null) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            ViewGroup viewGroup = (ViewGroup) this.webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.webView);
            }
            addView(this.webView, 0, LayoutHelper.createFrame(-1, -1, 51));
            PipVideoOverlay.dismiss();
        }
    }

    public void release() {
        this.webView.stopLoading();
        this.webView.loadUrl("about:blank");
        this.webView.destroy();
    }
}
