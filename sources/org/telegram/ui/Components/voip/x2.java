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
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ci1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f32464a;
    public boolean f32465b;
    public AnimationNotificationsLocker f32466c;
    public VelocityTracker d;
    public boolean f32467e;
    public boolean f32468f;
    public float h;
    public float f32469n;
    public boolean f32470r;

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
        if (!this.f32468f) {
            this.f32468f = true;
            if (ci1.f35817k1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ci1.f35817k1.f35851r0.getMeasuredHeight();
                    if (ci1.f35817k1.A0 && !VoIPService.getSharedInstance().isConverting()) {
                        ci1 ci1Var = ci1.f35817k1;
                        n2.l(ci1Var.f35821b, ci1Var.f35818a, ci1Var.f35851r0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ci1.f35817k1.f35847o0;
                        if (windowInsets != null) {
                            n2.T = windowInsets.getSystemWindowInsetTop();
                            ci1.f35817k1.f35847o0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ci1.f35817k1.Z.d.release();
                ci1.f35817k1.f35819a0.d.release();
                ci1.f35817k1.Y.release();
                ci1.f35817k1.l();
            }
            ci1.f35817k1 = null;
            if (this.f32465b) {
                try {
                    ((WindowManager) this.f32464a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f32466c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new g91(this, 9)).setDuration(j10).setInterpolator(pr.f30183f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f32464a);
            setVisibility(8);
            ((WindowManager) this.f32464a.getSystemService("window")).removeView(this);
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
        if (!this.f32467e) {
            this.f32467e = true;
            if (!this.f32465b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(pr.f30183f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32465b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f32469n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f32469n;
                if (!this.f32470r && Math.abs(y10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y10) / 3.0f > x10) {
                    this.f32469n = motionEvent.getY();
                    this.f32470r = true;
                    y10 = 0.0f;
                }
                if (this.f32470r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f32470r;
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
                this.f32470r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z4) {
        this.f32465b = z4;
    }
}
