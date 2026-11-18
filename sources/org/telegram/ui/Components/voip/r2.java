package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.lr;
import org.telegram.ui.hc1;
import org.webrtc.OrientationHelper;
public abstract class r2 extends FrameLayout {
    public Activity f41190a;
    public boolean f41191b;
    public h2.f f41192c;
    public VelocityTracker d;
    public boolean f41193e;
    public boolean f41194f;
    public float h;
    public float f41195n;
    public boolean f41196r;

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
        if (!this.f41194f) {
            this.f41194f = true;
            if (hc1.f48331m1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = hc1.f48331m1.f48370u0.getMeasuredHeight();
                    if (hc1.f48331m1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        hc1 hc1Var = hc1.f48331m1;
                        h2.f(hc1Var.f48335b, hc1Var.f48332a, hc1Var.f48370u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = hc1.f48331m1.f48366r0;
                        if (windowInsets != null) {
                            h2.W = windowInsets.getSystemWindowInsetTop();
                            hc1.f48331m1.f48366r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                hc1.f48331m1.f48341d0.d.release();
                hc1.f48331m1.f48344e0.d.release();
                hc1.f48331m1.f48339c0.release();
                hc1.f48331m1.c();
            }
            hc1.f48331m1 = null;
            i2.g();
            if (this.f41191b) {
                try {
                    ((WindowManager) this.f41190a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f41192c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new x9(this, 19)).setDuration(j3).setInterpolator(lr.f37208f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.g0.O3(this.f41190a);
            setVisibility(8);
            ((WindowManager) this.f41190a.getSystemService("window")).removeView(this);
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
        if (!this.f41193e) {
            this.f41193e = true;
            if (!this.f41191b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(lr.f37208f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f41191b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f41195n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f41195n;
                if (!this.f41196r && Math.abs(y10) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(y10) / 3.0f > x10) {
                    this.f41195n = motionEvent.getY();
                    this.f41196r = true;
                    y10 = 0.0f;
                }
                if (this.f41196r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f41196r;
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
                this.f41196r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f41191b = z10;
    }
}
