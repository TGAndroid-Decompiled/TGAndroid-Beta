package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.PhotoViewer;

public abstract class PhotoViewerWebView extends FrameLayout {
    private float bufferedPosition;
    private int currentAccount;
    private int currentPosition;
    private TLRPC.WebPage currentWebpage;
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
    private List youtubeStoryboards;
    private String youtubeStoryboardsSpecUrl;

    protected abstract void drawBlackBackground(Canvas canvas, int i, int i2);

    public void hideControls() {
    }

    protected abstract void processTouch(MotionEvent motionEvent);

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

    class YoutubeProxy {
        private YoutubeProxy() {
        }

        @JavascriptInterface
        public void onPlayerLoaded() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPlayerLoaded$0();
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
            final int i = Integer.parseInt(str);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPlayerError$2(i);
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
                PhotoViewerWebView.this.errorMessage.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            }
            if (i != 5) {
                if (i != 150) {
                    if (i == 100) {
                        PhotoViewerWebView.this.errorMessage.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                        return;
                    } else if (i != 101) {
                        return;
                    }
                }
                PhotoViewerWebView.this.errorMessage.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                PhotoViewerWebView.this.errorButton.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                PhotoViewerWebView.this.errorButton.setVisibility(0);
                PhotoViewerWebView.this.errorButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$onPlayerError$1(view);
                    }
                });
                return;
            }
            PhotoViewerWebView.this.errorMessage.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
        }

        public void lambda$onPlayerError$1(View view) {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(PhotoViewerWebView.this.currentWebpage.url)));
        }

        @JavascriptInterface
        public void onPlayerStateChange(String str) {
            int i = Integer.parseInt(str);
            boolean z = PhotoViewerWebView.this.isPlaying;
            final boolean z2 = false;
            final int i2 = 1;
            PhotoViewerWebView.this.isPlaying = i == 1 || i == 3;
            PhotoViewerWebView.this.checkPlayingPoll(z);
            if (i != 0) {
                if (i == 1) {
                    z2 = true;
                } else if (i != 2) {
                    if (i == 3) {
                        z2 = true;
                        i2 = 2;
                    }
                }
                i2 = 3;
            } else {
                i2 = 4;
            }
            if (i2 == 3 && PhotoViewerWebView.this.progressBarBlackBackground.getVisibility() != 4) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onPlayerStateChange$3();
                    }
                }, 300L);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPlayerStateChange$4(z2, i2);
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

    public PhotoViewerWebView(PhotoViewer photoViewer, final Context context, View view) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.youtubeStoryboards = new ArrayList();
        this.progressRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
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

            @Override
            protected void onAttachedToWindow() {
                AndroidUtilities.checkAndroidTheme(context, true);
                super.onAttachedToWindow();
            }

            @Override
            protected void onDetachedFromWindow() {
                AndroidUtilities.checkAndroidTheme(context, false);
                super.onDetachedFromWindow();
            }
        };
        this.webView = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.webView.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
        this.webView.setWebViewClient(new AnonymousClass2());
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
        this.errorMessage.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        this.errorMessage.setGravity(17);
        this.errorLayout.addView(this.errorMessage, LayoutHelper.createLinear(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.errorButton = textView2;
        textView2.setTextSize(1, 16.0f);
        TextView textView3 = this.errorButton;
        int i = Theme.key_windowBackgroundWhiteBlueText;
        textView3.setTextColor(Theme.getColor(i));
        this.errorButton.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.errorButton.setBackground(Theme.AdaptiveRipple.rectByKey(i, 12.0f));
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

    class AnonymousClass2 extends WebViewClient {
        AnonymousClass2() {
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (PhotoViewerWebView.this.isYouTube) {
                return;
            }
            PhotoViewerWebView.this.progressBar.setVisibility(4);
            PhotoViewerWebView.this.progressBarBlackBackground.setVisibility(4);
            PhotoViewerWebView.this.pipItem.setEnabled(true);
            PhotoViewerWebView.this.pipItem.setAlpha(1.0f);
        }

        @Override
        public WebResourceResponse shouldInterceptRequest(WebView webView, final WebResourceRequest webResourceRequest) {
            final String string = webResourceRequest.getUrl().toString();
            if (!PhotoViewerWebView.this.isYouTube || !string.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                return null;
            }
            Utilities.externalNetworkQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$shouldInterceptRequest$0(string, webResourceRequest);
                }
            });
            return null;
        }

        public void lambda$shouldInterceptRequest$0(String str, WebResourceRequest webResourceRequest) {
            JSONObject jSONObjectOptJSONObject;
            String strOptString;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("POST");
                for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + PhotoViewerWebView.this.currentYoutubeId).put("platform", "DESKTOP"))).put("videoId", PhotoViewerWebView.this.currentYoutubeId).toString().getBytes("UTF-8"));
                outputStream.close();
                InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                byte[] bArr = new byte[10240];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                }
                byteArrayOutputStream.close();
                inputStream.close();
                JSONObject jSONObjectOptJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (strOptString = jSONObjectOptJSONObject.optString("spec")) == null) {
                    return;
                }
                if (PhotoViewerWebView.this.videoDuration == 0) {
                    PhotoViewerWebView.this.youtubeStoryboardsSpecUrl = strOptString;
                } else {
                    PhotoViewerWebView.this.processYoutubeStoryboards(strOptString);
                }
            } catch (Exception e) {
                FileLog.e(e);
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
        double dCeil;
        int videoDuration = getVideoDuration() / 1000;
        this.youtubeStoryboards.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        String str3 = strArrSplit[0].split("\\$")[0] + "2/";
        String str4 = strArrSplit[0].split("\\$N")[1];
        if (strArrSplit.length == 3) {
            str2 = strArrSplit[2].split("M#")[1];
        } else if (strArrSplit.length == 2) {
            str2 = strArrSplit[1].split("t#")[1];
        } else {
            str2 = strArrSplit[3].split("M#")[1];
        }
        if (videoDuration <= 100) {
            dCeil = Math.ceil(videoDuration / 25.0f);
        } else if (videoDuration <= 250) {
            dCeil = Math.ceil((videoDuration / 2.0f) / 25.0f);
        } else if (videoDuration <= 500) {
            dCeil = Math.ceil((videoDuration / 4.0f) / 25.0f);
        } else if (videoDuration <= 1000) {
            dCeil = Math.ceil((videoDuration / 5.0f) / 25.0f);
        } else {
            dCeil = Math.ceil((videoDuration / 10.0f) / 25.0f);
        }
        int i = (int) dCeil;
        for (int i2 = 0; i2 < i; i2++) {
            this.youtubeStoryboards.add(String.format(Locale.ROOT, "%sM%d%s&sigh=%s", str3, Integer.valueOf(i2), str4, str2));
        }
    }

    public int getYoutubeStoryboardImageCount(int i) {
        double dCeil;
        int iIndexOf = this.youtubeStoryboards.indexOf(getYoutubeStoryboard(i));
        if (iIndexOf == -1) {
            return 0;
        }
        if (iIndexOf != this.youtubeStoryboards.size() - 1) {
            return 25;
        }
        int videoDuration = getVideoDuration() / 1000;
        if (videoDuration <= 100) {
            dCeil = Math.ceil(videoDuration);
        } else if (videoDuration <= 250) {
            dCeil = Math.ceil(videoDuration / 2.0f);
        } else if (videoDuration <= 500) {
            dCeil = Math.ceil(videoDuration / 4.0f);
        } else if (videoDuration <= 1000) {
            dCeil = Math.ceil(videoDuration / 5.0f);
        } else {
            dCeil = Math.ceil(videoDuration / 10.0f);
        }
        return Math.min(25, (((int) dCeil) - ((this.youtubeStoryboards.size() - 1) * 25)) + 1);
    }

    public String getYoutubeStoryboard(int i) {
        float f;
        int i2;
        int videoDuration = getVideoDuration() / 1000;
        if (videoDuration > 100) {
            if (videoDuration <= 250) {
                i2 = ((int) (i / 2.0f)) / 25;
            } else if (videoDuration <= 500) {
                i2 = ((int) (i / 4.0f)) / 25;
            } else if (videoDuration <= 1000) {
                i2 = ((int) (i / 5.0f)) / 25;
            } else {
                f = i / 10.0f;
            }
            if (i2 < this.youtubeStoryboards.size()) {
                return (String) this.youtubeStoryboards.get(i2);
            }
            return null;
        }
        f = i;
        i2 = (int) (f / 25.0f);
        if (i2 < this.youtubeStoryboards.size()) {
            return (String) this.youtubeStoryboards.get(i2);
        }
        return null;
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
        } else {
            if (!z || this.isPlaying) {
                return;
            }
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
                    this.f$0.lambda$seekTo$1(j, z);
                }
            }, 100L);
            return;
        }
        runJsCode("seekTo(" + Math.round(j / 1000.0f) + ", " + z + ");");
    }

    public void lambda$seekTo$1(long j, boolean z) {
        runJsCode("seekTo(" + Math.round(j / 1000.0f) + ", " + z + ");");
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.playVideo();
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
        this.webView.evaluateJavascript(str, null);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.webView.getParent() == this) {
            TLRPC.WebPage webPage = this.currentWebpage;
            int i3 = webPage.embed_width;
            if (i3 == 0) {
                i3 = 100;
            }
            int i4 = webPage.embed_height;
            int i5 = i4 != 0 ? i4 : 100;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float f = i3;
            float f2 = i5;
            float fMin = Math.min(size / f, size2 / f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.webView.getLayoutParams();
            int i6 = (int) (f * fMin);
            layoutParams.width = i6;
            int i7 = (int) (f2 * fMin);
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
        boolean zIsInAppOnly = isInAppOnly();
        if ((!zIsInAppOnly && !checkInlinePermissions()) || this.progressBar.getVisibility() == 0) {
            return false;
        }
        if (PipVideoOverlay.isVisible()) {
            PipVideoOverlay.dismiss();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.openInPip();
                }
            }, 300L);
            return true;
        }
        this.progressBarBlackBackground.setVisibility(0);
        Activity activity = (Activity) getContext();
        WebView webView = this.webView;
        TLRPC.WebPage webPage = this.currentWebpage;
        if (PipVideoOverlay.show(zIsInAppOnly, activity, this, webView, webPage.embed_width, webPage.embed_height, false)) {
            PipVideoOverlay.setPhotoViewer(PhotoViewer.getInstance());
        }
        return true;
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

    public void init(int i, TLRPC.WebPage webPage) {
        int iIntValue;
        this.currentWebpage = webPage;
        this.currentYoutubeId = WebPlayerView.getYouTubeVideoId(webPage.embed_url);
        String str = webPage.url;
        requestLayout();
        try {
            if (this.currentYoutubeId != null) {
                this.progressBarBlackBackground.setVisibility(0);
                this.isYouTube = true;
                String queryParameter = null;
                this.webView.addJavascriptInterface(new YoutubeProxy(), "YoutubeProxy");
                if (str != null) {
                    try {
                        Uri uri = Uri.parse(str);
                        if (i > 0) {
                            queryParameter = "" + i;
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else {
                    iIntValue = 0;
                }
                InputStream inputStreamOpen = getContext().getAssets().open("youtube_embed.html");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[10240];
                while (true) {
                    int i2 = inputStreamOpen.read(bArr);
                    if (i2 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }
                byteArrayOutputStream.close();
                inputStreamOpen.close();
                this.webView.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, byteArrayOutputStream.toString("UTF-8"), this.currentYoutubeId, Integer.valueOf(iIntValue)), "text/html", "UTF-8", "https://youtube.com");
            } else {
                HashMap map = new HashMap();
                map.put("Referer", "messenger.telegram.org");
                this.webView.loadUrl(webPage.embed_url, map);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.pipItem.setEnabled(false);
        this.pipItem.setAlpha(0.5f);
        this.progressBar.setVisibility(0);
        if (this.currentYoutubeId != null) {
            this.progressBarBlackBackground.setVisibility(0);
        }
        this.webView.setVisibility(0);
        this.webView.setKeepScreenOn(true);
        if (this.currentYoutubeId == null || !"disabled".equals(MessagesController.getInstance(this.currentAccount).youtubePipType)) {
            return;
        }
        this.pipItem.setVisibility(8);
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
                getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th) {
                FileLog.e(th);
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
