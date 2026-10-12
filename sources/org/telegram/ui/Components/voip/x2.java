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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.o91;
import org.telegram.ui.xi1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f32092a;
    public boolean f32093b;
    public AnimationNotificationsLocker f32094c;
    public VelocityTracker d;
    public boolean f32095e;
    public boolean f32096f;
    public float h;
    public float f32097n;
    public boolean f32098r;

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
        if (!this.f32096f) {
            this.f32096f = true;
            if (xi1.f43982n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = xi1.f43982n1.f44022u0.getMeasuredHeight();
                    if (xi1.f43982n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        xi1 xi1Var = xi1.f43982n1;
                        n2.l(xi1Var.f43986b, xi1Var.f43983a, xi1Var.f44022u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = xi1.f43982n1.f44018r0;
                        if (windowInsets != null) {
                            n2.X = windowInsets.getSystemWindowInsetTop();
                            xi1.f43982n1.f44018r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                xi1.f43982n1.f43990c0.d.release();
                xi1.f43982n1.f43992d0.d.release();
                xi1.f43982n1.f43987b0.release();
                xi1.f43982n1.k();
            }
            xi1.f43982n1 = null;
            if (this.f32093b) {
                try {
                    ((WindowManager) this.f32092a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f32094c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new o91(this, 11)).setDuration(j3).setInterpolator(js.f27634f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f32092a);
            setVisibility(8);
            ((WindowManager) this.f32092a.getSystemService("window")).removeView(this);
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
        if (!this.f32095e) {
            this.f32095e = true;
            if (!this.f32093b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(js.f27634f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32093b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f32097n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f32097n;
                if (!this.f32098r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f32097n = motionEvent.getY();
                    this.f32098r = true;
                    y3 = 0.0f;
                }
                if (this.f32098r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f32098r;
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
                this.f32098r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f32093b = z10;
    }
}
