package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.gr;
import org.telegram.ui.be1;
import org.telegram.ui.s9;
import org.webrtc.OrientationHelper;
public abstract class c2 extends FrameLayout {
    public Activity f31368a;
    public boolean f31369b;
    public e2.f f31370c;
    public VelocityTracker d;
    public boolean e;
    public boolean f31371f;
    public float h;
    public float f31372n;
    public boolean f31373r;

    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.format = -2;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.screenOrientation = 1;
        org.telegram.messenger.i0.m(layoutParams);
        layoutParams.flags = -2144665216;
        return layoutParams;
    }

    public final void b() {
        c(330L);
    }

    public final void c(long j10) {
        if (!this.f31371f) {
            this.f31371f = true;
            if (be1.f36195n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = be1.f36195n1.f36234u0.getMeasuredHeight();
                    if (be1.f36195n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        be1 be1Var = be1.f36195n1;
                        t1.e(be1Var.f36199b, be1Var.f36196a, be1Var.f36234u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = be1.f36195n1.f36230r0;
                        if (windowInsets != null) {
                            t1.X = windowInsets.getSystemWindowInsetTop();
                            be1.f36195n1.f36230r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                be1.f36195n1.f36203c0.d.release();
                be1.f36195n1.f36205d0.d.release();
                be1.f36195n1.f36200b0.release();
                be1.f36195n1.d();
            }
            be1.f36195n1 = null;
            if (this.f31369b) {
                try {
                    ((WindowManager) this.f31368a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f31370c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new s9(this, 29)).setDuration(j10).setInterpolator(gr.f26495f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.i0.P3(this.f31368a);
            setVisibility(8);
            ((WindowManager) this.f31368a.getSystemService("window")).removeView(this);
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
        if (!this.e) {
            this.e = true;
            if (!this.f31369b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(gr.f26495f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31369b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f31372n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f31372n;
                if (!this.f31373r && Math.abs(y3) > org.telegram.messenger.i0.a1(true, 0.4f) && Math.abs(y3) / 3.0f > x10) {
                    this.f31372n = motionEvent.getY();
                    this.f31373r = true;
                    y3 = 0.0f;
                }
                if (this.f31373r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f31373r;
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
                this.f31373r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f31369b = z10;
    }
}
