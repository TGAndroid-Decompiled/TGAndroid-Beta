package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

public final class EmbedBottomSheet extends BottomSheet {
    public static EmbedBottomSheet instance;
    public boolean animationInProgress;
    public final ChatActivity.AnonymousClass60 containerLayout;
    public final TextView copyTextButton;
    public View customView;
    public WebChromeClient.CustomViewCallback customViewCallback;
    public final String embedUrl;
    public final FrameLayout fullscreenVideoContainer;
    public boolean fullscreenedByButton;
    public final boolean hasDescription;
    public final int height;
    public final LinearLayout imageButtonsContainer;
    public boolean isYouTube;
    public final AnonymousClass1 onShowListener;
    public final String openUrl;
    public AnonymousClass9 orientationEventListener;
    public final Activity parentActivity;
    public final ImageView pipButton;
    public final int[] position;
    public int prevOrientation;
    public final RadialProgressView progressBar;
    public final View progressBarBlackBackground;
    public final int seekTimeOverride;
    public final WebPlayerView videoView;
    public int waitingForDraw;
    public boolean wasInLandscape;
    public final AnonymousClass3 webView;
    public final int width;

    public final class AnonymousClass1 implements DialogInterface.OnShowListener {
        public AnonymousClass1() {
        }

        @Override
        public final void onShow(DialogInterface dialogInterface) {
            if (PipVideoOverlay.instance.isVisible) {
                WebPlayerView webPlayerView = EmbedBottomSheet.this.videoView;
                if (webPlayerView.isInline || webPlayerView.switchingInlineMode) {
                    webPlayerView.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 3));
                }
            }
        }
    }

    public final class AnonymousClass3 extends WebView {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;
        public final Context val$context;

        public AnonymousClass3(KeyEvent.Callback callback, Context context, Context context2, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = callback;
            this.val$context = context2;
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    super.draw(canvas);
                    if (PipVideoOverlay.instance.innerView == this) {
                        PhotoViewer.AnonymousClass79 anonymousClass79 = (PhotoViewer.AnonymousClass79) this.this$0;
                        if (anonymousClass79.progressBarBlackBackground.getVisibility() == 0) {
                            canvas.drawColor(-16777216);
                            anonymousClass79.drawBlackBackground(canvas, getWidth(), getHeight());
                        }
                    }
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public final void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 0:
                    AndroidUtilities.checkAndroidTheme((Activity) this.val$context, true);
                    super.onAttachedToWindow();
                    break;
                default:
                    AndroidUtilities.checkAndroidTheme(this.val$context, true);
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 0:
                    AndroidUtilities.checkAndroidTheme((Activity) this.val$context, false);
                    super.onDetachedFromWindow();
                    break;
                default:
                    AndroidUtilities.checkAndroidTheme(this.val$context, false);
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                    if (zOnTouchEvent) {
                        int action = motionEvent.getAction();
                        EmbedBottomSheet embedBottomSheet = (EmbedBottomSheet) this.this$0;
                        if (action == 1) {
                            embedBottomSheet.setDisableScroll(false);
                        } else {
                            embedBottomSheet.setDisableScroll(true);
                        }
                    }
                    return zOnTouchEvent;
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }
    }

    public final class AnonymousClass5 extends WebViewClient {
        public AnonymousClass5() {
        }

        @Override
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
            if (embedBottomSheet.isYouTube) {
                return;
            }
            embedBottomSheet.progressBar.setVisibility(4);
            embedBottomSheet.progressBarBlackBackground.setVisibility(4);
            ImageView imageView = embedBottomSheet.pipButton;
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
        }

        @Override
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
            try {
                if (!AndroidUtilities.isSafeToShow(embedBottomSheet.getContext())) {
                    return true;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(embedBottomSheet.getContext(), 0, ((BottomSheet) embedBottomSheet).resourcesProvider);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = LocaleController.getString(R.string.ChromeCrashTitle);
                alertDialog.message = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new HintView$1$$ExternalSyntheticLambda0(this, 1));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                builder.show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        @Override
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!EmbedBottomSheet.this.isYouTube) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            Browser.openUrl(webView.getContext(), str);
            return true;
        }
    }

    public final class AnonymousClass6 implements WebPlayerView.WebPlayerViewDelegate {
        public AnonymousClass6() {
        }

        @Override
        public final boolean checkInlinePermissions() {
            Activity activity = EmbedBottomSheet.this.parentActivity;
            if (activity == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(activity)) {
                return true;
            }
            AlertsCreator.createDrawOverlayPermissionDialog(activity, null, false);
            return false;
        }

        @Override
        public final ViewGroup getTextureViewContainer() {
            return EmbedBottomSheet.this.container;
        }

        @Override
        public final void onInitFailed() {
            EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
            embedBottomSheet.webView.setVisibility(0);
            embedBottomSheet.imageButtonsContainer.setVisibility(0);
            embedBottomSheet.copyTextButton.setVisibility(4);
            embedBottomSheet.webView.setKeepScreenOn(true);
            embedBottomSheet.videoView.setVisibility(4);
            embedBottomSheet.videoView.getControlsView().setVisibility(4);
            embedBottomSheet.videoView.getTextureView().setVisibility(4);
            if (embedBottomSheet.videoView.getTextureImageView() != null) {
                embedBottomSheet.videoView.getTextureImageView().setVisibility(4);
            }
            embedBottomSheet.videoView.loadVideo(null, null, null, null, false);
            HashMap map = new HashMap();
            map.put("Referer", "messenger.telegram.org");
            try {
                embedBottomSheet.webView.loadUrl(embedBottomSheet.embedUrl, map);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final void onInlineSurfaceTextureReady() {
            EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
            WebPlayerView webPlayerView = embedBottomSheet.videoView;
            if (webPlayerView.isInline || webPlayerView.switchingInlineMode) {
                embedBottomSheet.dismissInternal();
            }
        }

        @Override
        public final void onPlayStateChanged(WebPlayerView webPlayerView, boolean z) {
            EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
            if (z) {
                try {
                    embedBottomSheet.parentActivity.getWindow().addFlags(128);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            try {
                embedBottomSheet.parentActivity.getWindow().clearFlags(128);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }

        @Override
        public final TextureView onSwitchInlineMode(View view, boolean z, int i, int i2, boolean z2) {
            EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
            if (z) {
                view.setTranslationY(0.0f);
                TextureView textureView = new TextureView(embedBottomSheet.parentActivity);
                PipVideoOverlay pipVideoOverlay = PipVideoOverlay.instance;
                if (!pipVideoOverlay.showInternal(false, embedBottomSheet.parentActivity, textureView, null, i, i2, false)) {
                    return null;
                }
                pipVideoOverlay.parentSheet = embedBottomSheet;
                return textureView;
            }
            if (!z2) {
                ((BottomSheet) embedBottomSheet).containerView.setTranslationY(0.0f);
                return null;
            }
            embedBottomSheet.animationInProgress = true;
            WebPlayerView webPlayerView = embedBottomSheet.videoView;
            View aspectRatioView = webPlayerView.getAspectRatioView();
            int[] iArr = embedBottomSheet.position;
            aspectRatioView.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - embedBottomSheet.getLeftInset();
            iArr[1] = (int) (iArr[1] - ((BottomSheet) embedBottomSheet).containerView.getTranslationY());
            TextureView textureView2 = webPlayerView.getTextureView();
            ImageView textureImageView = webPlayerView.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(((BottomSheet) embedBottomSheet).containerView, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(((BottomSheet) embedBottomSheet).backDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new CheckBox.AnonymousClass1(this, 26));
            animatorSet.start();
            return null;
        }

        @Override
        public final TextureView onSwitchToFullscreen(View view, boolean z, float f, int i, boolean z2) {
            EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
            if (!z) {
                embedBottomSheet.fullscreenVideoContainer.setVisibility(4);
                embedBottomSheet.fullscreenedByButton = false;
                Activity activity = embedBottomSheet.parentActivity;
                if (activity == null) {
                    return null;
                }
                try {
                    ((BottomSheet) embedBottomSheet).containerView.setSystemUiVisibility(0);
                    activity.setRequestedOrientation(embedBottomSheet.prevOrientation);
                    return null;
                } catch (Exception e) {
                    FileLog.e(e);
                    return null;
                }
            }
            embedBottomSheet.fullscreenVideoContainer.setVisibility(0);
            FrameLayout frameLayout = embedBottomSheet.fullscreenVideoContainer;
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(embedBottomSheet.videoView.getAspectRatioView());
            embedBottomSheet.wasInLandscape = false;
            embedBottomSheet.fullscreenedByButton = z2;
            Activity activity2 = embedBottomSheet.parentActivity;
            if (activity2 == null) {
                return null;
            }
            try {
                embedBottomSheet.prevOrientation = activity2.getRequestedOrientation();
                if (z2) {
                    if (((WindowManager) activity2.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        activity2.setRequestedOrientation(8);
                    } else {
                        activity2.setRequestedOrientation(0);
                    }
                }
                ((BottomSheet) embedBottomSheet).containerView.setSystemUiVisibility(1028);
                return null;
            } catch (Exception e2) {
                FileLog.e(e2);
                return null;
            }
        }

        @Override
        public final void onVideoSizeChanged(float f, int i) {
        }

        @Override
        public final void prepareToSwitchInlineMode(boolean z, WebPlayerView.AnonymousClass1 anonymousClass1, float f, boolean z2) {
            if (!z) {
                if (ApplicationLoader.mainInterfacePaused) {
                    try {
                        EmbedBottomSheet.this.parentActivity.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                if (z2) {
                    EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
                    embedBottomSheet.setOnShowListener(embedBottomSheet.onShowListener);
                    RectOld pipRect = PipVideoOverlay.getPipRect(f, false);
                    TextureView textureView = EmbedBottomSheet.this.videoView.getTextureView();
                    ImageView textureImageView = EmbedBottomSheet.this.videoView.getTextureImageView();
                    float f2 = pipRect.width / textureView.getLayoutParams().width;
                    textureImageView.setScaleX(f2);
                    textureImageView.setScaleY(f2);
                    textureImageView.setTranslationX(pipRect.x);
                    textureImageView.setTranslationY(pipRect.y);
                    textureView.setScaleX(f2);
                    textureView.setScaleY(f2);
                    textureView.setTranslationX(pipRect.x);
                    textureView.setTranslationY(pipRect.y);
                } else {
                    PipVideoOverlay.dismiss();
                }
                EmbedBottomSheet.this.setShowWithoutAnimation(true);
                EmbedBottomSheet.this.show();
                if (z2) {
                    EmbedBottomSheet embedBottomSheet2 = EmbedBottomSheet.this;
                    embedBottomSheet2.waitingForDraw = 4;
                    BottomSheet.SheetBackDrawable sheetBackDrawable = ((BottomSheet) embedBottomSheet2).backDrawable;
                    sheetBackDrawable.bgPaint.setAlpha(1);
                    sheetBackDrawable.invalidateSelf();
                    ((BottomSheet) EmbedBottomSheet.this).containerView.setTranslationY(AndroidUtilities.dp(10.0f) + ((BottomSheet) EmbedBottomSheet.this).containerView.getMeasuredHeight());
                    return;
                }
                return;
            }
            EmbedBottomSheet embedBottomSheet3 = EmbedBottomSheet.this;
            if (embedBottomSheet3.parentActivity != null) {
                try {
                    ((BottomSheet) embedBottomSheet3).containerView.setSystemUiVisibility(0);
                    EmbedBottomSheet embedBottomSheet4 = EmbedBottomSheet.this;
                    int i = embedBottomSheet4.prevOrientation;
                    if (i != -2) {
                        embedBottomSheet4.parentActivity.setRequestedOrientation(i);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (EmbedBottomSheet.this.fullscreenVideoContainer.getVisibility() == 0) {
                ((BottomSheet) EmbedBottomSheet.this).containerView.setTranslationY(AndroidUtilities.dp(10.0f) + ((BottomSheet) EmbedBottomSheet.this).containerView.getMeasuredHeight());
                BottomSheet.SheetBackDrawable sheetBackDrawable2 = ((BottomSheet) EmbedBottomSheet.this).backDrawable;
                sheetBackDrawable2.bgPaint.setAlpha(0);
                sheetBackDrawable2.invalidateSelf();
            }
            EmbedBottomSheet.this.setOnShowListener(null);
            if (!z2) {
                if (EmbedBottomSheet.this.fullscreenVideoContainer.getVisibility() == 0) {
                    EmbedBottomSheet.this.fullscreenVideoContainer.setAlpha(1.0f);
                    EmbedBottomSheet.this.fullscreenVideoContainer.setVisibility(4);
                }
                anonymousClass1.run();
                EmbedBottomSheet.this.dismissInternal();
                return;
            }
            TextureView textureView2 = EmbedBottomSheet.this.videoView.getTextureView();
            View controlsView = EmbedBottomSheet.this.videoView.getControlsView();
            ImageView textureImageView2 = EmbedBottomSheet.this.videoView.getTextureImageView();
            RectOld pipRect2 = PipVideoOverlay.getPipRect(f, true);
            float width = pipRect2.width / textureView2.getWidth();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
            Property property2 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, pipRect2.x);
            Property property4 = View.TRANSLATION_Y;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, pipRect2.y);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, pipRect2.x);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, pipRect2.y);
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(((BottomSheet) EmbedBottomSheet.this).containerView, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + ((BottomSheet) EmbedBottomSheet.this).containerView.getMeasuredHeight());
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(((BottomSheet) EmbedBottomSheet.this).backDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
            FrameLayout frameLayout = EmbedBottomSheet.this.fullscreenVideoContainer;
            Property property5 = View.ALPHA;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new ChatActivity.AnonymousClass74(this, anonymousClass1, false, 17));
            animatorSet.start();
        }
    }

    public final class YoutubeProxy {
        public YoutubeProxy() {
        }

        @JavascriptInterface
        public void postEvent(String str, String str2) {
            if ("loaded".equals(str)) {
                AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(this, 2));
            }
        }
    }

    public EmbedBottomSheet(Activity activity, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        float f;
        String strGroup;
        super(activity, null, false, false);
        this.position = new int[2];
        this.prevOrientation = -2;
        this.onShowListener = new AnonymousClass1();
        this.fullWidth = true;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.seekTimeOverride = i3;
        this.parentActivity = activity;
        this.embedUrl = str4;
        boolean z = str2 != null && str2.length() > 0;
        this.hasDescription = z;
        this.openUrl = str3;
        this.width = i;
        this.height = i2;
        if (i == 0 || i2 == 0) {
            Point point = AndroidUtilities.displaySize;
            this.width = point.x;
            this.height = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.fullscreenVideoContainer = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(16));
        this.container.addView(frameLayout, LayoutHelper.createFrame(-1.0f, -1));
        frameLayout.setVisibility(4);
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, activity, 12);
        this.containerLayout = anonymousClass60;
        anonymousClass60.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(16));
        setCustomView(anonymousClass60);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, activity, activity, 0);
        this.webView = anonymousClass3;
        anonymousClass3.getSettings().setJavaScriptEnabled(true);
        anonymousClass3.getSettings().setDomStorageEnabled(true);
        anonymousClass3.getSettings().setMediaPlaybackRequiresUserGesture(false);
        anonymousClass3.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(anonymousClass3, true);
        anonymousClass3.setWebChromeClient(new AnonymousClass4(this, 0));
        anonymousClass3.setWebViewClient(new AnonymousClass5());
        anonymousClass60.addView(anonymousClass3, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 84));
        WebPlayerView webPlayerView = new WebPlayerView(activity, true, new AnonymousClass6());
        this.videoView = webPlayerView;
        webPlayerView.setVisibility(4);
        anonymousClass60.addView(webPlayerView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 74));
        View view = new View(activity);
        this.progressBarBlackBackground = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        anonymousClass60.addView(view, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.progressBar = radialProgressView;
        radialProgressView.setVisibility(4);
        anonymousClass60.addView(radialProgressView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z ? 22 : 0) + 84) / 2));
        if (z) {
            TextView textView = new TextView(activity);
            f = 18.0f;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            anonymousClass60.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f = 18.0f;
        }
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray, false));
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
        anonymousClass60.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        view2.setBackgroundColor(Theme.getColor(null, Theme.key_dialogGrayLine, false));
        anonymousClass60.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        anonymousClass60.addView(frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, LayoutHelper.createFrame(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i4 = Theme.key_dialogTextBlue4;
        zzkr.m(i4, textView3, 17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i5 = Theme.key_dialogButtonSelector;
        textView3.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(null, i5, false), 0, -1));
        textView3.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
        textView3.setText(LocaleController.getString(R.string.Close).toUpperCase());
        textView3.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView3, LayoutHelper.createLinear(-2, -1, 51));
        final int i6 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final EmbedBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                BaseFragment baseFragment;
                switch (i6) {
                    case 0:
                        this.f$0.lambda$new$2$22(view3);
                        break;
                    case 1:
                        this.f$0.lambda$new$3$18(view3);
                        break;
                    case 2:
                        EmbedBottomSheet embedBottomSheet = this.f$0;
                        embedBottomSheet.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", embedBottomSheet.openUrl));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity2 = embedBottomSheet.parentActivity;
                        if (activity2 instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) activity2;
                            ArrayList arrayList = launchActivity.layerFragmentsStack;
                            if (arrayList.isEmpty()) {
                                ArrayList arrayList2 = launchActivity.rightFragmentsStack;
                                if (arrayList2.isEmpty()) {
                                    ArrayList arrayList3 = launchActivity.mainFragmentsStack;
                                    baseFragment = !arrayList3.isEmpty() ? (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3) : null;
                                } else {
                                    baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2);
                                }
                            } else {
                                baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                            }
                            if (BulletinFactory.canShowBulletin(baseFragment)) {
                                BulletinFactory.of(baseFragment).createCopyLinkBulletin(false).show();
                            }
                        }
                        embedBottomSheet.lambda$showGiftOfferSheet$15();
                        break;
                    default:
                        EmbedBottomSheet embedBottomSheet2 = this.f$0;
                        Browser.openUrl(embedBottomSheet2.parentActivity, embedBottomSheet2.openUrl);
                        embedBottomSheet2.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.imageButtonsContainer = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, LayoutHelper.createFrame(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.pipButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        int color = Theme.getColor(null, i4, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        imageView.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(null, i5, false), 0, -1));
        linearLayout2.addView(imageView, LayoutHelper.createFrame(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i7 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final EmbedBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                BaseFragment baseFragment;
                switch (i7) {
                    case 0:
                        this.f$0.lambda$new$2$22(view3);
                        break;
                    case 1:
                        this.f$0.lambda$new$3$18(view3);
                        break;
                    case 2:
                        EmbedBottomSheet embedBottomSheet = this.f$0;
                        embedBottomSheet.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", embedBottomSheet.openUrl));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity2 = embedBottomSheet.parentActivity;
                        if (activity2 instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) activity2;
                            ArrayList arrayList = launchActivity.layerFragmentsStack;
                            if (arrayList.isEmpty()) {
                                ArrayList arrayList2 = launchActivity.rightFragmentsStack;
                                if (arrayList2.isEmpty()) {
                                    ArrayList arrayList3 = launchActivity.mainFragmentsStack;
                                    baseFragment = !arrayList3.isEmpty() ? (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3) : null;
                                } else {
                                    baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2);
                                }
                            } else {
                                baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                            }
                            if (BulletinFactory.canShowBulletin(baseFragment)) {
                                BulletinFactory.of(baseFragment).createCopyLinkBulletin(false).show();
                            }
                        }
                        embedBottomSheet.lambda$showGiftOfferSheet$15();
                        break;
                    default:
                        EmbedBottomSheet embedBottomSheet2 = this.f$0;
                        Browser.openUrl(embedBottomSheet2.parentActivity, embedBottomSheet2.openUrl);
                        embedBottomSheet2.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        });
        final int i8 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final EmbedBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                BaseFragment baseFragment;
                switch (i8) {
                    case 0:
                        this.f$0.lambda$new$2$22(view3);
                        break;
                    case 1:
                        this.f$0.lambda$new$3$18(view3);
                        break;
                    case 2:
                        EmbedBottomSheet embedBottomSheet = this.f$0;
                        embedBottomSheet.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", embedBottomSheet.openUrl));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity2 = embedBottomSheet.parentActivity;
                        if (activity2 instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) activity2;
                            ArrayList arrayList = launchActivity.layerFragmentsStack;
                            if (arrayList.isEmpty()) {
                                ArrayList arrayList2 = launchActivity.rightFragmentsStack;
                                if (arrayList2.isEmpty()) {
                                    ArrayList arrayList3 = launchActivity.mainFragmentsStack;
                                    baseFragment = !arrayList3.isEmpty() ? (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3) : null;
                                } else {
                                    baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2);
                                }
                            } else {
                                baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                            }
                            if (BulletinFactory.canShowBulletin(baseFragment)) {
                                BulletinFactory.of(baseFragment).createCopyLinkBulletin(false).show();
                            }
                        }
                        embedBottomSheet.lambda$showGiftOfferSheet$15();
                        break;
                    default:
                        EmbedBottomSheet embedBottomSheet2 = this.f$0;
                        Browser.openUrl(embedBottomSheet2.parentActivity, embedBottomSheet2.openUrl);
                        embedBottomSheet2.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_copy);
        imageView2.setContentDescription(LocaleController.getString(R.string.CopyLink));
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i4, false), mode));
        imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(null, i5, false), 0, -1));
        linearLayout2.addView(imageView2, LayoutHelper.createFrame(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.copyTextButton = textView4;
        textView4.setTextSize(1, 14.0f);
        zzkr.m(i4, textView4, 17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        textView4.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(null, i5, false), 0, -1));
        textView4.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
        textView4.setText(LocaleController.getString(R.string.Copy).toUpperCase());
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView4, LayoutHelper.createFrame(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        zzkr.m(i4, textView5, 17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        textView5.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(null, i5, false), 0, -1));
        textView5.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
        textView5.setText(LocaleController.getString(R.string.OpenInBrowser).toUpperCase());
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, LayoutHelper.createFrame(-2, -1, 51));
        final int i9 = 3;
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final EmbedBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                BaseFragment baseFragment;
                switch (i9) {
                    case 0:
                        this.f$0.lambda$new$2$22(view3);
                        break;
                    case 1:
                        this.f$0.lambda$new$3$18(view3);
                        break;
                    case 2:
                        EmbedBottomSheet embedBottomSheet = this.f$0;
                        embedBottomSheet.getClass();
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", embedBottomSheet.openUrl));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        Activity activity2 = embedBottomSheet.parentActivity;
                        if (activity2 instanceof LaunchActivity) {
                            LaunchActivity launchActivity = (LaunchActivity) activity2;
                            ArrayList arrayList = launchActivity.layerFragmentsStack;
                            if (arrayList.isEmpty()) {
                                ArrayList arrayList2 = launchActivity.rightFragmentsStack;
                                if (arrayList2.isEmpty()) {
                                    ArrayList arrayList3 = launchActivity.mainFragmentsStack;
                                    baseFragment = !arrayList3.isEmpty() ? (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3) : null;
                                } else {
                                    baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2);
                                }
                            } else {
                                baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                            }
                            if (BulletinFactory.canShowBulletin(baseFragment)) {
                                BulletinFactory.of(baseFragment).createCopyLinkBulletin(false).show();
                            }
                        }
                        embedBottomSheet.lambda$showGiftOfferSheet$15();
                        break;
                    default:
                        EmbedBottomSheet embedBottomSheet2 = this.f$0;
                        Browser.openUrl(embedBottomSheet2.parentActivity, embedBottomSheet2.openUrl);
                        embedBottomSheet2.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        });
        final boolean z2 = WebPlayerView.canHandleUrl(str4) || WebPlayerView.canHandleUrl(str3);
        webPlayerView.setVisibility(z2 ? 0 : 4);
        if (z2) {
            webPlayerView.controlsView.setVisibility(4);
            webPlayerView.controlsView.show(false, false);
            webPlayerView.showProgress(true, false);
        }
        setDelegate(new OKLCH() {
            @Override
            public final boolean canDismiss() {
                EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
                WebPlayerView webPlayerView2 = embedBottomSheet.videoView;
                boolean z3 = webPlayerView2.inFullscreen;
                if (z3) {
                    if (z3) {
                        webPlayerView2.inFullscreen = false;
                        webPlayerView2.updateInlineButton();
                        webPlayerView2.updateFullscreenState(false);
                    }
                    return false;
                }
                try {
                    embedBottomSheet.parentActivity.getWindow().clearFlags(128);
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return true;
                }
            }

            @Override
            public final void onOpenAnimationEnd() {
                String queryParameter;
                int iIntValue;
                boolean z3 = z2;
                EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
                if (z3 && embedBottomSheet.videoView.loadVideo(embedBottomSheet.embedUrl, null, null, embedBottomSheet.openUrl, true)) {
                    embedBottomSheet.progressBar.setVisibility(4);
                    embedBottomSheet.webView.setVisibility(4);
                    embedBottomSheet.videoView.setVisibility(0);
                    return;
                }
                embedBottomSheet.progressBar.setVisibility(0);
                AnonymousClass3 anonymousClass4 = embedBottomSheet.webView;
                anonymousClass4.setVisibility(0);
                embedBottomSheet.imageButtonsContainer.setVisibility(0);
                embedBottomSheet.copyTextButton.setVisibility(4);
                anonymousClass4.setKeepScreenOn(true);
                WebPlayerView webPlayerView2 = embedBottomSheet.videoView;
                webPlayerView2.setVisibility(4);
                webPlayerView2.getControlsView().setVisibility(4);
                webPlayerView2.getTextureView().setVisibility(4);
                if (webPlayerView2.getTextureImageView() != null) {
                    webPlayerView2.getTextureImageView().setVisibility(4);
                }
                embedBottomSheet.videoView.loadVideo(null, null, null, null, false);
                HashMap map = new HashMap();
                map.put("Referer", "messenger.telegram.org");
                try {
                    String youtubeId = webPlayerView2.getYoutubeId();
                    if (youtubeId == null) {
                        anonymousClass4.loadUrl(embedBottomSheet.embedUrl, map);
                        return;
                    }
                    embedBottomSheet.progressBarBlackBackground.setVisibility(0);
                    embedBottomSheet.isYouTube = true;
                    anonymousClass4.addJavascriptInterface(embedBottomSheet.new YoutubeProxy(), "YoutubeProxy");
                    String str5 = embedBottomSheet.openUrl;
                    if (str5 != null) {
                        try {
                            Uri uri = Uri.parse(str5);
                            int i10 = embedBottomSheet.seekTimeOverride;
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    } else {
                        iIntValue = 0;
                    }
                    embedBottomSheet.webView.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(iIntValue)), "text/html", "UTF-8", "https://youtube.com");
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
        });
        this.orientationEventListener = new OrientationEventListener(ApplicationLoader.applicationContext) {
            @Override
            public final void onOrientationChanged(int i10) {
                Activity activity2;
                EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.this;
                if (embedBottomSheet.orientationEventListener != null) {
                    WebPlayerView webPlayerView2 = embedBottomSheet.videoView;
                    if (webPlayerView2.getVisibility() == 0 && (activity2 = embedBottomSheet.parentActivity) != null && webPlayerView2.inFullscreen && embedBottomSheet.fullscreenedByButton) {
                        if (i10 >= 240 && i10 <= 300) {
                            embedBottomSheet.wasInLandscape = true;
                            return;
                        }
                        if (!embedBottomSheet.wasInLandscape || i10 <= 0) {
                            return;
                        }
                        if (i10 >= 330 || i10 <= 30) {
                            activity2.setRequestedOrientation(embedBottomSheet.prevOrientation);
                            embedBottomSheet.fullscreenedByButton = false;
                            embedBottomSheet.wasInLandscape = false;
                        }
                    }
                }
            }
        };
        if (str4 == null) {
            strGroup = null;
        } else {
            Matcher matcher = WebPlayerView.youtubeIdRegex.matcher(str4);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                strGroup = null;
            }
        }
        if (strGroup != null || !z2) {
            radialProgressView.setVisibility(0);
            anonymousClass3.setVisibility(0);
            linearLayout2.setVisibility(0);
            if (strGroup != null) {
                view.setVisibility(0);
            }
            textView4.setVisibility(4);
            anonymousClass3.setKeepScreenOn(true);
            webPlayerView.setVisibility(4);
            webPlayerView.getControlsView().setVisibility(4);
            webPlayerView.getTextureView().setVisibility(4);
            if (webPlayerView.getTextureImageView() != null) {
                webPlayerView.getTextureImageView().setVisibility(4);
            }
            if (strGroup != null && "disabled".equals(MessagesController.getInstance(this.currentAccount).youtubePipType)) {
                imageView.setVisibility(8);
            }
        }
        if (canDetectOrientation()) {
            enable();
        } else {
            disable();
            this.orientationEventListener = null;
        }
        instance = this;
    }

    public static void show(BaseFragment baseFragment, MessageObject messageObject, PhotoViewer.EmptyPhotoViewerProvider emptyPhotoViewerProvider, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z) {
        String strGroup;
        TLRPC.MessageMedia messageMedia;
        EmbedBottomSheet embedBottomSheet = instance;
        if (embedBottomSheet != null) {
            embedBottomSheet.destroy();
        }
        if (messageObject == null || (messageMedia = messageObject.messageOwner.media) == null || messageMedia.webpage == null) {
            strGroup = null;
        } else {
            if (str4 == null) {
                Pattern pattern = WebPlayerView.youtubeIdRegex;
            } else {
                Matcher matcher = WebPlayerView.youtubeIdRegex.matcher(str4);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                }
            }
            strGroup = null;
        }
        if (strGroup != null) {
            PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
            PhotoViewer.getInstance().openPhoto(messageObject, null, null, null, null, null, null, 0, emptyPhotoViewerProvider, null, 0L, 0L, 0L, true, null, Integer.valueOf(i3));
        } else {
            EmbedBottomSheet embedBottomSheet2 = new EmbedBottomSheet(baseFragment.getParentActivity(), str, str2, str3, str4, i, i2, i3);
            embedBottomSheet2.setCalcMandatoryInsets(z);
            embedBottomSheet2.show();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        WebPlayerView webPlayerView = this.videoView;
        return (webPlayerView.getVisibility() == 0 && webPlayerView.inFullscreen) ? false : true;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.fullscreenVideoContainer.getVisibility() != 0;
    }

    public final void destroy() {
        AnonymousClass3 anonymousClass3 = this.webView;
        if (anonymousClass3 != null && anonymousClass3.getVisibility() == 0) {
            this.containerLayout.removeView(anonymousClass3);
            anonymousClass3.stopLoading();
            anonymousClass3.loadUrl("about:blank");
            anonymousClass3.destroy();
        }
        PipVideoOverlay.dismiss();
        WebPlayerView webPlayerView = this.videoView;
        if (webPlayerView != null) {
            webPlayerView.destroy();
        }
        instance = null;
        dismissInternal();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AnonymousClass9 anonymousClass9 = this.orientationEventListener;
        if (anonymousClass9 != null) {
            anonymousClass9.disable();
            this.orientationEventListener = null;
        }
    }

    public final void exitFromPip() {
        if (this.webView == null || !PipVideoOverlay.instance.isVisible) {
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.parentActivity.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        if (this.isYouTube) {
            this.webView.evaluateJavascript("showControls();", null);
        }
        ViewGroup viewGroup = (ViewGroup) this.webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.webView);
        }
        this.containerLayout.addView(this.webView, 0, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (this.hasDescription ? 22 : 0) + 84));
        setShowWithoutAnimation(true);
        show();
        PipVideoOverlay.instance.dismissInternal(true, false);
    }

    public final void lambda$new$3$18(View view) {
        PipVideoOverlay pipVideoOverlay = PipVideoOverlay.instance;
        if (pipVideoOverlay.isVisible) {
            PipVideoOverlay.dismiss();
            Objects.requireNonNull(view);
            AndroidUtilities.runOnUIThread(new Shaker$$ExternalSyntheticLambda0(1, view), 300L);
            return;
        }
        boolean z = this.isYouTube && "inapp".equals(MessagesController.getInstance(this.currentAccount).youtubePipType);
        if (!z) {
            Activity activity = this.parentActivity;
            if (activity == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(activity)) {
                AlertsCreator.createDrawOverlayPermissionDialog(activity, null, false);
                return;
            }
        }
        if (this.progressBar.getVisibility() == 0) {
            return;
        }
        if (pipVideoOverlay.showInternal(z, this.parentActivity, this.webView, null, this.width, this.height, false)) {
            pipVideoOverlay.parentSheet = this;
        }
        if (this.isYouTube) {
            this.webView.evaluateJavascript("hideControls();", null);
        }
        this.containerView.setTranslationY(0.0f);
        dismissInternal();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        WebPlayerView webPlayerView = this.videoView;
        if (webPlayerView.getVisibility() != 0 || !webPlayerView.initied || webPlayerView.isInline || webPlayerView.switchingInlineMode) {
            return;
        }
        if (configuration.orientation == 2) {
            boolean z = webPlayerView.inFullscreen;
            if (z || z) {
                return;
            }
            webPlayerView.inFullscreen = true;
            webPlayerView.updateInlineButton();
            webPlayerView.updateFullscreenState(false);
            return;
        }
        boolean z2 = webPlayerView.inFullscreen;
        if (z2 && z2) {
            webPlayerView.inFullscreen = false;
            webPlayerView.updateInlineButton();
            webPlayerView.updateFullscreenState(false);
        }
    }

    @Override
    public final void onContainerDraw(Canvas canvas) {
        int i = this.waitingForDraw;
        if (i != 0) {
            int i2 = i - 1;
            this.waitingForDraw = i2;
            if (i2 != 0) {
                this.container.invalidate();
                return;
            }
            WebPlayerView webPlayerView = this.videoView;
            ImageView imageView = webPlayerView.textureImageView;
            if (imageView != null) {
                TextureView textureView = webPlayerView.textureView;
                try {
                    Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                    webPlayerView.currentBitmap = bitmapCreateBitmap;
                    webPlayerView.changedTextureView.getBitmap(bitmapCreateBitmap);
                } catch (Throwable th) {
                    Bitmap bitmap = webPlayerView.currentBitmap;
                    if (bitmap != null) {
                        bitmap.recycle();
                        webPlayerView.currentBitmap = null;
                    }
                    FileLog.e(th);
                }
                if (webPlayerView.currentBitmap != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(webPlayerView.currentBitmap);
                } else {
                    imageView.setImageDrawable(null);
                }
            }
            PipVideoOverlay.dismiss();
        }
    }

    @Override
    public final void onContainerTranslationYChanged(float f) {
        updateTextureViewPosition$1();
    }

    @Override
    public final boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        if (view != this.videoView.getControlsView()) {
            return false;
        }
        updateTextureViewPosition$1();
        return false;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i, int i2) {
        WebPlayerView webPlayerView = this.videoView;
        if (view == webPlayerView.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = webPlayerView.getMeasuredWidth();
            layoutParams.height = webPlayerView.getAspectRatioView().getMeasuredHeight() + (webPlayerView.inFullscreen ? 0 : AndroidUtilities.dp(10.0f));
        }
        return false;
    }

    public final void updateTextureViewPosition$1() {
        WebPlayerView webPlayerView = this.videoView;
        View aspectRatioView = webPlayerView.getAspectRatioView();
        int[] iArr = this.position;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - getLeftInset();
        if (!webPlayerView.isInline && !webPlayerView.switchingInlineMode && !this.animationInProgress) {
            TextureView textureView = webPlayerView.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = webPlayerView.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = webPlayerView.getControlsView();
        if (controlsView.getParent() == this.container) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    public final class AnonymousClass4 extends WebChromeClient {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;

        public AnonymousClass4(KeyEvent.Callback callback, int i) {
            this.$r8$classId = i;
            this.this$0 = callback;
        }

        @Override
        public final void onHideCustomView() {
            switch (this.$r8$classId) {
                case 0:
                    super.onHideCustomView();
                    EmbedBottomSheet embedBottomSheet = (EmbedBottomSheet) this.this$0;
                    if (embedBottomSheet.customView != null) {
                        embedBottomSheet.getSheetContainer().setVisibility(0);
                        embedBottomSheet.fullscreenVideoContainer.setVisibility(4);
                        embedBottomSheet.fullscreenVideoContainer.removeView(embedBottomSheet.customView);
                        WebChromeClient.CustomViewCallback customViewCallback = embedBottomSheet.customViewCallback;
                        if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                            embedBottomSheet.customViewCallback.onCustomViewHidden();
                        }
                        embedBottomSheet.customView = null;
                        break;
                    }
                    break;
                default:
                    super.onHideCustomView();
                    ArticleViewer.BlockEmbedCell blockEmbedCell = (ArticleViewer.BlockEmbedCell) this.this$0;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    if (articleViewer.customView != null) {
                        articleViewer.fullscreenVideoContainer.setVisibility(4);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        articleViewer2.fullscreenVideoContainer.removeView(articleViewer2.customView);
                        WebChromeClient.CustomViewCallback customViewCallback2 = ArticleViewer.this.customViewCallback;
                        if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                            ArticleViewer.this.customViewCallback.onCustomViewHidden();
                        }
                        ArticleViewer.this.customView = null;
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
            switch (this.$r8$classId) {
                case 0:
                    onShowCustomView(view, customViewCallback);
                    break;
                default:
                    onShowCustomView(view, customViewCallback);
                    break;
            }
        }

        @Override
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            switch (this.$r8$classId) {
                case 0:
                    EmbedBottomSheet embedBottomSheet = (EmbedBottomSheet) this.this$0;
                    if (embedBottomSheet.customView == null && !PipVideoOverlay.instance.isVisible) {
                        embedBottomSheet.exitFromPip();
                        embedBottomSheet.customView = view;
                        embedBottomSheet.getSheetContainer().setVisibility(4);
                        FrameLayout frameLayout = embedBottomSheet.fullscreenVideoContainer;
                        frameLayout.setVisibility(0);
                        frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, -1));
                        embedBottomSheet.customViewCallback = customViewCallback;
                    } else {
                        customViewCallback.onCustomViewHidden();
                    }
                    break;
                default:
                    ArticleViewer articleViewer = ArticleViewer.this;
                    if (articleViewer.customView != null) {
                        customViewCallback.onCustomViewHidden();
                    } else {
                        articleViewer.customView = view;
                        articleViewer.customViewCallback = customViewCallback;
                        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda3(this, 6), 100L);
                    }
                    break;
            }
        }
    }
}
