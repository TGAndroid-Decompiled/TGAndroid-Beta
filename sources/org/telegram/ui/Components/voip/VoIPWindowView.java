package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.PhotoViewer$41$1;
import org.telegram.ui.VoIPFragment;
import org.webrtc.OrientationHelper;

public abstract class VoIPWindowView extends FrameLayout {
    public final Activity activity;
    public boolean finished;
    public boolean lockOnScreen;
    public final AnimationNotificationsLocker notificationsLocker;
    public boolean runEnterTransition;
    public boolean startDragging;
    public float startX;
    public float startY;
    public VelocityTracker velocityTracker;

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

    public static WindowManager.LayoutParams createWindowLayoutParams() {
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

    public final void finish(long j) {
        if (this.finished) {
            return;
        }
        this.finished = true;
        if (VoIPFragment.instance != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = VoIPFragment.instance.windowView.getMeasuredHeight();
                if (VoIPFragment.instance.canSwitchToPip && !VoIPService.getSharedInstance().isConverting()) {
                    VoIPFragment voIPFragment = VoIPFragment.instance;
                    VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 0);
                    WindowInsets windowInsets = VoIPFragment.instance.lastInsets;
                    if (windowInsets != null) {
                        VoIPPiPView.topInset = windowInsets.getSystemWindowInsetTop();
                        VoIPFragment.instance.lastInsets.getSystemWindowInsetBottom();
                    }
                }
            }
            VoIPFragment.instance.callingUserTextureView.renderer.release();
            VoIPFragment.instance.currentUserTextureView.renderer.release();
            VoIPFragment.instance.callingUserMiniTextureRenderer.release();
            VoIPFragment.instance.destroy$1$1();
        }
        VoIPFragment.instance = null;
        if (this.lockOnScreen) {
            try {
                ((WindowManager) this.activity.getSystemService("window")).removeView(this);
            } catch (Exception unused) {
            }
        } else {
            this.notificationsLocker.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new PhotoViewer$41$1(this, 2)).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.runEnterTransition) {
            return;
        }
        this.runEnterTransition = true;
        if (this.lockOnScreen) {
            return;
        }
        setTranslationY(getMeasuredHeight());
        setAlpha(0.0f);
        animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.lockOnScreen) {
            if (motionEvent.getAction() == 0) {
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.clear();
                return false;
            }
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
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z) {
        this.lockOnScreen = z;
    }
}
