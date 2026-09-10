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
import org.telegram.ui.Components.wr;
import org.telegram.ui.zi1;
import org.webrtc.OrientationHelper;
public abstract class w2 extends FrameLayout {
    public Activity f28521a;
    public boolean f28522b;
    public AnimationNotificationsLocker f28523c;
    public VelocityTracker d;
    public boolean e;
    public boolean f28524f;
    public float h;
    public float f28525n;
    public boolean f28526r;

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
        if (!this.f28524f) {
            this.f28524f = true;
            if (zi1.f39355n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = zi1.f39355n1.f39394u0.getMeasuredHeight();
                    if (zi1.f39355n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        zi1 zi1Var = zi1.f39355n1;
                        l2.l(zi1Var.f39359b, zi1Var.f39356a, zi1Var.f39394u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = zi1.f39355n1.f39390r0;
                        if (windowInsets != null) {
                            l2.W = windowInsets.getSystemWindowInsetTop();
                            zi1.f39355n1.f39390r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                zi1.f39355n1.f39363c0.d.release();
                zi1.f39355n1.f39365d0.d.release();
                zi1.f39355n1.f39360b0.release();
                zi1.f39355n1.l();
            }
            zi1.f39355n1 = null;
            if (this.f28522b) {
                try {
                    ((WindowManager) this.f28521a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f28523c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new v2(this, 0)).setDuration(j3).setInterpolator(wr.f28819f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f28521a);
            setVisibility(8);
            ((WindowManager) this.f28521a.getSystemService("window")).removeView(this);
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
            if (!this.f28522b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(wr.f28819f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28522b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f28525n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f28525n;
                if (!this.f28526r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f28525n = motionEvent.getY();
                    this.f28526r = true;
                    y3 = 0.0f;
                }
                if (this.f28526r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f28526r;
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
                this.f28526r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f28522b = z10;
    }
}
