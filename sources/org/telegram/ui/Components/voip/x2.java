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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.i31;
import org.telegram.ui.rh1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f34311a;
    public boolean f34312b;
    public AnimationNotificationsLocker f34313c;
    public VelocityTracker d;
    public boolean e;
    public boolean f34314f;
    public float h;
    public float f34315n;
    public boolean f34316r;

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
        if (!this.f34314f) {
            this.f34314f = true;
            if (rh1.f42999n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = rh1.f42999n1.f43038u0.getMeasuredHeight();
                    if (rh1.f42999n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        rh1 rh1Var = rh1.f42999n1;
                        n2.l(rh1Var.f43003b, rh1Var.f43000a, rh1Var.f43038u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = rh1.f42999n1.f43034r0;
                        if (windowInsets != null) {
                            n2.X = windowInsets.getSystemWindowInsetTop();
                            rh1.f42999n1.f43034r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                rh1.f42999n1.f43007c0.d.release();
                rh1.f42999n1.f43009d0.d.release();
                rh1.f42999n1.f43004b0.release();
                rh1.f42999n1.k();
            }
            rh1.f42999n1 = null;
            if (this.f34312b) {
                try {
                    ((WindowManager) this.f34311a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f34313c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new i31(this, 18)).setDuration(j10).setInterpolator(ds.f27530f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f34311a);
            setVisibility(8);
            ((WindowManager) this.f34311a.getSystemService("window")).removeView(this);
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
            if (!this.f34312b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(ds.f27530f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34312b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f34315n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x9 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f34315n;
                if (!this.f34316r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x9) {
                    this.f34315n = motionEvent.getY();
                    this.f34316r = true;
                    y3 = 0.0f;
                }
                if (this.f34316r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f34316r;
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
                this.f34316r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f34312b = z10;
    }
}
