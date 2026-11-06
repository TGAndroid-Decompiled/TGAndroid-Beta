package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ec1;
import org.telegram.ui.va;
import org.webrtc.OrientationHelper;
public abstract class o2 extends FrameLayout {
    public Activity f39383a;
    public boolean f39384b;
    public h2.f f39385c;
    public VelocityTracker d;
    public boolean f39386e;
    public boolean f39387f;
    public float h;
    public float f39388n;
    public boolean f39389r;

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
        if (!this.f39387f) {
            this.f39387f = true;
            if (ec1.l1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ec1.l1.f45309t0.getMeasuredHeight();
                    if (ec1.l1.C0 && !VoIPService.getSharedInstance().isConverting()) {
                        ec1 ec1Var = ec1.l1;
                        e2.f(ec1Var.f45275b, ec1Var.f45272a, ec1Var.f45309t0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ec1.l1.f45304q0;
                        if (windowInsets != null) {
                            e2.V = windowInsets.getSystemWindowInsetTop();
                            ec1.l1.f45304q0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ec1.l1.f45279c0.d.release();
                ec1.l1.f45281d0.d.release();
                ec1.l1.f45276b0.release();
                ec1.l1.c();
            }
            ec1.l1 = null;
            f2.d();
            if (this.f39384b) {
                try {
                    ((WindowManager) this.f39383a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f39385c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new va(this, 18)).setDuration(j3).setInterpolator(xq.f40329f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.g0.Q3(this.f39383a);
            setVisibility(8);
            ((WindowManager) this.f39383a.getSystemService("window")).removeView(this);
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
        if (!this.f39386e) {
            this.f39386e = true;
            if (!this.f39384b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(xq.f40329f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f39384b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f39388n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f39388n;
                if (!this.f39389r && Math.abs(y10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(y10) / 3.0f > x10) {
                    this.f39388n = motionEvent.getY();
                    this.f39389r = true;
                    y10 = 0.0f;
                }
                if (this.f39389r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f39389r;
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
                this.f39389r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z9) {
        this.f39384b = z9;
    }
}
