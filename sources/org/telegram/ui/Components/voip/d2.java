package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.xq;
import org.telegram.ui.zb1;
import org.webrtc.OrientationHelper;
public abstract class d2 extends FrameLayout {
    public Activity f39288a;
    public boolean f39289b;
    public g2.g f39290c;
    public VelocityTracker d;
    public boolean f39291e;
    public boolean f39292f;
    public float h;
    public float f39293n;
    public boolean f39294r;

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

    public final void c(long j10) {
        if (!this.f39292f) {
            this.f39292f = true;
            if (zb1.f52603o1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = zb1.f52603o1.f52644v0.getMeasuredHeight();
                    if (zb1.f52603o1.E0 && !VoIPService.getSharedInstance().isConverting()) {
                        zb1 zb1Var = zb1.f52603o1;
                        u1.e(zb1Var.f52607b, zb1Var.f52604a, zb1Var.f52644v0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = zb1.f52603o1.f52641s0;
                        if (windowInsets != null) {
                            u1.Y = windowInsets.getSystemWindowInsetTop();
                            zb1.f52603o1.f52641s0.getSystemWindowInsetBottom();
                        }
                    }
                }
                zb1.f52603o1.f52613d0.d.release();
                zb1.f52603o1.f52616e0.d.release();
                zb1.f52603o1.f52611c0.release();
                zb1.f52603o1.d();
            }
            zb1.f52603o1 = null;
            if (this.f39289b) {
                try {
                    ((WindowManager) this.f39288a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f39290c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new w9(this, 18)).setDuration(j10).setInterpolator(xq.f40452f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            org.telegram.messenger.g0.Q3(this.f39288a);
            setVisibility(8);
            ((WindowManager) this.f39288a.getSystemService("window")).removeView(this);
            OrientationHelper.cameraRotationDisabled = false;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (!this.f39291e) {
            this.f39291e = true;
            if (!this.f39289b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(xq.f40452f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f39289b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f39293n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y9 = motionEvent.getY() - this.f39293n;
                if (!this.f39294r && Math.abs(y9) > org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(y9) / 3.0f > x10) {
                    this.f39293n = motionEvent.getY();
                    this.f39294r = true;
                    y9 = 0.0f;
                }
                if (this.f39294r) {
                    if (y9 >= 0.0f) {
                        f10 = y9;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f39294r;
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
                this.f39294r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f39289b = z10;
    }
}
