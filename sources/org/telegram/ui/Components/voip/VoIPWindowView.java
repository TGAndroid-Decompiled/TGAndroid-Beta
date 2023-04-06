package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.VoIPFragment;
public class VoIPWindowView extends FrameLayout {
    Activity activity;
    private int animationIndex;
    boolean finished;
    protected boolean lockOnScreen;
    private int orientationBefore;
    boolean runEnterTransition;
    boolean startDragging;
    float startX;
    float startY;
    VelocityTracker velocityTracker;

    public VoIPWindowView(Activity activity, boolean z) {
        super(activity);
        this.animationIndex = -1;
        this.activity = activity;
        setSystemUiVisibility(1792);
        setFitsSystemWindows(true);
        this.orientationBefore = activity.getRequestedOrientation();
        activity.setRequestedOrientation(1);
        if (z) {
            return;
        }
        this.runEnterTransition = true;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.runEnterTransition) {
            return;
        }
        this.runEnterTransition = true;
        startEnterTransition();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
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
            boolean z = true;
            if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX() - this.startX;
                float y = motionEvent.getY() - this.startY;
                if (!this.startDragging && Math.abs(x) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x) / 3.0f > y) {
                    this.startX = motionEvent.getX();
                    this.startDragging = true;
                    x = 0.0f;
                }
                if (this.startDragging) {
                    float f = x >= 0.0f ? x : 0.0f;
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                    setTranslationX(f);
                }
                return this.startDragging;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                float translationX = getTranslationX();
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = this.velocityTracker.getXVelocity();
                float yVelocity = this.velocityTracker.getYVelocity();
                if (translationX >= getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    z = false;
                }
                if (!z) {
                    finish(Math.max((int) ((200.0f / getMeasuredWidth()) * (getMeasuredWidth() - getTranslationX())), 50));
                } else {
                    animate().translationX(0.0f).start();
                }
                this.startDragging = false;
            }
        }
        return false;
    }

    public void finish() {
        finish(150L);
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
                return;
            } catch (Exception unused) {
                return;
            }
        }
        final int i = UserConfig.selectedAccount;
        this.animationIndex = NotificationCenter.getInstance(i).setAnimationInProgress(this.animationIndex, null);
        animate().translationX(getMeasuredWidth()).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                NotificationCenter.getInstance(i).onAnimationFinish(VoIPWindowView.this.animationIndex);
                if (VoIPWindowView.this.getParent() != null) {
                    VoIPWindowView voIPWindowView = VoIPWindowView.this;
                    voIPWindowView.activity.setRequestedOrientation(voIPWindowView.orientationBefore);
                    WindowManager windowManager = (WindowManager) VoIPWindowView.this.activity.getSystemService("window");
                    VoIPWindowView.this.setVisibility(8);
                    try {
                        windowManager.removeView(VoIPWindowView.this);
                    } catch (Exception unused2) {
                    }
                }
            }
        }).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    public void startEnterTransition() {
        if (this.lockOnScreen) {
            return;
        }
        setTranslationX(getMeasuredWidth());
        animate().translationX(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    public void setLockOnScreen(boolean z) {
        this.lockOnScreen = z;
    }

    public WindowManager.LayoutParams createWindowLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.format = -2;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.screenOrientation = 1;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        if (i >= 21) {
            layoutParams.flags = -2147286784;
        } else {
            layoutParams.flags = 131072;
        }
        layoutParams.flags |= 2621568;
        return layoutParams;
    }

    public boolean isLockOnScreen() {
        return this.lockOnScreen;
    }

    public void requestFullscreen(boolean z) {
        if (z) {
            setSystemUiVisibility(getSystemUiVisibility() | 4);
        } else {
            setSystemUiVisibility(getSystemUiVisibility() & (-5));
        }
    }

    public void finishImmediate() {
        if (getParent() != null) {
            this.activity.setRequestedOrientation(this.orientationBefore);
            setVisibility(8);
            ((WindowManager) this.activity.getSystemService("window")).removeView(this);
        }
    }
}
