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
    public Activity f40942a;
    public boolean f40943b;
    public h2.f f40944c;
    public VelocityTracker d;
    public boolean f40945e;
    public boolean f40946f;
    public float h;
    public float f40947n;
    public boolean f40948r;

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
        if (!this.f40946f) {
            this.f40946f = true;
            if (ec1.f46680m1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ec1.f46680m1.f46719u0.getMeasuredHeight();
                    if (ec1.f46680m1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ec1 ec1Var = ec1.f46680m1;
                        i2.f(ec1Var.f46684b, ec1Var.f46681a, ec1Var.f46719u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ec1.f46680m1.f46715r0;
                        if (windowInsets != null) {
                            i2.W = windowInsets.getSystemWindowInsetTop();
                            ec1.f46680m1.f46715r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ec1.f46680m1.f46690d0.d.release();
                ec1.f46680m1.f46693e0.d.release();
                ec1.f46680m1.f46688c0.release();
                ec1.f46680m1.c();
            }
            ec1.f46680m1 = null;
            j2.g();
            if (this.f40943b) {
                try {
                    ((WindowManager) this.f40942a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f40944c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new w9(this, 19)).setDuration(j3).setInterpolator(er.f34420f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.g0.P3(this.f40942a);
            setVisibility(8);
            ((WindowManager) this.f40942a.getSystemService("window")).removeView(this);
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
        if (!this.f40945e) {
            this.f40945e = true;
            if (!this.f40943b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(er.f34420f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40943b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f40947n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f40947n;
                if (!this.f40948r && Math.abs(y10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(y10) / 3.0f > x10) {
                    this.f40947n = motionEvent.getY();
                    this.f40948r = true;
                    y10 = 0.0f;
                }
                if (this.f40948r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f40948r;
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
                this.f40948r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f40943b = z10;
    }
}
