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
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.rr;
import org.telegram.ui.mi1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f29754a;
    public boolean f29755b;
    public AnimationNotificationsLocker f29756c;
    public VelocityTracker d;
    public boolean e;
    public boolean f29757f;
    public float h;
    public float f29758n;
    public boolean f29759r;

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
        if (!this.f29757f) {
            this.f29757f = true;
            if (mi1.f35567n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = mi1.f35567n1.f35606u0.getMeasuredHeight();
                    if (mi1.f35567n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        mi1 mi1Var = mi1.f35567n1;
                        n2.l(mi1Var.f35571b, mi1Var.f35568a, mi1Var.f35606u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = mi1.f35567n1.f35602r0;
                        if (windowInsets != null) {
                            n2.W = windowInsets.getSystemWindowInsetTop();
                            mi1.f35567n1.f35602r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                mi1.f35567n1.f35575c0.d.release();
                mi1.f35567n1.f35577d0.d.release();
                mi1.f35567n1.f35572b0.release();
                mi1.f35567n1.l();
            }
            mi1.f35567n1 = null;
            if (this.f29755b) {
                try {
                    ((WindowManager) this.f29754a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f29756c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new q81(this, 11)).setDuration(j3).setInterpolator(rr.f28031f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f29754a);
            setVisibility(8);
            ((WindowManager) this.f29754a.getSystemService("window")).removeView(this);
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
            if (!this.f29755b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(rr.f28031f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29755b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f29758n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f29758n;
                if (!this.f29759r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f29758n = motionEvent.getY();
                    this.f29759r = true;
                    y3 = 0.0f;
                }
                if (this.f29759r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f29759r;
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
                this.f29759r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f29755b = z10;
    }
}
