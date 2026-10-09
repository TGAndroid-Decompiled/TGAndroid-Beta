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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.i91;
import org.telegram.ui.wi1;
import org.webrtc.OrientationHelper;
public abstract class w2 extends FrameLayout {
    public Activity f32347a;
    public boolean f32348b;
    public AnimationNotificationsLocker f32349c;
    public VelocityTracker d;
    public boolean f32350e;
    public boolean f32351f;
    public float h;
    public float f32352n;
    public boolean f32353r;

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
        if (!this.f32351f) {
            this.f32351f = true;
            if (wi1.f43625n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = wi1.f43625n1.f43665u0.getMeasuredHeight();
                    if (wi1.f43625n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        wi1 wi1Var = wi1.f43625n1;
                        m2.l(wi1Var.f43629b, wi1Var.f43626a, wi1Var.f43665u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = wi1.f43625n1.f43661r0;
                        if (windowInsets != null) {
                            m2.X = windowInsets.getSystemWindowInsetTop();
                            wi1.f43625n1.f43661r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                wi1.f43625n1.f43633c0.d.release();
                wi1.f43625n1.f43635d0.d.release();
                wi1.f43625n1.f43630b0.release();
                wi1.f43625n1.k();
            }
            wi1.f43625n1 = null;
            if (this.f32348b) {
                try {
                    ((WindowManager) this.f32347a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f32349c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new i91(this, 11)).setDuration(j3).setInterpolator(hs.f27118f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f32347a);
            setVisibility(8);
            ((WindowManager) this.f32347a.getSystemService("window")).removeView(this);
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
        if (!this.f32350e) {
            this.f32350e = true;
            if (!this.f32348b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(hs.f27118f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32348b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f32352n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f32352n;
                if (!this.f32353r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f32352n = motionEvent.getY();
                    this.f32353r = true;
                    y3 = 0.0f;
                }
                if (this.f32353r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f32353r;
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
                this.f32353r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f32348b = z10;
    }
}
