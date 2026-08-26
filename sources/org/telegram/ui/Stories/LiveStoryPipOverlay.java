package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.android.billingclient.api.zzcv;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.ui.ActionIntroActivity;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda97;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;
import org.webrtc.TextureViewRenderer;

public final class LiveStoryPipOverlay implements NotificationCenter.NotificationCenterDelegate, IPipSourceDelegate {
    public static final SimpleFloatPropertyCompat PIP_X_PROPERTY = new SimpleFloatPropertyCompat(new PhotoViewer$$ExternalSyntheticLambda97(23), new PhotoViewer$$ExternalSyntheticLambda97(24));
    public static final SimpleFloatPropertyCompat PIP_Y_PROPERTY = new SimpleFloatPropertyCompat(new PhotoViewer$$ExternalSyntheticLambda97(25), new PhotoViewer$$ExternalSyntheticLambda97(26));
    public static final LiveStoryPipOverlay instance = new LiveStoryPipOverlay();
    public Float aspectRatio;
    public BackupImageView avatarImageView;
    public View consumingChild;
    public IntroActivity.AnonymousClass1 contentFrameLayout;
    public ActionIntroActivity.AnonymousClass2 contentView;
    public FrameLayout controlsView;
    public int currentAccount;
    public PaymentFormActivity.AnonymousClass2 flickerView;
    public zzcv gestureDetector;
    public boolean isScrollDisallowed;
    public boolean isScrolling;
    public boolean isShowingControls;
    public boolean isVisible;
    public LivePlayer livePlayer;
    public int pipHeight;
    public PipSource pipSource;
    public LivePlayerView pipTextureView;
    public int pipWidth;
    public float pipX;
    public SpringAnimation pipXSpring;
    public float pipY;
    public SpringAnimation pipYSpring;
    public boolean postedDismissControls;
    public ValueAnimator scaleAnimator;
    public ScaleGestureDetector scaleGestureDetector;
    public LivePlayerView textureView;
    public WindowManager.LayoutParams windowLayoutParams;
    public WindowManager windowManager;
    public boolean windowViewSkipRender;
    public float maxScaleFactor = 1.4f;
    public boolean placeholderShown = true;
    public float scaleFactor = 1.0f;
    public final LivePlayer$1$$ExternalSyntheticLambda0 dismissControlsCallback = new LivePlayer$1$$ExternalSyntheticLambda0(this, 7);

    public final class AnonymousClass4 extends GestureDetector.SimpleOnGestureListener {
        public final int $r8$classId;
        public float startPipX;
        public float startPipY;
        public final Object this$0;
        public final int val$touchSlop;

        public AnonymousClass4(Object obj, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = obj;
            this.val$touchSlop = i;
        }

        @Override
        public final boolean onDown(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (liveStoryPipOverlay.isShowingControls) {
                        for (int i = 1; i < liveStoryPipOverlay.contentFrameLayout.getChildCount(); i++) {
                            View childAt = liveStoryPipOverlay.contentFrameLayout.getChildAt(i);
                            if (childAt.dispatchTouchEvent(motionEvent)) {
                                liveStoryPipOverlay.consumingChild = childAt;
                            }
                            break;
                        }
                        this.startPipX = liveStoryPipOverlay.pipX;
                        this.startPipY = liveStoryPipOverlay.pipY;
                    } else {
                        this.startPipX = liveStoryPipOverlay.pipX;
                        this.startPipY = liveStoryPipOverlay.pipY;
                    }
                    break;
                default:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (rTMPStreamPipOverlay.isShowingControls) {
                        for (int i2 = 1; i2 < rTMPStreamPipOverlay.contentFrameLayout.getChildCount(); i2++) {
                            View childAt2 = rTMPStreamPipOverlay.contentFrameLayout.getChildAt(i2);
                            if (childAt2.dispatchTouchEvent(motionEvent)) {
                                rTMPStreamPipOverlay.consumingChild = childAt2;
                            }
                            break;
                        }
                        this.startPipX = rTMPStreamPipOverlay.pipX;
                        this.startPipY = rTMPStreamPipOverlay.pipY;
                    } else {
                        this.startPipX = rTMPStreamPipOverlay.pipX;
                        this.startPipY = rTMPStreamPipOverlay.pipY;
                    }
                    break;
            }
            return true;
        }

        @Override
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            switch (this.$r8$classId) {
                case 0:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (!liveStoryPipOverlay.isScrolling || liveStoryPipOverlay.isScrollDisallowed) {
                        return false;
                    }
                    SpringAnimation springAnimation = liveStoryPipOverlay.pipXSpring;
                    springAnimation.mVelocity = f;
                    float f3 = liveStoryPipOverlay.pipX;
                    springAnimation.mValue = f3;
                    springAnimation.mStartValueIsSet = true;
                    SpringForce springForce = springAnimation.mSpring;
                    int i = liveStoryPipOverlay.pipWidth;
                    float f4 = (f / 7.0f) + (i / 2.0f) + f3;
                    int i2 = AndroidUtilities.displaySize.x;
                    springForce.mFinalPosition = f4 >= ((float) i2) / 2.0f ? (i2 - i) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    liveStoryPipOverlay.pipXSpring.start();
                    SpringAnimation springAnimation2 = liveStoryPipOverlay.pipYSpring;
                    springAnimation2.mVelocity = f;
                    float f5 = liveStoryPipOverlay.pipY;
                    springAnimation2.mValue = f5;
                    springAnimation2.mStartValueIsSet = true;
                    springAnimation2.mSpring.mFinalPosition = MathUtils.clamp((f2 / 10.0f) + f5, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - liveStoryPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                    liveStoryPipOverlay.pipYSpring.start();
                    return true;
                default:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (!rTMPStreamPipOverlay.isScrolling || rTMPStreamPipOverlay.isScrollDisallowed) {
                        return false;
                    }
                    SpringAnimation springAnimation3 = rTMPStreamPipOverlay.pipXSpring;
                    springAnimation3.mVelocity = f;
                    float f6 = rTMPStreamPipOverlay.pipX;
                    springAnimation3.mValue = f6;
                    springAnimation3.mStartValueIsSet = true;
                    SpringForce springForce2 = springAnimation3.mSpring;
                    int i3 = rTMPStreamPipOverlay.pipWidth;
                    float f7 = (f / 7.0f) + (i3 / 2.0f) + f6;
                    int i4 = AndroidUtilities.displaySize.x;
                    springForce2.mFinalPosition = f7 >= ((float) i4) / 2.0f ? (i4 - i3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    rTMPStreamPipOverlay.pipXSpring.start();
                    SpringAnimation springAnimation4 = rTMPStreamPipOverlay.pipYSpring;
                    springAnimation4.mVelocity = f;
                    float f8 = rTMPStreamPipOverlay.pipY;
                    springAnimation4.mValue = f8;
                    springAnimation4.mStartValueIsSet = true;
                    springAnimation4.mSpring.mFinalPosition = MathUtils.clamp((f2 / 10.0f) + f8, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rTMPStreamPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                    rTMPStreamPipOverlay.pipYSpring.start();
                    return true;
            }
        }

        @Override
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            switch (this.$r8$classId) {
                case 0:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (!liveStoryPipOverlay.isScrolling && liveStoryPipOverlay.scaleAnimator == null && !liveStoryPipOverlay.isScrollDisallowed) {
                        float fAbs = Math.abs(f);
                        float f3 = this.val$touchSlop;
                        if (fAbs >= f3 || Math.abs(f2) >= f3) {
                            liveStoryPipOverlay.isScrolling = true;
                            liveStoryPipOverlay.pipXSpring.cancel();
                            liveStoryPipOverlay.pipYSpring.cancel();
                        }
                    }
                    if (liveStoryPipOverlay.isScrolling) {
                        WindowManager.LayoutParams layoutParams = liveStoryPipOverlay.windowLayoutParams;
                        float rawX = (motionEvent2.getRawX() + this.startPipX) - motionEvent.getRawX();
                        liveStoryPipOverlay.pipX = rawX;
                        layoutParams.x = (int) rawX;
                        WindowManager.LayoutParams layoutParams2 = liveStoryPipOverlay.windowLayoutParams;
                        float rawY = (motionEvent2.getRawY() + this.startPipY) - motionEvent.getRawY();
                        liveStoryPipOverlay.pipY = rawY;
                        layoutParams2.y = (int) rawY;
                        AndroidUtilities.updateViewLayout(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, liveStoryPipOverlay.windowLayoutParams);
                    }
                    break;
                default:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (!rTMPStreamPipOverlay.isScrolling && rTMPStreamPipOverlay.scaleAnimator == null && !rTMPStreamPipOverlay.isScrollDisallowed) {
                        float fAbs2 = Math.abs(f);
                        float f4 = this.val$touchSlop;
                        if (fAbs2 >= f4 || Math.abs(f2) >= f4) {
                            rTMPStreamPipOverlay.isScrolling = true;
                            rTMPStreamPipOverlay.pipXSpring.cancel();
                            rTMPStreamPipOverlay.pipYSpring.cancel();
                        }
                    }
                    if (rTMPStreamPipOverlay.isScrolling) {
                        WindowManager.LayoutParams layoutParams3 = rTMPStreamPipOverlay.windowLayoutParams;
                        float rawX2 = (motionEvent2.getRawX() + this.startPipX) - motionEvent.getRawX();
                        rTMPStreamPipOverlay.pipX = rawX2;
                        layoutParams3.x = (int) rawX2;
                        WindowManager.LayoutParams layoutParams4 = rTMPStreamPipOverlay.windowLayoutParams;
                        float rawY2 = (motionEvent2.getRawY() + this.startPipY) - motionEvent.getRawY();
                        rTMPStreamPipOverlay.pipY = rawY2;
                        layoutParams4.y = (int) rawY2;
                        AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, rTMPStreamPipOverlay.windowLayoutParams);
                    }
                    break;
            }
            return true;
        }

        @Override
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (liveStoryPipOverlay.scaleAnimator == null) {
                        boolean z = liveStoryPipOverlay.postedDismissControls;
                        LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0 = liveStoryPipOverlay.dismissControlsCallback;
                        if (z) {
                            AndroidUtilities.cancelRunOnUIThread(livePlayer$1$$ExternalSyntheticLambda0);
                            liveStoryPipOverlay.postedDismissControls = false;
                        }
                        boolean z2 = !liveStoryPipOverlay.isShowingControls;
                        liveStoryPipOverlay.isShowingControls = z2;
                        liveStoryPipOverlay.toggleControls$1(z2);
                        if (liveStoryPipOverlay.isShowingControls && !liveStoryPipOverlay.postedDismissControls) {
                            AndroidUtilities.runOnUIThread(livePlayer$1$$ExternalSyntheticLambda0, 2500L);
                            liveStoryPipOverlay.postedDismissControls = true;
                        }
                    }
                    break;
                default:
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (rTMPStreamPipOverlay.scaleAnimator == null) {
                        boolean z3 = rTMPStreamPipOverlay.postedDismissControls;
                        Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = rTMPStreamPipOverlay.dismissControlsCallback;
                        if (z3) {
                            AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
                            rTMPStreamPipOverlay.postedDismissControls = false;
                        }
                        boolean z4 = !rTMPStreamPipOverlay.isShowingControls;
                        rTMPStreamPipOverlay.isShowingControls = z4;
                        rTMPStreamPipOverlay.toggleControls(z4);
                        if (rTMPStreamPipOverlay.isShowingControls && !rTMPStreamPipOverlay.postedDismissControls) {
                            AndroidUtilities.runOnUIThread(tooltip$$ExternalSyntheticLambda0, 2500L);
                            rTMPStreamPipOverlay.postedDismissControls = true;
                        }
                    }
                    break;
            }
            return true;
        }
    }

    public final void bindTextureView$1$1() {
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer != null) {
            livePlayer.setVolume(1.0f);
            LivePlayerView livePlayerView = this.pipTextureView;
            if (livePlayerView != null) {
                this.livePlayer.setDisplaySink(livePlayerView.getSink());
            } else {
                this.livePlayer.setDisplaySink(this.textureView.getSink());
            }
        }
        if (this.placeholderShown) {
            this.flickerView.animate().cancel();
            ViewPropertyAnimator duration = this.flickerView.animate().alpha(0.0f).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.avatarImageView.animate().cancel();
            this.avatarImageView.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.textureView.animate().cancel();
            this.textureView.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.placeholderShown = false;
        }
        if (this.pipWidth == getSuggestedWidth$1() * this.scaleFactor && this.pipHeight == getSuggestedHeight$1() * this.scaleFactor) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        int suggestedWidth$1 = (int) (getSuggestedWidth$1() * this.scaleFactor);
        this.pipWidth = suggestedWidth$1;
        layoutParams.width = suggestedWidth$1;
        WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
        int suggestedHeight$1 = (int) (getSuggestedHeight$1() * this.scaleFactor);
        this.pipHeight = suggestedHeight$1;
        layoutParams2.height = suggestedHeight$1;
        AndroidUtilities.updateViewLayout(this.windowManager, this.contentView, this.windowLayoutParams);
        SpringAnimation springAnimation = this.pipXSpring;
        float f = this.pipX;
        springAnimation.mValue = f;
        springAnimation.mStartValueIsSet = true;
        SpringForce springForce = springAnimation.mSpring;
        float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(getSuggestedWidth$1(), this.scaleFactor, 2.0f, f);
        float f2 = AndroidUtilities.displaySize.x;
        springForce.mFinalPosition = fM >= f2 / 2.0f ? (f2 - (getSuggestedWidth$1() * this.scaleFactor)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.pipXSpring.start();
        SpringAnimation springAnimation2 = this.pipYSpring;
        float f3 = this.pipY;
        springAnimation2.mValue = f3;
        springAnimation2.mStartValueIsSet = true;
        springAnimation2.mSpring.mFinalPosition = MathUtils.clamp(f3, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (getSuggestedHeight$1() * this.scaleFactor)) - AndroidUtilities.dp(16.0f));
        this.pipYSpring.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didEndCall) {
            instance.dismissInternal$1(true);
        } else if (i == NotificationCenter.groupCallUpdated) {
            bindTextureView$1$1();
        }
    }

    public final void dismissInternal$1(boolean z) {
        int i = 2;
        if (this.isVisible) {
            this.isVisible = false;
            AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda31(i), 100L);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.liveStoryUpdated);
            ValueAnimator valueAnimator = this.scaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.postedDismissControls) {
                AndroidUtilities.cancelRunOnUIThread(this.dismissControlsCallback);
                this.postedDismissControls = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.contentView, (Property<ActionIntroActivity.AnonymousClass2, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new TodoItemMenu.AnonymousClass15(i, this, z));
            animatorSet.start();
            PipSource pipSource = this.pipSource;
            if (pipSource != null) {
                pipSource.destroy();
                this.pipSource = null;
            }
        }
    }

    public final float getRatio$1() {
        if (this.aspectRatio == null) {
            this.aspectRatio = Float.valueOf(1.7777778f);
            Point point = AndroidUtilities.displaySize;
            this.maxScaleFactor = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / getSuggestedWidth$1();
        }
        return this.aspectRatio.floatValue();
    }

    public final int getSuggestedHeight$1() {
        return (int) (getRatio$1() * getSuggestedWidth$1());
    }

    public final int getSuggestedWidth$1() {
        float fMin;
        float f;
        if (getRatio$1() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            fMin = Math.min(point2.x, point2.y);
            f = 0.6f;
        }
        return (int) (fMin * f);
    }

    @Override
    public final View pipCreatePictureInPictureView() {
        LivePlayerView livePlayerView = new LivePlayerView(this.textureView.getContext(), this.currentAccount);
        this.pipTextureView = livePlayerView;
        return livePlayerView;
    }

    @Override
    public final Bitmap pipCreatePictureInPictureViewBitmap() {
        LivePlayerView livePlayerView = this.pipTextureView;
        if (livePlayerView == null) {
            return null;
        }
        TextureViewRenderer textureViewRenderer = livePlayerView.textureView;
        if (textureViewRenderer != null ? textureViewRenderer.isAvailable() : false) {
            return this.pipTextureView.getBitmap();
        }
        return null;
    }

    @Override
    public final Bitmap pipCreatePrimaryWindowViewBitmap() {
        LivePlayerView livePlayerView = this.textureView;
        if (livePlayerView == null) {
            return null;
        }
        TextureViewRenderer textureViewRenderer = livePlayerView.textureView;
        if (textureViewRenderer != null ? textureViewRenderer.isAvailable() : false) {
            return this.textureView.getBitmap();
        }
        return null;
    }

    @Override
    public final void pipHidePrimaryWindowView(Trigger trigger) {
        bindTextureView$1$1();
        this.windowViewSkipRender = true;
        this.windowManager.removeView(this.contentView);
        this.contentView.invalidate();
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
    public final void pipShowPrimaryWindowView(Trigger trigger) {
        PipSource pipSource = this.pipSource;
        if (pipSource != null && pipSource.params.isValid()) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            int iWidth = ((Rect) this.pipSource.params.binarizer).width();
            this.pipWidth = iWidth;
            layoutParams.width = iWidth;
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            int iHeight = ((Rect) this.pipSource.params.binarizer).height();
            this.pipHeight = iHeight;
            layoutParams2.height = iHeight;
        }
        this.windowViewSkipRender = false;
        this.windowManager.addView(this.contentView, this.windowLayoutParams);
        this.contentView.invalidate();
        LivePlayerView livePlayerView = this.pipTextureView;
        if (livePlayerView != null) {
            TextureViewRenderer textureViewRenderer = livePlayerView.textureView;
            if (textureViewRenderer != null) {
                textureViewRenderer.release();
            }
            livePlayerView.firstFrameRendered = false;
            livePlayerView.setTextureVisible(false, false);
            this.pipTextureView = null;
        }
        bindTextureView$1$1();
    }

    public final void toggleControls$1(boolean z) {
        int i = 0;
        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(200L);
        this.scaleAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.scaleAnimator.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 25));
        this.scaleAnimator.addListener(new AnonymousClass1(this, i));
        this.scaleAnimator.start();
    }

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final LiveStoryPipOverlay this$0;

        public AnonymousClass1(LiveStoryPipOverlay liveStoryPipOverlay, int i) {
            this.$r8$classId = i;
            this.this$0 = liveStoryPipOverlay;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.scaleAnimator = null;
                    break;
                default:
                    super.onAnimationEnd(animator);
                    break;
            }
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z) {
            View view;
            switch (this.$r8$classId) {
                case 1:
                    PipSource pipSource = this.this$0.pipSource;
                    if (pipSource != null && (view = pipSource.contentView) != null) {
                        pipSource.updateContentPosition(view);
                        break;
                    }
                    break;
                default:
                    super.onAnimationEnd(animator, z);
                    break;
            }
        }
    }
}
