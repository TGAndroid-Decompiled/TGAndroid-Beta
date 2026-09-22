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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v81;
import org.telegram.ui.ui1;
import org.webrtc.OrientationHelper;
public abstract class w2 extends FrameLayout {
    public Activity f29328a;
    public boolean f29329b;
    public AnimationNotificationsLocker f29330c;
    public VelocityTracker d;
    public boolean e;
    public boolean f29331f;
    public float h;
    public float f29332n;
    public boolean f29333r;

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
        if (!this.f29331f) {
            this.f29331f = true;
            if (ui1.f37981n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ui1.f37981n1.f38020u0.getMeasuredHeight();
                    if (ui1.f37981n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ui1 ui1Var = ui1.f37981n1;
                        m2.l(ui1Var.f37985b, ui1Var.f37982a, ui1Var.f38020u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ui1.f37981n1.f38016r0;
                        if (windowInsets != null) {
                            m2.W = windowInsets.getSystemWindowInsetTop();
                            ui1.f37981n1.f38016r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ui1.f37981n1.f37989c0.d.release();
                ui1.f37981n1.f37991d0.d.release();
                ui1.f37981n1.f37986b0.release();
                ui1.f37981n1.l();
            }
            ui1.f37981n1 = null;
            if (this.f29329b) {
                try {
                    ((WindowManager) this.f29328a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f29330c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new v81(this, 10)).setDuration(j3).setInterpolator(qr.f27420f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f29328a);
            setVisibility(8);
            ((WindowManager) this.f29328a.getSystemService("window")).removeView(this);
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
            if (!this.f29329b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(qr.f27420f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29329b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f29332n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f29332n;
                if (!this.f29333r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f29332n = motionEvent.getY();
                    this.f29333r = true;
                    y3 = 0.0f;
                }
                if (this.f29333r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f29333r;
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
                this.f29333r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f29329b = z10;
    }
}
