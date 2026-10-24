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
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.zr;
import org.telegram.ui.nh1;
import org.webrtc.OrientationHelper;
public abstract class u2 extends FrameLayout {
    public Activity f31927a;
    public boolean f31928b;
    public AnimationNotificationsLocker f31929c;
    public VelocityTracker d;
    public boolean e;
    public boolean f31930f;
    public float h;
    public float f31931n;
    public boolean f31932r;

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

    public final void c(long j10) {
        if (!this.f31930f) {
            this.f31930f = true;
            if (nh1.f39825n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = nh1.f39825n1.f39864u0.getMeasuredHeight();
                    if (nh1.f39825n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        nh1 nh1Var = nh1.f39825n1;
                        k2.l(nh1Var.f39829b, nh1Var.f39826a, nh1Var.f39864u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = nh1.f39825n1.f39860r0;
                        if (windowInsets != null) {
                            k2.X = windowInsets.getSystemWindowInsetTop();
                            nh1.f39825n1.f39860r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                nh1.f39825n1.f39833c0.d.release();
                nh1.f39825n1.f39835d0.d.release();
                nh1.f39825n1.f39830b0.release();
                nh1.f39825n1.k();
            }
            nh1.f39825n1 = null;
            if (this.f31928b) {
                try {
                    ((WindowManager) this.f31927a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f31929c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new o31(this, 17)).setDuration(j10).setInterpolator(zr.f33337f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f31927a);
            setVisibility(8);
            ((WindowManager) this.f31927a.getSystemService("window")).removeView(this);
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
            if (!this.f31928b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(zr.f33337f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31928b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f31931n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f31931n;
                if (!this.f31932r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f31931n = motionEvent.getY();
                    this.f31932r = true;
                    y3 = 0.0f;
                }
                if (this.f31932r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f31932r;
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
                this.f31932r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f31928b = z10;
    }
}
