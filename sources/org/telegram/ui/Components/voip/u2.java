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
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ui1;
import org.webrtc.OrientationHelper;
public abstract class u2 extends FrameLayout {
    public Activity f31872a;
    public boolean f31873b;
    public AnimationNotificationsLocker f31874c;
    public VelocityTracker d;
    public boolean f31875e;
    public boolean f31876f;
    public float h;
    public float f31877n;
    public boolean f31878r;

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
        if (!this.f31876f) {
            this.f31876f = true;
            if (ui1.f41106n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ui1.f41106n1.f41146u0.getMeasuredHeight();
                    if (ui1.f41106n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ui1 ui1Var = ui1.f41106n1;
                        k2.l(ui1Var.f41110b, ui1Var.f41107a, ui1Var.f41146u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ui1.f41106n1.f41142r0;
                        if (windowInsets != null) {
                            k2.W = windowInsets.getSystemWindowInsetTop();
                            ui1.f41106n1.f41142r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ui1.f41106n1.f41114c0.d.release();
                ui1.f41106n1.f41116d0.d.release();
                ui1.f41106n1.f41111b0.release();
                ui1.f41106n1.l();
            }
            ui1.f41106n1 = null;
            if (this.f31873b) {
                try {
                    ((WindowManager) this.f31872a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f31874c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new k61(this, 13)).setDuration(j3).setInterpolator(pr.f29466f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f31872a);
            setVisibility(8);
            ((WindowManager) this.f31872a.getSystemService("window")).removeView(this);
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
        if (!this.f31875e) {
            this.f31875e = true;
            if (!this.f31873b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(pr.f29466f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31873b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f31877n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f31877n;
                if (!this.f31878r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f31877n = motionEvent.getY();
                    this.f31878r = true;
                    y3 = 0.0f;
                }
                if (this.f31878r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f31878r;
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
                this.f31878r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f31873b = z10;
    }
}
