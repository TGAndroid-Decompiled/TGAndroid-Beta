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
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.nr;
import org.telegram.ui.ai1;
import org.webrtc.OrientationHelper;
public abstract class w2 extends FrameLayout {
    public Activity f30016a;
    public boolean f30017b;
    public AnimationNotificationsLocker f30018c;
    public VelocityTracker d;
    public boolean e;
    public boolean f30019f;
    public float h;
    public float f30020n;
    public boolean f30021r;

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
        if (!this.f30019f) {
            this.f30019f = true;
            if (ai1.f32597k1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ai1.f32597k1.f32630r0.getMeasuredHeight();
                    if (ai1.f32597k1.A0 && !VoIPService.getSharedInstance().isConverting()) {
                        ai1 ai1Var = ai1.f32597k1;
                        m2.l(ai1Var.f32601b, ai1Var.f32598a, ai1Var.f32630r0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ai1.f32597k1.f32626o0;
                        if (windowInsets != null) {
                            m2.T = windowInsets.getSystemWindowInsetTop();
                            ai1.f32597k1.f32626o0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ai1.f32597k1.Z.d.release();
                ai1.f32597k1.f32599a0.d.release();
                ai1.f32597k1.Y.release();
                ai1.f32597k1.l();
            }
            ai1.f32597k1 = null;
            if (this.f30017b) {
                try {
                    ((WindowManager) this.f30016a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f30018c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new f91(this, 9)).setDuration(j10).setInterpolator(nr.f27346f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f30016a);
            setVisibility(8);
            ((WindowManager) this.f30016a.getSystemService("window")).removeView(this);
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
            if (!this.f30017b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(nr.f27346f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30017b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f30020n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f30020n;
                if (!this.f30021r && Math.abs(y10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y10) / 3.0f > x10) {
                    this.f30020n = motionEvent.getY();
                    this.f30021r = true;
                    y10 = 0.0f;
                }
                if (this.f30021r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f30021r;
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
                this.f30021r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z4) {
        this.f30017b = z4;
    }
}
