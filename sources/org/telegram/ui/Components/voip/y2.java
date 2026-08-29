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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p11;
import org.telegram.ui.oh1;
import org.webrtc.OrientationHelper;
public abstract class y2 extends FrameLayout {
    public Activity f34138a;
    public boolean f34139b;
    public AnimationNotificationsLocker f34140c;
    public VelocityTracker d;
    public boolean f34141e;
    public boolean f34142f;
    public float h;
    public float f34143n;
    public boolean f34144r;

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
        if (!this.f34142f) {
            this.f34142f = true;
            if (oh1.f41135j1 != null) {
                if (VoIPService.getSharedInstance() != null) {
                    int measuredHeight = oh1.f41135j1.f41166q0.getMeasuredHeight();
                    if (oh1.f41135j1.f41180z0 && !VoIPService.getSharedInstance().isConverting()) {
                        oh1 oh1Var = oh1.f41135j1;
                        o2.l(oh1Var.f41139b, oh1Var.f41136a, oh1Var.f41166q0.getMeasuredWidth(), measuredHeight, 0);
                        WindowInsets windowInsets = oh1.f41135j1.f41163n0;
                        if (windowInsets != null) {
                            o2.S = windowInsets.getSystemWindowInsetTop();
                            oh1.f41135j1.f41163n0.getSystemWindowInsetBottom();
                        }
                    }
                }
                oh1.f41135j1.Y.d.release();
                oh1.f41135j1.Z.d.release();
                oh1.f41135j1.X.release();
                oh1.f41135j1.l();
            }
            oh1.f41135j1 = null;
            if (this.f34139b) {
                try {
                    ((WindowManager) this.f34138a.getSystemService("window")).removeView(this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            this.f34140c.lock();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new p11(this, 18)).setDuration(j10).setInterpolator(jr.f29800f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            AndroidUtilities.unlockOrientation(this.f34138a);
            setVisibility(8);
            ((WindowManager) this.f34138a.getSystemService("window")).removeView(this);
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
        if (!this.f34141e) {
            this.f34141e = true;
            if (!this.f34139b) {
                setTranslationY(getMeasuredHeight());
                setAlpha(0.0f);
                animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(jr.f29800f).start();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34139b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.f34143n = motionEvent.getY();
                if (this.d == null) {
                    this.d = VelocityTracker.obtain();
                }
                this.d.clear();
                return false;
            }
            float f9 = 0.0f;
            if (motionEvent.getAction() == 2) {
                float x4 = motionEvent.getX() - this.h;
                float y8 = motionEvent.getY() - this.f34143n;
                if (!this.f34144r && Math.abs(y8) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(y8) / 3.0f > x4) {
                    this.f34143n = motionEvent.getY();
                    this.f34144r = true;
                    y8 = 0.0f;
                }
                if (this.f34144r) {
                    if (y8 >= 0.0f) {
                        f9 = y8;
                    }
                    if (this.d == null) {
                        this.d = VelocityTracker.obtain();
                    }
                    this.d.addMovement(motionEvent);
                    setTranslationY(f9);
                }
                return this.f34144r;
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
                this.f34144r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z10) {
        this.f34139b = z10;
    }
}
