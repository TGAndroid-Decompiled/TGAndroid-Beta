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
    public Activity f39404a;
    public boolean f39405b;
    public h2.f f39406c;
    public VelocityTracker d;
    public boolean f39407e;
    public boolean f39408f;
    public float h;
    public float f39409n;
    public boolean f39410r;

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
        if (!this.f39408f) {
            this.f39408f = true;
            if (ec1.l1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ec1.l1.f45308t0.getMeasuredHeight();
                    if (ec1.l1.C0 && !VoIPService.getSharedInstance().isConverting()) {
                        ec1 ec1Var = ec1.l1;
                        e2.f(ec1Var.f45274b, ec1Var.f45271a, ec1Var.f45308t0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ec1.l1.f45303q0;
                        if (windowInsets != null) {
                            e2.V = windowInsets.getSystemWindowInsetTop();
                            ec1.l1.f45303q0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ec1.l1.f45278c0.d.release();
                ec1.l1.f45280d0.d.release();
                ec1.l1.f45275b0.release();
                ec1.l1.c();
            }
            ec1.l1 = null;
            f2.d();
            if (this.f39405b) {
                try {
                    ((WindowManager) this.f39404a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f39406c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new va(this, 18)).setDuration(j3).setInterpolator(xq.f40345f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.g0.Q3(this.f39404a);
            setVisibility(8);
            ((WindowManager) this.f39404a.getSystemService("window")).removeView(this);
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
        if (!this.f39407e) {
            this.f39407e = true;
            if (!this.f39405b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(xq.f40345f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f39405b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f39409n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f39409n;
                if (!this.f39410r && Math.abs(y10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(y10) / 3.0f > x10) {
                    this.f39409n = motionEvent.getY();
                    this.f39410r = true;
                    y10 = 0.0f;
                }
                if (this.f39410r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f39410r;
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
                this.f39410r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z9) {
        this.f39405b = z9;
    }
}
