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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f11;
import org.telegram.ui.lh1;
import org.webrtc.OrientationHelper;

public abstract class v2 extends FrameLayout {

    public Activity f33957a;

    public boolean f33958b;

    public AnimationNotificationsLocker f33959c;
    public VelocityTracker d;

    public boolean f33960e;

    public boolean f33961f;
    public float h;

    public float f33962n;

    public boolean f33963r;

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
        if (this.f33961f) {
            return;
        }
        this.f33961f = true;
        if (lh1.f40088j1 != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = lh1.f40088j1.f40119q0.getMeasuredHeight();
                if (lh1.f40088j1.f40133z0 && !VoIPService.getSharedInstance().isConverting()) {
                    lh1 lh1Var = lh1.f40088j1;
                    l2.l(lh1Var.f40092b, lh1Var.f40089a, lh1Var.f40119q0.getMeasuredWidth(), measuredHeight, 0);
                    WindowInsets windowInsets = lh1.f40088j1.f40116n0;
                    if (windowInsets != null) {
                        l2.S = windowInsets.getSystemWindowInsetTop();
                        lh1.f40088j1.f40116n0.getSystemWindowInsetBottom();
                    }
                }
            }
            lh1.f40088j1.Y.d.release();
            lh1.f40088j1.Z.d.release();
            lh1.f40088j1.X.release();
            lh1.f40088j1.l();
        }
        lh1.f40088j1 = null;
        if (this.f33958b) {
            try {
                ((WindowManager) this.f33957a.getSystemService("window")).removeView(this);
            } catch (Exception unused) {
            }
        } else {
            this.f33959c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new f11(this, 18)).setDuration(j10).setInterpolator(er.f28122f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f33957a);
            WindowManager windowManager = (WindowManager) this.f33957a.getSystemService("window");
            setVisibility(8);
            windowManager.removeView(this);
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
        if (this.f33960e) {
            return;
        }
        this.f33960e = true;
        if (this.f33958b) {
            return;
        }
        setTranslationY(getMeasuredHeight());
        setAlpha(0.0f);
        animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(er.f28122f).start();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33958b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f33962n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            if (motionEvent.getAction() == 2) {
                float x8 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f33962n;
                if (!this.f33963r && Math.abs(y10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y10) / 3.0f > x8) {
                    this.f33962n = motionEvent.getY();
                    this.f33963r = true;
                    y10 = 0.0f;
                }
                if (this.f33963r) {
                    float f10 = y10 >= 0.0f ? y10 : 0.0f;
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f33963r;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                float translationY = getTranslationY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.computeCurrentVelocity(1000);
                float xVelocity = this.d.getXVelocity();
                float yVelocity = this.d.getYVelocity();
                if (translationY >= getMeasuredHeight() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    c(Math.max((int) ((200.0f / getMeasuredHeight()) * (getMeasuredHeight() - getTranslationY())), 50));
                } else {
                    animate().translationY(0.0f).start();
                }
                this.f33963r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f33958b = z10;
    }
}
