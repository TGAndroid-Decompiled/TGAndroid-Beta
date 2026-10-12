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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.o91;
import org.telegram.ui.xi1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f32108a;
    public boolean f32109b;
    public AnimationNotificationsLocker f32110c;
    public VelocityTracker d;
    public boolean f32111e;
    public boolean f32112f;
    public float h;
    public float f32113n;
    public boolean f32114r;

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
        if (!this.f32112f) {
            this.f32112f = true;
            if (xi1.f43977n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = xi1.f43977n1.f44017u0.getMeasuredHeight();
                    if (xi1.f43977n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        xi1 xi1Var = xi1.f43977n1;
                        n2.l(xi1Var.f43981b, xi1Var.f43978a, xi1Var.f44017u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = xi1.f43977n1.f44013r0;
                        if (windowInsets != null) {
                            n2.X = windowInsets.getSystemWindowInsetTop();
                            xi1.f43977n1.f44013r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                xi1.f43977n1.f43985c0.d.release();
                xi1.f43977n1.f43987d0.d.release();
                xi1.f43977n1.f43982b0.release();
                xi1.f43977n1.k();
            }
            xi1.f43977n1 = null;
            if (this.f32109b) {
                try {
                    ((WindowManager) this.f32108a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f32110c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new o91(this, 11)).setDuration(j3).setInterpolator(js.f27627f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f32108a);
            setVisibility(8);
            ((WindowManager) this.f32108a.getSystemService("window")).removeView(this);
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
        if (!this.f32111e) {
            this.f32111e = true;
            if (!this.f32109b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(js.f27627f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32109b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f32113n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f32113n;
                if (!this.f32114r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f32113n = motionEvent.getY();
                    this.f32114r = true;
                    y3 = 0.0f;
                }
                if (this.f32114r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f32114r;
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
                this.f32114r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f32109b = z10;
    }
}
