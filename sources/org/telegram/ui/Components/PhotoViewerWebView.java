package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.FilterCreateActivity$$ExternalSyntheticLambda27;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity;
import org.telegram.ui.WebviewActivity;

public abstract class PhotoViewerWebView extends FrameLayout {
    public float bufferedPosition;
    public final int currentAccount;
    public int currentPosition;
    public TLRPC.WebPage currentWebpage;
    public String currentYoutubeId;
    public final TextView errorButton;
    public final LinearLayout errorLayout;
    public final TextView errorMessage;
    public boolean isPlaying;
    public boolean isTouchDisabled;
    public boolean isYouTube;
    public final PhotoViewer photoViewer;
    public final ActionBarMenuSubItem pipItem;
    public float playbackSpeed;
    public final RadialProgressView progressBar;
    public final QrActivity.AnonymousClass2 progressBarBlackBackground;
    public final PasscodeView$9$$ExternalSyntheticLambda0 progressRunnable;
    public boolean setPlaybackSpeed;
    public int videoDuration;
    public final EmbedBottomSheet.AnonymousClass3 webView;
    public final ArrayList youtubeStoryboards;
    public String youtubeStoryboardsSpecUrl;

    public final class YoutubeProxy {
        public final PhotoViewer.AnonymousClass79 this$0;

        public YoutubeProxy(PhotoViewer.AnonymousClass79 anonymousClass79) {
            this.this$0 = anonymousClass79;
        }

        @JavascriptInterface
        public void onPlayerError(String str) {
            AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda74(this, Integer.parseInt(str), 29));
        }

        @JavascriptInterface
        public void onPlayerLoaded() {
            AndroidUtilities.runOnUIThread(new PhotoViewerWebView$YoutubeProxy$$ExternalSyntheticLambda1(this, 0));
        }

        @JavascriptInterface
        public void onPlayerNotifyBufferedPosition(float f) {
            this.this$0.bufferedPosition = f;
        }

        @JavascriptInterface
        public void onPlayerNotifyCurrentPosition(int i) {
            this.this$0.currentPosition = i * 1000;
        }

        @JavascriptInterface
        public void onPlayerNotifyDuration(int i) {
            PhotoViewer.AnonymousClass79 anonymousClass79 = this.this$0;
            anonymousClass79.videoDuration = i * 1000;
            String str = anonymousClass79.youtubeStoryboardsSpecUrl;
            if (str != null) {
                PhotoViewerWebView.access$500(anonymousClass79, str);
                anonymousClass79.youtubeStoryboardsSpecUrl = null;
            }
        }

        @JavascriptInterface
        public void onPlayerStateChange(String str) {
            int i = Integer.parseInt(str);
            PhotoViewer.AnonymousClass79 anonymousClass79 = this.this$0;
            boolean z = anonymousClass79.isPlaying;
            boolean z2 = false;
            int i2 = 1;
            anonymousClass79.isPlaying = i == 1 || i == 3;
            anonymousClass79.checkPlayingPoll(z);
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
            if (i2 == 3 && anonymousClass79.progressBarBlackBackground.getVisibility() != 4) {
                AndroidUtilities.runOnUIThread(new PhotoViewerWebView$YoutubeProxy$$ExternalSyntheticLambda1(this, 1), 300L);
            }
            AndroidUtilities.runOnUIThread(new FilterCreateActivity$$ExternalSyntheticLambda27(this, z2, i2, 1));
        }
    }

    public PhotoViewerWebView(PhotoViewer photoViewer, Context context, ActionBarMenuSubItem actionBarMenuSubItem) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.youtubeStoryboards = new ArrayList();
        this.progressRunnable = new PasscodeView$9$$ExternalSyntheticLambda0((PhotoViewer.AnonymousClass79) this, 9);
        this.photoViewer = photoViewer;
        this.pipItem = actionBarMenuSubItem;
        PhotoViewer.AnonymousClass79 anonymousClass79 = (PhotoViewer.AnonymousClass79) this;
        int i = 1;
        EmbedBottomSheet.AnonymousClass3 anonymousClass3 = new EmbedBottomSheet.AnonymousClass3(anonymousClass79, context, context, i);
        this.webView = anonymousClass3;
        anonymousClass3.getSettings().setJavaScriptEnabled(true);
        anonymousClass3.getSettings().setDomStorageEnabled(true);
        anonymousClass3.getSettings().setMediaPlaybackRequiresUserGesture(false);
        anonymousClass3.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(anonymousClass3, true);
        anonymousClass3.setWebViewClient(new WebviewActivity.AnonymousClass3(anonymousClass79, i));
        addView(anonymousClass3, LayoutHelper.createFrame(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.errorLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
        TextView textView = new TextView(context);
        this.errorMessage = textView;
        textView.setTextSize(1, 16.0f);
        zzkr.m(Theme.key_windowBackgroundWhiteGrayText, textView, 17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.errorButton = textView2;
        textView2.setTextSize(1, 16.0f);
        int i2 = Theme.key_windowBackgroundWhiteBlueText;
        textView2.setTextColor(Theme.getColor(null, i2, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i3 = Theme.AdaptiveRipple.defaultBackgroundColorKey;
        textView2.setBackground(Theme.AdaptiveRipple.createRect(new float[]{12.0f}, 0, Theme.AdaptiveRipple.calcRippleColor(Theme.getColor(null, i2, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(anonymousClass79, context, 12);
        this.progressBarBlackBackground = anonymousClass2;
        anonymousClass2.setBackgroundColor(-16777216);
        anonymousClass2.setVisibility(4);
        addView(anonymousClass2, LayoutHelper.createFrame(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.progressBar = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
    }

    public static void access$500(PhotoViewerWebView photoViewerWebView, String str) {
        double dCeil;
        int videoDuration = photoViewerWebView.getVideoDuration() / 1000;
        ArrayList arrayList = photoViewerWebView.youtubeStoryboards;
        arrayList.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        String strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), strArrSplit[0].split("\\$")[0], "2/");
        String str2 = strArrSplit[0].split("\\$N")[1];
        String str3 = strArrSplit.length == 3 ? strArrSplit[2].split("M#")[1] : strArrSplit.length == 2 ? strArrSplit[1].split("t#")[1] : strArrSplit[3].split("M#")[1];
        if (videoDuration <= 100) {
            dCeil = Math.ceil(videoDuration / 25.0f);
        } else if (videoDuration <= 250) {
            dCeil = Math.ceil((videoDuration / 2.0f) / 25.0f);
        } else if (videoDuration <= 500) {
            dCeil = Math.ceil((videoDuration / 4.0f) / 25.0f);
        } else {
            dCeil = videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f);
        }
        int i = (int) dCeil;
        for (int i2 = 0; i2 < i; i2++) {
            Locale locale = Locale.ROOT;
            arrayList.add(strM + "M" + i2 + str2 + "&sigh=" + str3);
        }
    }

    public final void checkPlayingPoll(boolean z) {
        PasscodeView$9$$ExternalSyntheticLambda0 passcodeView$9$$ExternalSyntheticLambda0 = this.progressRunnable;
        if (!z && this.isPlaying) {
            AndroidUtilities.runOnUIThread(passcodeView$9$$ExternalSyntheticLambda0, 500L);
        } else {
            if (!z || this.isPlaying) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(passcodeView$9$$ExternalSyntheticLambda0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.isTouchDisabled) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getBufferedPosition() {
        return this.bufferedPosition;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public final String getYoutubeStoryboard(int i) {
        float f;
        int i2;
        ArrayList arrayList;
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
            arrayList = this.youtubeStoryboards;
            if (i2 < arrayList.size()) {
                return (String) arrayList.get(i2);
            }
            return null;
        }
        f = i;
        i2 = (int) (f / 25.0f);
        arrayList = this.youtubeStoryboards;
        if (i2 < arrayList.size()) {
            return (String) arrayList.get(i2);
        }
        return null;
    }

    public final boolean isControllable() {
        return this.isYouTube;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        EmbedBottomSheet.AnonymousClass3 anonymousClass3 = this.webView;
        if (anonymousClass3.getParent() == this) {
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
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass3.getLayoutParams();
            int i6 = (int) (f * fMin);
            layoutParams.width = i6;
            int i7 = (int) (f2 * fMin);
            layoutParams.height = i7;
            layoutParams.topMargin = (size2 - i7) / 2;
            layoutParams.leftMargin = (size - i6) / 2;
        }
        super.onMeasure(i, i2);
    }

    public final boolean openInPip() {
        boolean z = this.isYouTube && "inapp".equals(MessagesController.getInstance(this.currentAccount).youtubePipType);
        if (!z && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            AlertsCreator.createDrawOverlayPermissionDialog((Activity) getContext(), null, false);
            return false;
        }
        if (this.progressBar.getVisibility() == 0) {
            return false;
        }
        PipVideoOverlay pipVideoOverlay = PipVideoOverlay.instance;
        if (pipVideoOverlay.isVisible) {
            PipVideoOverlay.dismiss();
            AndroidUtilities.runOnUIThread(new PhotoViewerWebView$$ExternalSyntheticLambda2(this, 0), 300L);
            return true;
        }
        this.progressBarBlackBackground.setVisibility(0);
        Activity activity = (Activity) getContext();
        TLRPC.WebPage webPage = this.currentWebpage;
        if (pipVideoOverlay.showInternal(z, activity, this.webView, this, webPage.embed_width, webPage.embed_height, false)) {
            PipVideoOverlay.setPhotoViewer(PhotoViewer.getInstance());
        }
        return true;
    }

    public final void pauseVideo() {
        if (this.isPlaying && this.isYouTube) {
            runJsCode("pauseVideo();");
            this.isPlaying = false;
            checkPlayingPoll(true);
        }
    }

    public final void playVideo() {
        if (this.isPlaying || !this.isYouTube) {
            return;
        }
        runJsCode("playVideo();");
        this.isPlaying = true;
        checkPlayingPoll(false);
    }

    public final void runJsCode(String str) {
        this.webView.evaluateJavascript(str, null);
    }

    public final void seekTo(long j) {
        boolean z = this.isPlaying;
        this.currentPosition = (int) j;
        if (z) {
            pauseVideo();
        }
        if (z) {
            AndroidUtilities.runOnUIThread(new LinkManager$3$$ExternalSyntheticLambda0(this, j, 12), 100L);
            return;
        }
        runJsCode("seekTo(" + Math.round(j / 1000.0f) + ", true);");
    }

    public void setPlaybackSpeed(float f) {
        this.playbackSpeed = f;
        if (this.progressBar.getVisibility() == 0) {
            this.setPlaybackSpeed = true;
        } else if (this.isYouTube) {
            runJsCode("setPlaybackSpeed(" + f + ");");
        }
    }

    public void setTouchDisabled(boolean z) {
        this.isTouchDisabled = z;
    }
}
