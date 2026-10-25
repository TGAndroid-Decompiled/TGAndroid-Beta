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
import org.telegram.ui.Components.h31;
import org.telegram.ui.ph1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f34203a;
    public boolean f34204b;
    public AnimationNotificationsLocker f34205c;
    public VelocityTracker d;
    public boolean e;
    public boolean f34206f;
    public float h;
    public float f34207n;
    public boolean f34208r;

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
        if (!this.f34206f) {
            this.f34206f = true;
            if (ph1.f42506n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ph1.f42506n1.f42545u0.getMeasuredHeight();
                    if (ph1.f42506n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        ph1 ph1Var = ph1.f42506n1;
                        n2.l(ph1Var.f42510b, ph1Var.f42507a, ph1Var.f42545u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ph1.f42506n1.f42541r0;
                        if (windowInsets != null) {
                            n2.X = windowInsets.getSystemWindowInsetTop();
                            ph1.f42506n1.f42541r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ph1.f42506n1.f42514c0.d.release();
                ph1.f42506n1.f42516d0.d.release();
                ph1.f42506n1.f42511b0.release();
                ph1.f42506n1.k();
            }
            ph1.f42506n1 = null;
            if (this.f34204b) {
                try {
                    ((WindowManager) this.f34203a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f34205c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new h31(this, 18)).setDuration(j10).setInterpolator(ds.f27584f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f34203a);
            setVisibility(8);
            ((WindowManager) this.f34203a.getSystemService("window")).removeView(this);
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
            if (!this.f34204b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(ds.f27584f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34204b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f34207n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x9 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f34207n;
                if (!this.f34208r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x9) {
                    this.f34207n = motionEvent.getY();
                    this.f34208r = true;
                    y3 = 0.0f;
                }
                if (this.f34208r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f34208r;
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
                this.f34208r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f34204b = z10;
    }
}
