package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.PhotoViewerWebView;
import org.telegram.p009ui.PhotoViewer;
import org.telegram.tgnet.TLRPC$WebPage;

public class PhotoViewerWebView extends FrameLayout {
    private float bufferedPosition;
    private int currentAccount;
    private int currentPosition;
    private TLRPC$WebPage currentWebpage;
    private String currentYoutubeId;
    private TextView errorButton;
    private LinearLayout errorLayout;
    private TextView errorMessage;
    private boolean isPlaying;
    private boolean isTouchDisabled;
    private boolean isYouTube;
    private PhotoViewer photoViewer;
    private View pipItem;
    private float playbackSpeed;
    private RadialProgressView progressBar;
    private View progressBarBlackBackground;
    private Runnable progressRunnable;
    private boolean setPlaybackSpeed;
    private int videoDuration;
    private WebView webView;
    private List<String> youtubeStoryboards;
    private String youtubeStoryboardsSpecUrl;

    protected void drawBlackBackground(Canvas canvas, int i, int i2) {
    }

    public void hideControls() {
    }

    protected void processTouch(MotionEvent motionEvent) {
    }

    public void showControls() {
    }

    public void lambda$new$0() {
        if (this.isYouTube) {
            runJsCode("pollPosition();");
        }
        if (this.isPlaying) {
            AndroidUtilities.runOnUIThread(this.progressRunnable, 500L);
        }
    }

    public class YoutubeProxy {
        private YoutubeProxy() {
            PhotoViewerWebView.this = r1;
        }

        @JavascriptInterface
        public void onPlayerLoaded() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewerWebView.YoutubeProxy.this.lambda$onPlayerLoaded$0();
                }
            });
        }

        public void lambda$onPlayerLoaded$0() {
            PhotoViewerWebView.this.progressBar.setVisibility(4);
            if (PhotoViewerWebView.this.setPlaybackSpeed) {
                PhotoViewerWebView.this.setPlaybackSpeed = false;
                PhotoViewerWebView photoViewerWebView = PhotoViewerWebView.this;
                photoViewerWebView.setPlaybackSpeed(photoViewerWebView.playbackSpeed);
            }
            PhotoViewerWebView.this.pipItem.setEnabled(true);
            PhotoViewerWebView.this.pipItem.setAlpha(1.0f);
            if (PhotoViewerWebView.this.photoViewer != null) {
                PhotoViewerWebView.this.photoViewer.checkFullscreenButton();
            }
        }

        @JavascriptInterface
        public void onPlayerError(String str) {
            final int parseInt = Integer.parseInt(str);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewerWebView.YoutubeProxy.this.lambda$onPlayerError$2(parseInt);
                }
            });
        }

        public void lambda$onPlayerError$2(int i) {
            PhotoViewerWebView.this.errorButton.setVisibility(8);
            PhotoViewerWebView.this.webView.setVisibility(8);
            if (PhotoViewerWebView.this.errorLayout.getVisibility() == 8) {
                PhotoViewerWebView.this.errorLayout.setVisibility(0);
                PhotoViewerWebView.this.errorLayout.animate().cancel();
                PhotoViewerWebView.this.errorLayout.animate().alpha(1.0f).setDuration(150L).start();
            }
            if (PhotoViewerWebView.this.progressBar.getAlpha() == 1.0f) {
                PhotoViewerWebView.this.progressBar.animate().cancel();
                PhotoViewerWebView.this.progressBar.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewerWebView.this.progressBar.setVisibility(8);
                    }
                });
            }
            if (PhotoViewerWebView.this.progressBarBlackBackground.getAlpha() == 1.0f) {
                PhotoViewerWebView.this.progressBarBlackBackground.animate().cancel();
                PhotoViewerWebView.this.progressBarBlackBackground.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewerWebView.this.progressBarBlackBackground.setVisibility(8);
                    }
                });
            }
            if (i == 2) {
                PhotoViewerWebView.this.errorMessage.setText(LocaleController.getString(C1072R.string.YouTubeVideoErrorInvalid));
            } else if (i != 5) {
                if (i != 150) {
                    if (i == 100) {
                        PhotoViewerWebView.this.errorMessage.setText(LocaleController.getString(C1072R.string.YouTubeVideoErrorNotFound));
                        return;
                    } else if (i != 101) {
                        return;
                    }
                }
                PhotoViewerWebView.this.errorMessage.setText(LocaleController.getString(C1072R.string.YouTubeVideoErrorNotAvailableInApp));
                PhotoViewerWebView.this.errorButton.setText(LocaleController.getString(C1072R.string.YouTubeVideoErrorOpenExternal));
                PhotoViewerWebView.this.errorButton.setVisibility(0);
                PhotoViewerWebView.this.errorButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PhotoViewerWebView.YoutubeProxy.this.lambda$onPlayerError$1(view);
                    }
                });
            } else {
                PhotoViewerWebView.this.errorMessage.setText(LocaleController.getString(C1072R.string.YouTubeVideoErrorHTML));
            }
        }

        public void lambda$onPlayerError$1(View view) {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(PhotoViewerWebView.this.currentWebpage.url)));
        }

        @JavascriptInterface
        public void onPlayerStateChange(String str) {
            int parseInt = Integer.parseInt(str);
            boolean z = PhotoViewerWebView.this.isPlaying;
            final boolean z2 = false;
            final int i = 1;
            PhotoViewerWebView.this.isPlaying = parseInt == 1 || parseInt == 3;
            PhotoViewerWebView.this.checkPlayingPoll(z);
            if (parseInt != 0) {
                if (parseInt == 1) {
                    z2 = true;
                } else if (parseInt != 2) {
                    if (parseInt == 3) {
                        z2 = true;
                        i = 2;
                    }
                }
                i = 3;
            } else {
                i = 4;
            }
            if (i == 3 && PhotoViewerWebView.this.progressBarBlackBackground.getVisibility() != 4) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewerWebView.YoutubeProxy.this.lambda$onPlayerStateChange$3();
                    }
                }, 300L);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewerWebView.YoutubeProxy.this.lambda$onPlayerStateChange$4(z2, i);
                }
            });
        }

        public void lambda$onPlayerStateChange$3() {
            PhotoViewerWebView.this.progressBarBlackBackground.setVisibility(4);
        }

        public void lambda$onPlayerStateChange$4(boolean z, int i) {
            PhotoViewerWebView.this.photoViewer.updateWebPlayerState(z, i);
        }

        @JavascriptInterface
        public void onPlayerNotifyDuration(int i) {
            PhotoViewerWebView.this.videoDuration = i * 1000;
            if (PhotoViewerWebView.this.youtubeStoryboardsSpecUrl != null) {
                PhotoViewerWebView photoViewerWebView = PhotoViewerWebView.this;
                photoViewerWebView.processYoutubeStoryboards(photoViewerWebView.youtubeStoryboardsSpecUrl);
                PhotoViewerWebView.this.youtubeStoryboardsSpecUrl = null;
            }
        }

        @JavascriptInterface
        public void onPlayerNotifyCurrentPosition(int i) {
            PhotoViewerWebView.this.currentPosition = i * 1000;
        }

        @JavascriptInterface
        public void onPlayerNotifyBufferedPosition(float f) {
            PhotoViewerWebView.this.bufferedPosition = f;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public PhotoViewerWebView(PhotoViewer photoViewer, Context context, View view) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.youtubeStoryboards = new ArrayList();
        this.progressRunnable = new Runnable() {
            @Override
            public final void run() {
                PhotoViewerWebView.this.lambda$new$0();
            }
        };
        this.photoViewer = photoViewer;
        this.pipItem = view;
        WebView webView = new WebView(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                PhotoViewerWebView.this.processTouch(motionEvent);
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
                if (PipVideoOverlay.getInnerView() == this && PhotoViewerWebView.this.progressBarBlackBackground.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    PhotoViewerWebView.this.drawBlackBackground(canvas, getWidth(), getHeight());
                }
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
        this.webView.setWebViewClient(new C25612());
        addView(this.webView, LayoutHelper.createFrame(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.errorLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.errorLayout.setGravity(17);
        this.errorLayout.setVisibility(8);
        addView(this.errorLayout, LayoutHelper.createFrame(-2, -2, 17));
        TextView textView = new TextView(context);
        this.errorMessage = textView;
        textView.setTextSize(1, 16.0f);
        this.errorMessage.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.errorMessage.setGravity(17);
        this.errorLayout.addView(this.errorMessage, LayoutHelper.createLinear(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.errorButton = textView2;
        textView2.setTextSize(1, 16.0f);
        this.errorButton.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText"));
        this.errorButton.setPadding(AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(8.0f));
        this.errorButton.setBackground(Theme.AdaptiveRipple.rect("windowBackgroundWhiteBlueText", 12.0f));
        this.errorButton.setVisibility(8);
        this.errorLayout.addView(this.errorButton, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
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

    public class C25612 extends WebViewClient {
        C25612() {
            PhotoViewerWebView.this = r1;
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!PhotoViewerWebView.this.isYouTube || Build.VERSION.SDK_INT < 17) {
                PhotoViewerWebView.this.progressBar.setVisibility(4);
                PhotoViewerWebView.this.progressBarBlackBackground.setVisibility(4);
                PhotoViewerWebView.this.pipItem.setEnabled(true);
                PhotoViewerWebView.this.pipItem.setAlpha(1.0f);
            }
        }

        @Override
        public WebResourceResponse shouldInterceptRequest(WebView webView, final WebResourceRequest webResourceRequest) {
            final String uri = webResourceRequest.getUrl().toString();
            if (PhotoViewerWebView.this.isYouTube && uri.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                Utilities.externalNetworkQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewerWebView.C25612.this.lambda$shouldInterceptRequest$0(uri, webResourceRequest);
                    }
                });
                return null;
            }
            return null;
        }

        public void lambda$shouldInterceptRequest$0(String str, WebResourceRequest webResourceRequest) {
            JSONObject optJSONObject;
            String optString;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("POST");
                for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject put = new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0");
                outputStream.write(jSONObject.put("context", jSONObject2.put("client", put.put("originalUrl", "https://www.youtube.com/watch?v=" + PhotoViewerWebView.this.currentYoutubeId).put("platform", "DESKTOP"))).put("videoId", PhotoViewerWebView.this.currentYoutubeId).toString().getBytes("UTF-8"));
                outputStream.close();
                InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                byte[] bArr = new byte[10240];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.close();
                inputStream.close();
                JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (optString = optJSONObject.optString("spec")) == null) {
                    return;
                }
                if (PhotoViewerWebView.this.videoDuration == 0) {
                    PhotoViewerWebView.this.youtubeStoryboardsSpecUrl = optString;
                } else {
                    PhotoViewerWebView.this.processYoutubeStoryboards(optString);
                }
            } catch (Exception e) {
                FileLog.m31e(e);
            }
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (PhotoViewerWebView.this.isYouTube) {
                Browser.openUrl(webView.getContext(), str);
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public boolean hasYoutubeStoryboards() {
        return !this.youtubeStoryboards.isEmpty();
    }

    public void processYoutubeStoryboards(String str) {
        String str2;
        double ceil;
        int videoDuration = getVideoDuration() / 1000;
        this.youtubeStoryboards.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] split = str.split("\\|");
        String str3 = split[0].split("\\$")[0] + "2/";
        String str4 = split[0].split("\\$N")[1];
        if (split.length == 3) {
            str2 = split[2].split("M#")[1];
        } else if (split.length == 2) {
            str2 = split[1].split("t#")[1];
        } else {
            str2 = split[3].split("M#")[1];
        }
        if (videoDuration <= 100) {
            ceil = Math.ceil(videoDuration / 25.0f);
        } else if (videoDuration <= 250) {
            ceil = Math.ceil((videoDuration / 2.0f) / 25.0f);
        } else if (videoDuration <= 500) {
            ceil = Math.ceil((videoDuration / 4.0f) / 25.0f);
        } else if (videoDuration <= 1000) {
            ceil = Math.ceil((videoDuration / 5.0f) / 25.0f);
        } else {
            ceil = Math.ceil((videoDuration / 10.0f) / 25.0f);
        }
        int i = (int) ceil;
        for (int i2 = 0; i2 < i; i2++) {
            this.youtubeStoryboards.add(String.format(Locale.ROOT, "%sM%d%s&sigh=%s", str3, Integer.valueOf(i2), str4, str2));
        }
    }

    public int getYoutubeStoryboardImageCount(int i) {
        double ceil;
        int indexOf = this.youtubeStoryboards.indexOf(getYoutubeStoryboard(i));
        if (indexOf != -1) {
            if (indexOf == this.youtubeStoryboards.size() - 1) {
                int videoDuration = getVideoDuration() / 1000;
                if (videoDuration <= 100) {
                    ceil = Math.ceil(videoDuration);
                } else if (videoDuration <= 250) {
                    ceil = Math.ceil(videoDuration / 2.0f);
                } else if (videoDuration <= 500) {
                    ceil = Math.ceil(videoDuration / 4.0f);
                } else if (videoDuration <= 1000) {
                    ceil = Math.ceil(videoDuration / 5.0f);
                } else {
                    ceil = Math.ceil(videoDuration / 10.0f);
                }
                return Math.min(25, (((int) ceil) - ((this.youtubeStoryboards.size() - 1) * 25)) + 1);
            }
            return 25;
        }
        return 0;
    }

    public java.lang.String getYoutubeStoryboard(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.PhotoViewerWebView.getYoutubeStoryboard(int):java.lang.String");
    }

    public int getYoutubeStoryboardImageIndex(int i) {
        int videoDuration = getVideoDuration() / 1000;
        if (videoDuration <= 100) {
            return ((int) Math.ceil(i)) % 25;
        }
        if (videoDuration <= 250) {
            return ((int) Math.ceil(i / 2.0f)) % 25;
        }
        if (videoDuration <= 500) {
            return ((int) Math.ceil(i / 4.0f)) % 25;
        }
        if (videoDuration <= 1000) {
            return ((int) Math.ceil(i / 5.0f)) % 25;
        }
        return ((int) Math.ceil(i / 10.0f)) % 25;
    }

    public void setTouchDisabled(boolean z) {
        this.isTouchDisabled = z;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.isTouchDisabled) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public WebView getWebView() {
        return this.webView;
    }

    public void checkPlayingPoll(boolean z) {
        if (!z && this.isPlaying) {
            AndroidUtilities.runOnUIThread(this.progressRunnable, 500L);
        } else if (!z || this.isPlaying) {
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.progressRunnable);
        }
    }

    public void seekTo(long j) {
        seekTo(j, true);
    }

    public void seekTo(final long j, final boolean z) {
        boolean z2 = this.isPlaying;
        this.currentPosition = (int) j;
        if (z2) {
            pauseVideo();
        }
        if (z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewerWebView.this.lambda$seekTo$1(j, z);
                }
            }, 100L);
            return;
        }
        runJsCode("seekTo(" + Math.round(((float) j) / 1000.0f) + ", " + z + ");");
    }

    public void lambda$seekTo$1(long j, boolean z) {
        runJsCode("seekTo(" + Math.round(((float) j) / 1000.0f) + ", " + z + ");");
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PhotoViewerWebView.this.playVideo();
            }
        }, 100L);
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public float getBufferedPosition() {
        return this.bufferedPosition;
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
            FileLog.m31e(e);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.webView.getParent() == this) {
            TLRPC$WebPage tLRPC$WebPage = this.currentWebpage;
            int i3 = tLRPC$WebPage.embed_width;
            if (i3 == 0) {
                i3 = 100;
            }
            int i4 = tLRPC$WebPage.embed_height;
            int i5 = i4 != 0 ? i4 : 100;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float f = i3;
            float f2 = i5;
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

    public boolean isInAppOnly() {
        return this.isYouTube && "inapp".equals(MessagesController.getInstance(this.currentAccount).youtubePipType);
    }

    public boolean openInPip() {
        boolean isInAppOnly = isInAppOnly();
        if ((isInAppOnly || checkInlinePermissions()) && this.progressBar.getVisibility() != 0) {
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
            this.progressBarBlackBackground.setVisibility(0);
            WebView webView = this.webView;
            TLRPC$WebPage tLRPC$WebPage = this.currentWebpage;
            if (PipVideoOverlay.show(isInAppOnly, (Activity) getContext(), this, webView, tLRPC$WebPage.embed_width, tLRPC$WebPage.embed_height, false)) {
                PipVideoOverlay.setPhotoViewer(PhotoViewer.getInstance());
            }
            return true;
        }
        return false;
    }

    public boolean isYouTube() {
        return this.isYouTube;
    }

    public boolean isControllable() {
        return isYouTube();
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public void playVideo() {
        if (this.isPlaying || !isControllable()) {
            return;
        }
        runJsCode("playVideo();");
        this.isPlaying = true;
        checkPlayingPoll(false);
    }

    public void pauseVideo() {
        if (this.isPlaying && isControllable()) {
            runJsCode("pauseVideo();");
            this.isPlaying = false;
            checkPlayingPoll(true);
        }
    }

    public void setPlaybackSpeed(float f) {
        this.playbackSpeed = f;
        if (this.progressBar.getVisibility() != 0) {
            if (this.isYouTube) {
                runJsCode("setPlaybackSpeed(" + f + ");");
                return;
            }
            return;
        }
        this.setPlaybackSpeed = true;
    }

    @android.annotation.SuppressLint({"AddJavascriptInterface"})
    public void init(int r11, org.telegram.tgnet.TLRPC$WebPage r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.PhotoViewerWebView.init(int, org.telegram.tgnet.TLRPC$WebPage):void");
    }

    public boolean checkInlinePermissions() {
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(getContext())) {
            return true;
        }
        AlertsCreator.createDrawOverlayPermissionDialog((Activity) getContext(), null);
        return false;
    }

    public void exitFromPip() {
        if (this.webView == null) {
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th) {
                FileLog.m31e(th);
            }
        }
        this.progressBarBlackBackground.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.webView);
        }
        addView(this.webView, 0, LayoutHelper.createFrame(-1, -1, 51));
        PipVideoOverlay.dismiss();
    }

    public void release() {
        this.webView.stopLoading();
        this.webView.loadUrl("about:blank");
        this.webView.destroy();
        this.videoDuration = 0;
        this.currentPosition = 0;
        AndroidUtilities.cancelRunOnUIThread(this.progressRunnable);
    }
}
