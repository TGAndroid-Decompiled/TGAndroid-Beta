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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y11;
import org.telegram.ui.mh1;
import org.webrtc.OrientationHelper;
public abstract class v2 extends FrameLayout {
    public Activity f33907a;
    public boolean f33908b;
    public AnimationNotificationsLocker f33909c;
    public VelocityTracker d;
    public boolean f33910e;
    public boolean f33911f;
    public float h;
    public float f33912n;
    public boolean f33913r;

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
        if (!this.f33911f) {
            this.f33911f = true;
            if (mh1.f40427j1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = mh1.f40427j1.f40458q0.getMeasuredHeight();
                    if (mh1.f40427j1.f40472z0 && !VoIPService.getSharedInstance().isConverting()) {
                        mh1 mh1Var = mh1.f40427j1;
                        l2.l(mh1Var.f40431b, mh1Var.f40428a, mh1Var.f40458q0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = mh1.f40427j1.f40455n0;
                        if (windowInsets != null) {
                            l2.S = windowInsets.getSystemWindowInsetTop();
                            mh1.f40427j1.f40455n0.getSystemWindowInsetBottom();
                        }
                    }
                }
                mh1.f40427j1.Y.d.release();
                mh1.f40427j1.Z.d.release();
                mh1.f40427j1.X.release();
                mh1.f40427j1.l();
            }
            mh1.f40427j1 = null;
            if (this.f33908b) {
                try {
                    ((WindowManager) this.f33907a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f33909c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new y11(this, 16)).setDuration(j10).setInterpolator(gr.f28844f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f33907a);
            setVisibility(8);
            ((WindowManager) this.f33907a.getSystemService("window")).removeView(this);
            OrientationHelper.cameraRotationDisabled = false;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (!this.f33910e) {
            this.f33910e = true;
            if (!this.f33908b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(gr.f28844f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33908b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f33912n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f10 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.h;
                float y10 = motionEvent.getY() - this.f33912n;
                if (!this.f33913r && Math.abs(y10) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y10) / 3.0f > x10) {
                    this.f33912n = motionEvent.getY();
                    this.f33913r = true;
                    y10 = 0.0f;
                }
                if (this.f33913r) {
                    if (y10 >= 0.0f) {
                        f10 = y10;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f10);
                }
                return this.f33913r;
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
                this.f33913r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f33908b = z10;
    }
}
