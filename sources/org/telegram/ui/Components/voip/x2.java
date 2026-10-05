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
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.tr;
import org.telegram.ui.ki1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f32363a;
    public boolean f32364b;
    public AnimationNotificationsLocker f32365c;
    public VelocityTracker d;
    public boolean f32366e;
    public boolean f32367f;
    public float h;
    public float f32368n;
    public boolean f32369r;

    public static WindowManager.LayoutParams a() {
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

    public final void b() {
        c(330L);
    }

    public final void c(long j3) {
        if (!this.f32367f) {
            this.f32367f = true;
            if (ki1.f38017n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ki1.f38017n1.f38057u0.getMeasuredHeight();
                    if (ki1.f38017n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ki1 ki1Var = ki1.f38017n1;
                        n2.l(ki1Var.f38021b, ki1Var.f38018a, ki1Var.f38057u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ki1.f38017n1.f38053r0;
                        if (windowInsets != null) {
                            n2.W = windowInsets.getSystemWindowInsetTop();
                            ki1.f38017n1.f38053r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ki1.f38017n1.f38025c0.d.release();
                ki1.f38017n1.f38027d0.d.release();
                ki1.f38017n1.f38022b0.release();
                ki1.f38017n1.l();
            }
            ki1.f38017n1 = null;
            if (this.f32364b) {
                try {
                    ((WindowManager) this.f32363a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f32365c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new b91(this, 11)).setDuration(j3).setInterpolator(tr.f31215f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f32363a);
            setVisibility(8);
            ((WindowManager) this.f32363a.getSystemService("window")).removeView(this);
            OrientationHelper.cameraRotationDisabled = false;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f32366e) {
            this.f32366e = true;
            if (!this.f32364b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(tr.f31215f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32364b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f32368n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f32368n;
                if (!this.f32369r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f32368n = motionEvent.getY();
                    this.f32369r = true;
                    y3 = 0.0f;
                }
                if (this.f32369r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f32369r;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                float translationY = getTranslationY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.computeCurrentVelocity(1000);
                float xVelocity = this.d.getXVelocity();
                float yVelocity = this.d.getYVelocity();
                if (translationY < getMeasuredHeight() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    animate().translationY(0.0f).start();
                } else {
                    c(Math.max((int) ((200.0f / getMeasuredHeight()) * (getMeasuredHeight() - getTranslationY())), 50));
                }
                this.f32369r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f32364b = z10;
    }
}
