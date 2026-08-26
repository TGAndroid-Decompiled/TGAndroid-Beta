package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.transition.TransitionValues;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.VoIPFragment;
import org.webrtc.OrientationHelper;

public abstract class VoIPWindowView extends FrameLayout {
    Activity activity;
    boolean finished;
    protected boolean lockOnScreen;
    private AnimationNotificationsLocker notificationsLocker;
    boolean runEnterTransition;
    boolean startDragging;
    float startX;
    float startY;
    VelocityTracker velocityTracker;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            AnimatorSet animatorSet;
            switch (this.$r8$classId) {
                case 0:
                    ((VoIPWindowView) this.this$0).notificationsLocker.unlock();
                    AndroidUtilities.unlockOrientation(((VoIPWindowView) this.this$0).activity);
                    if (((VoIPWindowView) this.this$0).getParent() != null) {
                        WindowManager windowManager = (WindowManager) ((VoIPWindowView) this.this$0).activity.getSystemService("window");
                        ((VoIPWindowView) this.this$0).setVisibility(8);
                        try {
                            windowManager.removeView((VoIPWindowView) this.this$0);
                            break;
                        } catch (Exception unused) {
                        }
                        OrientationHelper.cameraRotationDisabled = false;
                    }
                    break;
                case 1:
                    super.onAnimationEnd(animator);
                    ((TransitionValues) this.this$0).view.setEnabled(true);
                    break;
                case 2:
                    GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = (GroupCallMiniTextureView.AnonymousClass1) this.this$0;
                    if (GroupCallMiniTextureView.this.blurredFlippingStub.getParent() != null) {
                        GroupCallMiniTextureView groupCallMiniTextureView = GroupCallMiniTextureView.this;
                        groupCallMiniTextureView.textureView.removeView(groupCallMiniTextureView.blurredFlippingStub);
                    }
                    break;
                case 3:
                    super.onAnimationEnd(animator);
                    PrivateVideoPreviewDialog privateVideoPreviewDialog = (PrivateVideoPreviewDialog) this.this$0;
                    if (privateVideoPreviewDialog.getParent() != null) {
                        ((ViewGroup) privateVideoPreviewDialog.getParent()).removeView(privateVideoPreviewDialog);
                    }
                    break;
                case 4:
                    VoIPBackgroundProvider voIPBackgroundProvider = (VoIPBackgroundProvider) this.this$0;
                    voIPBackgroundProvider.hasVideo = false;
                    voIPBackgroundProvider.darkPaint.setAlpha(35);
                    voIPBackgroundProvider.darkVideoPaint.setAlpha(102);
                    voIPBackgroundProvider.whiteVideoPaint.setAlpha(35);
                    voIPBackgroundProvider.invalidateViews();
                    break;
                case 5:
                    VoIPFloatingLayout voIPFloatingLayout = VoIPFloatingLayout.this;
                    voIPFloatingLayout.switchingToFloatingMode = false;
                    voIPFloatingLayout.requestLayout();
                    break;
                case 6:
                    VoIPTextureView voIPTextureView = (VoIPTextureView) this.this$0;
                    voIPTextureView.currentClipVertical = 0.0f;
                    voIPTextureView.currentClipHorizontal = 0.0f;
                    voIPTextureView.renderer.setScaleX(voIPTextureView.scaleTextureToFill);
                    voIPTextureView.renderer.setScaleY(voIPTextureView.scaleTextureToFill);
                    TextureView textureView = voIPTextureView.blurRenderer;
                    if (textureView != null) {
                        textureView.setScaleX(voIPTextureView.scaleTextureToFillBlur);
                        voIPTextureView.blurRenderer.setScaleY(voIPTextureView.scaleTextureToFillBlur);
                    }
                    voIPTextureView.setTranslationY(0.0f);
                    voIPTextureView.setTranslationX(0.0f);
                    voIPTextureView.currentThumbScale = voIPTextureView.scaleThumb;
                    voIPTextureView.currentAnimation = null;
                    break;
                case 7:
                    VoIPToggleButton voIPToggleButton = (VoIPToggleButton) this.this$0;
                    voIPToggleButton.checkedProgress = voIPToggleButton.checked ? 1.0f : 0.0f;
                    voIPToggleButton.setBackgroundColor(voIPToggleButton.backgroundCheck1, voIPToggleButton.backgroundCheck2);
                    break;
                case 8:
                    VoIpGradientLayout voIpGradientLayout = (VoIpGradientLayout) this.this$0;
                    voIpGradientLayout.showClip = false;
                    voIpGradientLayout.backgroundProvider.isReveal = false;
                    if (voIpGradientLayout.allowAnimations && (animatorSet = voIpGradientLayout.defaultAnimatorSet) != null) {
                        animatorSet.cancel();
                        voIpGradientLayout.defaultAnimatorSet.start();
                    }
                    voIpGradientLayout.switchToConnectedAnimator();
                    break;
                default:
                    ((VoIpSwitchLayout) this.this$0).newTextView.setVisibility(8);
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    super.onAnimationStart(animator);
                    ((TransitionValues) this.this$0).view.setEnabled(false);
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public VoIPWindowView(Activity activity, boolean z) {
        super(activity);
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.activity = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (z) {
            return;
        }
        this.runEnterTransition = true;
    }

    public WindowManager.LayoutParams createWindowLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.format = -2;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.screenOrientation = 1;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2144665216;
        return layoutParams;
    }

    public void finish() {
        finish(330L);
    }

    public void finishImmediate() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.activity);
            WindowManager windowManager = (WindowManager) this.activity.getSystemService("window");
            setVisibility(8);
            windowManager.removeView(this);
            OrientationHelper.cameraRotationDisabled = false;
        }
    }

    public boolean isLockOnScreen() {
        return this.lockOnScreen;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.runEnterTransition) {
            return;
        }
        this.runEnterTransition = true;
        startEnterTransition();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.lockOnScreen) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.clear();
        } else {
            if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX() - this.startX;
                float y = motionEvent.getY() - this.startY;
                if (!this.startDragging && Math.abs(y) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y) / 3.0f > x) {
                    this.startY = motionEvent.getY();
                    this.startDragging = true;
                    y = 0.0f;
                }
                if (this.startDragging) {
                    float f = y >= 0.0f ? y : 0.0f;
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                    setTranslationY(f);
                }
                return this.startDragging;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                float translationY = getTranslationY();
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = this.velocityTracker.getXVelocity();
                float yVelocity = this.velocityTracker.getYVelocity();
                if (translationY >= getMeasuredHeight() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    finish(Math.max((int) ((200.0f / getMeasuredHeight()) * (getMeasuredHeight() - getTranslationY())), 50));
                } else {
                    animate().translationY(0.0f).start();
                }
                this.startDragging = false;
            }
        }
        return false;
    }

    public void requestFullscreen(boolean z) {
        if (z) {
            setSystemUiVisibility(getSystemUiVisibility() | 4);
        } else {
            setSystemUiVisibility(getSystemUiVisibility() & (-5));
        }
    }

    public void setLockOnScreen(boolean z) {
        this.lockOnScreen = z;
    }

    public void startEnterTransition() {
        if (this.lockOnScreen) {
            return;
        }
        setTranslationY(getMeasuredHeight());
        setAlpha(0.0f);
        animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    public void finish(long j) {
        if (this.finished) {
            return;
        }
        this.finished = true;
        VoIPFragment.clearInstance();
        if (this.lockOnScreen) {
            try {
                ((WindowManager) this.activity.getSystemService("window")).removeView(this);
            } catch (Exception unused) {
            }
        } else {
            this.notificationsLocker.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new AnonymousClass1(this, 0)).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
    }
}
