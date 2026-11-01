package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.gr;
import org.telegram.ui.s9;
import org.telegram.ui.zd1;
import org.webrtc.OrientationHelper;
public abstract class d2 extends FrameLayout {
    public Activity f31445a;
    public boolean f31446b;
    public e2.f f31447c;
    public VelocityTracker d;
    public boolean e;
    public boolean f31448f;
    public float h;
    public float f31449n;
    public boolean f31450r;

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
        if (!this.f31448f) {
            this.f31448f = true;
            if (zd1.f43934n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = zd1.f43934n1.f43973u0.getMeasuredHeight();
                    if (zd1.f43934n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        zd1 zd1Var = zd1.f43934n1;
                        u1.e(zd1Var.f43938b, zd1Var.f43935a, zd1Var.f43973u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = zd1.f43934n1.f43969r0;
                        if (windowInsets != null) {
                            u1.X = windowInsets.getSystemWindowInsetTop();
                            zd1.f43934n1.f43969r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                zd1.f43934n1.f43942c0.d.release();
                zd1.f43934n1.f43944d0.d.release();
                zd1.f43934n1.f43939b0.release();
                zd1.f43934n1.d();
            }
            zd1.f43934n1 = null;
            if (this.f31446b) {
                try {
                    ((WindowManager) this.f31445a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f31447c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new s9(this, 29)).setDuration(j10).setInterpolator(gr.f26523f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.i0.P3(this.f31445a);
            setVisibility(8);
            ((WindowManager) this.f31445a.getSystemService("window")).removeView(this);
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
            if (!this.f31446b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(gr.f26523f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31446b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f31449n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f31449n;
                if (!this.f31450r && Math.abs(y3) > org.telegram.messenger.i0.a1(true, 0.4f) && Math.abs(y3) / 3.0f > x10) {
                    this.f31449n = motionEvent.getY();
                    this.f31450r = true;
                    y3 = 0.0f;
                }
                if (this.f31450r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f31450r;
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
                this.f31450r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f31446b = z10;
    }
}
