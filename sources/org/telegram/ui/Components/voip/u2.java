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
    public Activity f31873a;
    public boolean f31874b;
    public AnimationNotificationsLocker f31875c;
    public VelocityTracker d;
    public boolean f31876e;
    public boolean f31877f;
    public float h;
    public float f31878n;
    public boolean f31879r;

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
        if (!this.f31877f) {
            this.f31877f = true;
            if (ui1.f41107n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ui1.f41107n1.f41147u0.getMeasuredHeight();
                    if (ui1.f41107n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ui1 ui1Var = ui1.f41107n1;
                        k2.l(ui1Var.f41111b, ui1Var.f41108a, ui1Var.f41147u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ui1.f41107n1.f41143r0;
                        if (windowInsets != null) {
                            k2.W = windowInsets.getSystemWindowInsetTop();
                            ui1.f41107n1.f41143r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ui1.f41107n1.f41115c0.d.release();
                ui1.f41107n1.f41117d0.d.release();
                ui1.f41107n1.f41112b0.release();
                ui1.f41107n1.l();
            }
            ui1.f41107n1 = null;
            if (this.f31874b) {
                try {
                    ((WindowManager) this.f31873a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f31875c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new k61(this, 13)).setDuration(j3).setInterpolator(pr.f29467f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f31873a);
            setVisibility(8);
            ((WindowManager) this.f31873a.getSystemService("window")).removeView(this);
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
        if (!this.f31876e) {
            this.f31876e = true;
            if (!this.f31874b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(pr.f29467f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31874b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f31878n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f31878n;
                if (!this.f31879r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f31878n = motionEvent.getY();
                    this.f31879r = true;
                    y3 = 0.0f;
                }
                if (this.f31879r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f31879r;
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
                this.f31879r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f31874b = z10;
    }
}
