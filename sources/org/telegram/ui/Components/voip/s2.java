package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.er;
import org.telegram.ui.ec1;
import org.webrtc.OrientationHelper;
public abstract class s2 extends FrameLayout {
    public Activity f40945a;
    public boolean f40946b;
    public h2.f f40947c;
    public VelocityTracker d;
    public boolean f40948e;
    public boolean f40949f;
    public float h;
    public float f40950n;
    public boolean f40951r;

    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.format = -2;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.screenOrientation = 1;
        org.telegram.messenger.g0.m(layoutParams);
        layoutParams.flags = -2144665216;
        return layoutParams;
    }

    public final void b() {
        c(330L);
    }

    public final void c(long j3) {
        if (!this.f40949f) {
            this.f40949f = true;
            if (ec1.f46670m1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ec1.f46670m1.f46709u0.getMeasuredHeight();
                    if (ec1.f46670m1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ec1 ec1Var = ec1.f46670m1;
                        i2.f(ec1Var.f46674b, ec1Var.f46671a, ec1Var.f46709u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ec1.f46670m1.f46705r0;
                        if (windowInsets != null) {
                            i2.W = windowInsets.getSystemWindowInsetTop();
                            ec1.f46670m1.f46705r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ec1.f46670m1.f46680d0.d.release();
                ec1.f46670m1.f46683e0.d.release();
                ec1.f46670m1.f46678c0.release();
                ec1.f46670m1.c();
            }
            ec1.f46670m1 = null;
            j2.g();
            if (this.f40946b) {
                try {
                    ((WindowManager) this.f40945a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f40947c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new w9(this, 19)).setDuration(j3).setInterpolator(er.f34419f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.g0.P3(this.f40945a);
            setVisibility(8);
            ((WindowManager) this.f40945a.getSystemService("window")).removeView(this);
            OrientationHelper.cameraRotationDisabled = false;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f40948e) {
            this.f40948e = true;
            if (!this.f40946b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(er.f34419f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40946b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f40950n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f40950n;
                if (!this.f40951r && Math.abs(y10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(y10) / 3.0f > x10) {
                    this.f40950n = motionEvent.getY();
                    this.f40951r = true;
                    y10 = 0.0f;
                }
                if (this.f40951r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f40951r;
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
                this.f40951r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f40946b = z10;
    }
}
