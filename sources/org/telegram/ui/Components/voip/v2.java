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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.v61;
import org.telegram.ui.cj1;
import org.webrtc.OrientationHelper;
public abstract class v2 extends FrameLayout {
    public Activity f30229a;
    public boolean f30230b;
    public AnimationNotificationsLocker f30231c;
    public VelocityTracker d;
    public boolean e;
    public boolean f30232f;
    public float h;
    public float f30233n;
    public boolean f30234r;

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
        if (!this.f30232f) {
            this.f30232f = true;
            if (cj1.f34675n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = cj1.f34675n1.f34714u0.getMeasuredHeight();
                    if (cj1.f34675n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        cj1 cj1Var = cj1.f34675n1;
                        k2.l(cj1Var.f34679b, cj1Var.f34676a, cj1Var.f34714u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = cj1.f34675n1.f34710r0;
                        if (windowInsets != null) {
                            k2.X = windowInsets.getSystemWindowInsetTop();
                            cj1.f34675n1.f34710r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                cj1.f34675n1.f34683c0.d.release();
                cj1.f34675n1.f34685d0.d.release();
                cj1.f34675n1.f34680b0.release();
                cj1.f34675n1.k();
            }
            cj1.f34675n1 = null;
            if (this.f30230b) {
                try {
                    ((WindowManager) this.f30229a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f30231c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new v61(this, 14)).setDuration(j10).setInterpolator(es.f24465f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f30229a);
            setVisibility(8);
            ((WindowManager) this.f30229a.getSystemService("window")).removeView(this);
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
            if (!this.f30230b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(es.f24465f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30230b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f30233n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f30233n;
                if (!this.f30234r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f30233n = motionEvent.getY();
                    this.f30234r = true;
                    y3 = 0.0f;
                }
                if (this.f30234r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f30234r;
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
                this.f30234r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f30230b = z10;
    }
}
