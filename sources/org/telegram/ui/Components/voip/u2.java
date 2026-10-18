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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.n31;
import org.telegram.ui.jh1;
import org.webrtc.OrientationHelper;
public abstract class u2 extends FrameLayout {
    public Activity f31811a;
    public boolean f31812b;
    public AnimationNotificationsLocker f31813c;
    public VelocityTracker d;
    public boolean e;
    public boolean f31814f;
    public float h;
    public float f31815n;
    public boolean f31816r;

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
        if (!this.f31814f) {
            this.f31814f = true;
            if (jh1.f38171n1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = jh1.f38171n1.f38210u0.getMeasuredHeight();
                    if (jh1.f38171n1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                        jh1 jh1Var = jh1.f38171n1;
                        k2.l(jh1Var.f38175b, jh1Var.f38172a, jh1Var.f38210u0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = jh1.f38171n1.f38206r0;
                        if (windowInsets != null) {
                            k2.X = windowInsets.getSystemWindowInsetTop();
                            jh1.f38171n1.f38206r0.getSystemWindowInsetBottom();
                        }
                    }
                }
                jh1.f38171n1.f38179c0.d.release();
                jh1.f38171n1.f38181d0.d.release();
                jh1.f38171n1.f38176b0.release();
                jh1.f38171n1.k();
            }
            jh1.f38171n1 = null;
            if (this.f31812b) {
                try {
                    ((WindowManager) this.f31811a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f31813c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new n31(this, 16)).setDuration(j10).setInterpolator(bs.f25030f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f31811a);
            setVisibility(8);
            ((WindowManager) this.f31811a.getSystemService("window")).removeView(this);
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
            if (!this.f31812b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(bs.f25030f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31812b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f31815n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f7 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y3 = motionEvent.getY() - this.f31815n;
                if (!this.f31816r && Math.abs(y3) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y3) / 3.0f > x10) {
                    this.f31815n = motionEvent.getY();
                    this.f31816r = true;
                    y3 = 0.0f;
                }
                if (this.f31816r) {
                    if (y3 >= 0.0f) {
                        f7 = y3;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f7);
                }
                return this.f31816r;
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
                this.f31816r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f31812b = z10;
    }
}
