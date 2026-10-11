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
import org.telegram.ui.Components.j91;
import org.telegram.ui.ui1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f32470a;
    public boolean f32471b;
    public AnimationNotificationsLocker f32472c;
    public VelocityTracker d;
    public boolean f32473e;
    public boolean f32474f;
    public float h;
    public float f32475n;
    public boolean f32476r;

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
        if (!this.f32474f) {
            this.f32474f = true;
            if (ui1.f42610n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ui1.f42610n1.f42650u0.getMeasuredHeight();
                    if (ui1.f42610n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ui1 ui1Var = ui1.f42610n1;
                        n2.l(ui1Var.f42614b, ui1Var.f42611a, ui1Var.f42650u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ui1.f42610n1.f42646r0;
                        if (windowInsets != null) {
                            n2.X = windowInsets.getSystemWindowInsetTop();
                            ui1.f42610n1.f42646r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ui1.f42610n1.f42618c0.d.release();
                ui1.f42610n1.f42620d0.d.release();
                ui1.f42610n1.f42615b0.release();
                ui1.f42610n1.k();
            }
            ui1.f42610n1 = null;
            if (this.f32471b) {
                try {
                    ((WindowManager) this.f32470a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f32472c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new j91(this, 11)).setDuration(j3).setInterpolator(is.f27500f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f32470a);
            setVisibility(8);
            ((WindowManager) this.f32470a.getSystemService("window")).removeView(this);
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
        if (!this.f32473e) {
            this.f32473e = true;
            if (!this.f32471b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(is.f27500f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32471b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f32475n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f32475n;
                if (!this.f32476r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f32475n = motionEvent.getY();
                    this.f32476r = true;
                    y3 = 0.0f;
                }
                if (this.f32476r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f32476r;
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
                this.f32476r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f32471b = z10;
    }
}
