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
import org.telegram.ui.Components.pr;
import org.telegram.ui.ii1;
import org.webrtc.OrientationHelper;
public abstract class x2 extends FrameLayout {
    public Activity f32469a;
    public boolean f32470b;
    public AnimationNotificationsLocker f32471c;
    public VelocityTracker d;
    public boolean f32472e;
    public boolean f32473f;
    public float h;
    public float f32474n;
    public boolean f32475r;

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
        if (!this.f32473f) {
            this.f32473f = true;
            if (ii1.f37669k1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = ii1.f37669k1.f37703r0.getMeasuredHeight();
                    if (ii1.f37669k1.A0 && !VoIPService.getSharedInstance().isConverting()) {
                        ii1 ii1Var = ii1.f37669k1;
                        n2.l(ii1Var.f37673b, ii1Var.f37670a, ii1Var.f37703r0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = ii1.f37669k1.f37699o0;
                        if (windowInsets != null) {
                            n2.T = windowInsets.getSystemWindowInsetTop();
                            ii1.f37669k1.f37699o0.getSystemWindowInsetBottom();
                        }
                    }
                }
                ii1.f37669k1.Z.d.release();
                ii1.f37669k1.f37671a0.d.release();
                ii1.f37669k1.Y.release();
                ii1.f37669k1.l();
            }
            ii1.f37669k1 = null;
            if (this.f32470b) {
                try {
                    ((WindowManager) this.f32469a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f32471c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new f91(this, 9)).setDuration(j10).setInterpolator(pr.f30168f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f32469a);
            setVisibility(8);
            ((WindowManager) this.f32469a.getSystemService("window")).removeView(this);
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
        if (!this.f32472e) {
            this.f32472e = true;
            if (!this.f32470b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(pr.f30168f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32470b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f32474n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f32474n;
                if (!this.f32475r && Math.abs(y10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y10) / 3.0f > x10) {
                    this.f32474n = motionEvent.getY();
                    this.f32475r = true;
                    y10 = 0.0f;
                }
                if (this.f32475r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f32475r;
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
                this.f32475r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z4) {
        this.f32470b = z4;
    }
}
