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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.k91;
import org.telegram.ui.ui1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f32406a;
    public boolean f32407b;
    public AnimationNotificationsLocker f32408c;
    public VelocityTracker d;
    public boolean f32409e;
    public boolean f32410f;
    public float h;
    public float f32411n;
    public boolean f32412r;

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
        if (!this.f32410f) {
            this.f32410f = true;
            if (ui1.f42576n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ui1.f42576n1.f42616u0.getMeasuredHeight();
                    if (ui1.f42576n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ui1 ui1Var = ui1.f42576n1;
                        n2.l(ui1Var.f42580b, ui1Var.f42577a, ui1Var.f42616u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ui1.f42576n1.f42612r0;
                        if (windowInsets != null) {
                            n2.X = windowInsets.getSystemWindowInsetTop();
                            ui1.f42576n1.f42612r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ui1.f42576n1.f42584c0.d.release();
                ui1.f42576n1.f42586d0.d.release();
                ui1.f42576n1.f42581b0.release();
                ui1.f42576n1.k();
            }
            ui1.f42576n1 = null;
            if (this.f32407b) {
                try {
                    ((WindowManager) this.f32406a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f32408c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new k91(this, 11)).setDuration(j3).setInterpolator(is.f27451f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f32406a);
            setVisibility(8);
            ((WindowManager) this.f32406a.getSystemService("window")).removeView(this);
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
        if (!this.f32409e) {
            this.f32409e = true;
            if (!this.f32407b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(is.f27451f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32407b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f32411n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f32411n;
                if (!this.f32412r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f32411n = motionEvent.getY();
                    this.f32412r = true;
                    y3 = 0.0f;
                }
                if (this.f32412r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f32412r;
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
                this.f32412r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f32407b = z10;
    }
}
