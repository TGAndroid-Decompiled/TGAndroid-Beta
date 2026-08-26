package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda19;
import org.telegram.ui.iv.RichEditor;
import org.webrtc.RendererCommon;

public final class VoIPPiPView implements VoIPService.StateListener, IPipSourceDelegate, NotificationCenter.NotificationCenterDelegate {
    public static VoIPPiPView instance = null;
    public static boolean switchingToPip = false;
    public static int topInset;
    public ValueAnimator animatorToCameraMini;
    public boolean callingUserIsVideo;
    public final VoIPTextureView callingUserTextureView;
    public int currentAccount;
    public boolean currentUserIsVideo;
    public final VoIPTextureView currentUserTextureView;
    public Trigger firstFrameCallback;
    public final FloatingView floatingView;
    public AnimatorSet moveToBoundsAnimator;
    public boolean moving;
    public final int parentHeight;
    public final int parentWidth;
    public PipSource pipSource;
    public VoIPTextureView pipTextureView;
    public float progressToCameraMini;
    public long startTime;
    public float startX;
    public float startY;
    public WindowManager.LayoutParams windowLayoutParams;
    public WindowManager windowManager;
    public final ChatLoadingCell.AnonymousClass1 windowView;
    public final int xOffset;
    public final int yOffset;
    public final BotButton$$ExternalSyntheticLambda0 animatorToCameraMiniUpdater = new BotButton$$ExternalSyntheticLambda0(this, 23);
    public final float[] point = new float[2];
    public final Theme.AnonymousClass1 collapseRunnable = new Theme.AnonymousClass1(4);
    public final AnonymousClass2 updateXlistener = new AnonymousClass2(this, 0);
    public final AnonymousClass2 updateYlistener = new AnonymousClass2(this, 1);
    public final AnonymousClass6 rendererEvents = new RendererCommon.RendererEvents() {
        @Override
        public final void onFirstFrameRendered() {
            VoIPPiPView voIPPiPView = VoIPPiPView.this;
            Trigger trigger = voIPPiPView.firstFrameCallback;
            if (trigger != null) {
                trigger.run();
                voIPPiPView.firstFrameCallback = null;
            }
        }

        @Override
        public final void onFrameResolutionChanged(int i, int i2, int i3) {
        }
    };

    public final class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            switch (this.$r8$classId) {
                case 0:
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    VoIPPiPView voIPPiPView = (VoIPPiPView) this.this$0;
                    WindowManager.LayoutParams layoutParams = voIPPiPView.windowLayoutParams;
                    layoutParams.x = (int) fFloatValue;
                    AndroidUtilities.updateViewLayout(voIPPiPView.windowManager, voIPPiPView.windowView, layoutParams);
                    break;
                case 1:
                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    VoIPPiPView voIPPiPView2 = (VoIPPiPView) this.this$0;
                    WindowManager.LayoutParams layoutParams2 = voIPPiPView2.windowLayoutParams;
                    layoutParams2.y = (int) fFloatValue2;
                    AndroidUtilities.updateViewLayout(voIPPiPView2.windowManager, voIPPiPView2.windowView, layoutParams2);
                    break;
                default:
                    float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    VoIPFloatingLayout voIPFloatingLayout = (VoIPFloatingLayout) this.this$0;
                    voIPFloatingLayout.toFloatingModeProgress = fFloatValue3;
                    VoIPFloatingLayout.VoIPFloatingLayoutDelegate voIPFloatingLayoutDelegate = voIPFloatingLayout.delegate;
                    if (voIPFloatingLayoutDelegate != null) {
                        ((VoIPFragment$$ExternalSyntheticLambda19) voIPFloatingLayoutDelegate).f$0.lambda$createView$5(fFloatValue3, voIPFloatingLayout.measuredAsFloatingMode);
                    }
                    voIPFloatingLayout.invalidate();
                    break;
            }
        }
    }

    public final class FloatingView extends FrameLayout {
        public static final int $r8$clinit = 0;
        public float bottomPadding;
        public float leftPadding;
        public float rightPadding;
        public float topPadding;
        public final float touchSlop;

        public FloatingView(Activity activity) {
            super(activity);
            this.touchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
            setOutlineProvider(new RichEditor.AnonymousClass5(7));
            setClipToOutline(true);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            VoIPPiPView voIPPiPView = VoIPPiPView.this;
            voIPPiPView.currentUserTextureView.setPivotX(voIPPiPView.callingUserTextureView.getMeasuredWidth());
            voIPPiPView.currentUserTextureView.setPivotY(voIPPiPView.callingUserTextureView.getMeasuredHeight());
            voIPPiPView.currentUserTextureView.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * voIPPiPView.progressToCameraMini);
            voIPPiPView.currentUserTextureView.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * voIPPiPView.progressToCameraMini);
            voIPPiPView.currentUserTextureView.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * voIPPiPView.progressToCameraMini);
            voIPPiPView.currentUserTextureView.setScaleX(((1.0f - voIPPiPView.progressToCameraMini) * 0.6f) + 0.4f);
            voIPPiPView.currentUserTextureView.setScaleY(((1.0f - voIPPiPView.progressToCameraMini) * 0.6f) + 0.4f);
            voIPPiPView.currentUserTextureView.setAlpha(Math.min(1.0f, 1.0f - voIPPiPView.progressToCameraMini));
            super.dispatchDraw(canvas);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.leftPadding = AndroidUtilities.dp(16.0f);
            this.rightPadding = AndroidUtilities.dp(16.0f);
            this.topPadding = AndroidUtilities.dp(60.0f);
            this.bottomPadding = AndroidUtilities.dp(16.0f);
        }

        @Override
        public final boolean onTouchEvent(android.view.MotionEvent r15) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.VoIPPiPView.FloatingView.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public VoIPPiPView(Activity activity, int i, int i2) {
        this.parentWidth = i;
        this.parentHeight = i2;
        float f = i2 * 0.4f;
        int i3 = ((int) ((f * 1.05f) - f)) / 2;
        this.yOffset = i3;
        float f2 = i * 0.4f;
        int i4 = ((int) ((1.05f * f2) - f2)) / 2;
        this.xOffset = i4;
        ChatLoadingCell.AnonymousClass1 anonymousClass1 = new ChatLoadingCell.AnonymousClass1(this, activity, activity.getDrawable(R.drawable.calls_pip_outershadow), 5);
        this.windowView = anonymousClass1;
        anonymousClass1.setWillNotDraw(false);
        anonymousClass1.setPadding(i4, i3, i4, i3);
        FloatingView floatingView = new FloatingView(activity);
        this.floatingView = floatingView;
        VoIPTextureView voIPTextureView = new VoIPTextureView(activity, false, true, true, false);
        this.callingUserTextureView = voIPTextureView;
        voIPTextureView.scaleType = 3;
        VoIPTextureView voIPTextureView2 = new VoIPTextureView(activity, false, true, true, false);
        this.currentUserTextureView = voIPTextureView2;
        voIPTextureView2.renderer.setMirror(true);
        floatingView.addView(voIPTextureView);
        floatingView.addView(voIPTextureView2);
        floatingView.setBackgroundColor(-7829368);
        anonymousClass1.addView(floatingView);
        anonymousClass1.setClipChildren(false);
        anonymousClass1.setClipToPadding(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        updateViewState();
    }

    public static void finish() {
        if (switchingToPip) {
            return;
        }
        VoIPPiPView voIPPiPView = instance;
        if (voIPPiPView != null) {
            voIPPiPView.currentUserTextureView.renderer.release();
            voIPPiPView.callingUserTextureView.renderer.release();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.unregisterStateListener(voIPPiPView);
            }
            voIPPiPView.windowView.setVisibility(8);
            if (voIPPiPView.windowView.getParent() != null) {
                FloatingView floatingView = voIPPiPView.floatingView;
                float[] fArr = voIPPiPView.point;
                int i = FloatingView.$r8$clinit;
                floatingView.getClass();
                Point point = AndroidUtilities.displaySize;
                float f = point.x;
                float f2 = point.y;
                VoIPPiPView voIPPiPView2 = VoIPPiPView.this;
                float left = voIPPiPView2.floatingView.getLeft() + voIPPiPView2.windowLayoutParams.x;
                float f3 = floatingView.leftPadding;
                fArr[0] = (left - f3) / (((f - f3) - floatingView.rightPadding) - VoIPPiPView.this.floatingView.getMeasuredWidth());
                VoIPPiPView voIPPiPView3 = VoIPPiPView.this;
                float top = voIPPiPView3.floatingView.getTop() + voIPPiPView3.windowLayoutParams.y;
                float f4 = floatingView.topPadding;
                fArr[1] = (top - f4) / (((f2 - f4) - floatingView.bottomPadding) - VoIPPiPView.this.floatingView.getMeasuredHeight());
                fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, voIPPiPView.point[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, voIPPiPView.point[1]))).apply();
                try {
                    voIPPiPView.windowManager.removeView(voIPPiPView.windowView);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            PipSource pipSource = voIPPiPView.pipSource;
            if (pipSource != null) {
                pipSource.destroy();
                voIPPiPView.pipSource = null;
            }
            NotificationCenter.getGlobalInstance().removeObserver(voIPPiPView, NotificationCenter.didEndCall);
        }
        instance = null;
    }

    public static void show(Activity activity, int i, int i2, int i3, int i4) {
        if (instance != null || VideoCapturerDevice.eglBase == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        float f = i3;
        float f2 = f * 0.4f;
        float f3 = i2;
        float f4 = 0.4f * f3;
        layoutParams.height = (int) ((f * 0.25f) + ((((int) ((f2 * 1.05f) - f2)) / 2) * 2));
        layoutParams.width = (int) ((f3 * 0.25f) + ((((int) ((1.05f * f4) - f4)) / 2) * 2));
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (!AndroidUtilities.checkInlinePermissions(activity)) {
            layoutParams.type = 99;
        } else if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.flags = 16778120;
        instance = new VoIPPiPView(activity, i2, i3);
        WindowManager windowManager = AndroidUtilities.checkInlinePermissions(activity) ? (WindowManager) ApplicationLoader.applicationContext.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        VoIPPiPView voIPPiPView = instance;
        voIPPiPView.currentAccount = i;
        voIPPiPView.windowManager = windowManager;
        voIPPiPView.windowLayoutParams = layoutParams;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
        float f5 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f6 = sharedPreferences.getFloat("relativeY", 0.0f);
        VoIPPiPView voIPPiPView2 = instance;
        voIPPiPView2.getClass();
        Point point = AndroidUtilities.displaySize;
        float f7 = point.x;
        float f8 = point.y;
        float fDp = AndroidUtilities.dp(16.0f);
        float fDp2 = AndroidUtilities.dp(16.0f);
        float fDp3 = AndroidUtilities.dp(60.0f);
        float fDp4 = AndroidUtilities.dp(16.0f);
        float measuredWidth = voIPPiPView2.parentWidth * 0.25f;
        float measuredHeight = voIPPiPView2.parentHeight * 0.25f;
        if (voIPPiPView2.floatingView.getMeasuredWidth() != 0) {
            measuredWidth = voIPPiPView2.floatingView.getMeasuredWidth();
        }
        if (voIPPiPView2.floatingView.getMeasuredWidth() != 0) {
            measuredHeight = voIPPiPView2.floatingView.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = voIPPiPView2.windowLayoutParams;
        layoutParams2.x = (int) (((((f7 - fDp) - fDp2) - measuredWidth) * f5) - (voIPPiPView2.xOffset - fDp));
        layoutParams2.y = (int) (((((f8 - fDp3) - fDp4) - measuredHeight) * f6) - (voIPPiPView2.yOffset - fDp3));
        AndroidUtilities.updateViewLayout(voIPPiPView2.windowManager, voIPPiPView2.windowView, layoutParams2);
        NotificationCenter.getGlobalInstance().addObserver(instance, NotificationCenter.didEndCall);
        windowManager.addView(instance.windowView, layoutParams);
        instance.currentUserTextureView.renderer.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
        instance.callingUserTextureView.renderer.init(VideoCapturerDevice.eglBase.getEglBaseContext(), instance.rendererEvents);
        if (i4 == 0) {
            instance.windowView.setScaleX(0.5f);
            instance.windowView.setScaleY(0.5f);
            instance.windowView.setAlpha(0.0f);
            instance.windowView.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                VoIPPiPView voIPPiPView3 = instance;
                sharedInstance.setSinks(voIPPiPView3.currentUserTextureView.renderer, voIPPiPView3.callingUserTextureView.renderer);
            }
        } else if (i4 == 1) {
            instance.windowView.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                VoIPPiPView voIPPiPView4 = instance;
                sharedInstance2.setBackgroundSinks(voIPPiPView4.currentUserTextureView.renderer, voIPPiPView4.callingUserTextureView.renderer);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && PipUtils.checkPermissions(activity) == 1) {
            VoIPPiPView voIPPiPView5 = instance;
            PipSource.Builder builder = new PipSource.Builder(activity, voIPPiPView5);
            builder.tagPrefix = "voip-pip";
            builder.priority = 1;
            VoIPTextureView voIPTextureView = voIPPiPView5.callingUserTextureView;
            builder.contentView = voIPTextureView.renderer;
            builder.placeholderView = voIPTextureView.getPlaceholderView();
            voIPPiPView5.pipSource = builder.build();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didEndCall) {
            finish();
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        updateViewState();
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            PipSource pipSource = this.pipSource;
            if (pipSource != null) {
                pipSource.destroy();
                this.pipSource = null;
            }
        } else {
            Context context = instance.windowView.getContext();
            if (this.pipSource == null && PipUtils.checkPermissions(context) == 1 && (context instanceof Activity)) {
                PipSource.Builder builder = new PipSource.Builder((Activity) context, this);
                builder.tagPrefix = "voip-pip";
                builder.priority = 1;
                VoIPTextureView voIPTextureView = this.callingUserTextureView;
                builder.contentView = voIPTextureView.renderer;
                builder.placeholderView = voIPTextureView.getPlaceholderView();
                this.pipSource = builder.build();
            }
        }
        updateViewState();
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (!z && this.currentUserIsVideo) {
            sharedInstance.setVideoState(false, 1);
        } else if (z && sharedInstance.getVideoState(false) == 1) {
            sharedInstance.setVideoState(false, 2);
        }
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override
    public final void onStateChanged(int i) {
        if (i == 11 || i == 17 || i == 4 || i == 10) {
            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(16), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            finish();
        } else if (i != 3 || sharedInstance.isVideoAvailable()) {
            updateViewState();
        } else {
            finish();
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override
    public final View pipCreatePictureInPictureView() {
        VoIPTextureView voIPTextureView = new VoIPTextureView(this.callingUserTextureView.getContext(), false, true, false, false);
        this.pipTextureView = voIPTextureView;
        voIPTextureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.pipTextureView.renderer.setEnableHardwareScaler(true);
        this.pipTextureView.renderer.setRotateTextureWithScreen(true);
        VoIPTextureView voIPTextureView2 = this.pipTextureView;
        voIPTextureView2.scaleType = 1;
        voIPTextureView2.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new RendererCommon.RendererEvents() {
            @Override
            public final void onFirstFrameRendered() {
                VoIPPiPView voIPPiPView = VoIPPiPView.this;
                Trigger trigger = voIPPiPView.firstFrameCallback;
                if (trigger != null) {
                    trigger.run();
                    voIPPiPView.firstFrameCallback = null;
                }
            }

            @Override
            public final void onFrameResolutionChanged(int i, int i2, int i3) {
            }
        });
        View view = this.pipTextureView.backgroundView;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.pipTextureView;
    }

    @Override
    public final Bitmap pipCreatePictureInPictureViewBitmap() {
        VoIPTextureView voIPTextureView = this.pipTextureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return this.pipTextureView.renderer.getBitmap();
    }

    @Override
    public final Bitmap pipCreatePrimaryWindowViewBitmap() {
        VoIPTextureView voIPTextureView = this.callingUserTextureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return voIPTextureView.renderer.getBitmap();
    }

    @Override
    public final void pipHidePrimaryWindowView(Runnable runnable) {
        this.firstFrameCallback = (Trigger) runnable;
        VoIPTextureView voIPTextureView = this.callingUserTextureView;
        if (voIPTextureView != null) {
            voIPTextureView.renderer.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.currentUserTextureView.renderer, this.pipTextureView.renderer);
        }
        WindowManager windowManager = this.windowManager;
        ChatLoadingCell.AnonymousClass1 anonymousClass1 = this.windowView;
        windowManager.removeView(anonymousClass1);
        anonymousClass1.invalidate();
    }

    @Override
    public final boolean pipIsAvailable() {
        return true;
    }

    @Override
    public final void pipRenderBackground(Canvas canvas) {
    }

    @Override
    public final void pipRenderForeground(Canvas canvas) {
    }

    @Override
    public final void pipShowPrimaryWindowView(Runnable runnable) {
        this.firstFrameCallback = (Trigger) runnable;
        WindowManager windowManager = this.windowManager;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        ChatLoadingCell.AnonymousClass1 anonymousClass1 = this.windowView;
        windowManager.addView(anonymousClass1, layoutParams);
        VoIPTextureView voIPTextureView = this.pipTextureView;
        if (voIPTextureView != null) {
            voIPTextureView.renderer.release();
            this.pipTextureView = null;
        }
        anonymousClass1.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.currentUserTextureView.renderer, this.callingUserTextureView.renderer);
        }
    }

    public final void updateViewState() {
        boolean z = this.floatingView.getMeasuredWidth() != 0;
        boolean z2 = this.callingUserIsVideo;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.callingUserIsVideo = sharedInstance.getRemoteVideoState() == 2;
            this.currentUserIsVideo = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
            VoIPTextureView voIPTextureView = this.currentUserTextureView;
            voIPTextureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
            voIPTextureView.setIsScreencast(sharedInstance.isScreencast());
            voIPTextureView.setScreenshareMiniProgress(1.0f, false);
        }
        if (!z) {
            this.progressToCameraMini = this.callingUserIsVideo ? 1.0f : 0.0f;
            return;
        }
        if (z2 != this.callingUserIsVideo) {
            ValueAnimator valueAnimator = this.animatorToCameraMini;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progressToCameraMini, this.callingUserIsVideo ? 1.0f : 0.0f);
            this.animatorToCameraMini = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.animatorToCameraMiniUpdater);
            this.animatorToCameraMini.setDuration(300L).setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animatorToCameraMini.start();
        }
    }
}
