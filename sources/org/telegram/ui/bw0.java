package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
public final class bw0 extends org.telegram.ui.Components.tk0 implements th.l5 {
    public final ProfileActivity f36314e3;
    public VelocityTracker f36315f3;
    public final ProfileActivity f36316g3;

    public bw0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f36316g3 = profileActivity;
        this.f36314e3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f36316g3.N) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean H0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.i);
    }

    @Override
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.k2) this.f36314e3).actionBar;
        iArr[0] = lVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f36316g3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f36316g3;
        ix0 ix0Var = profileActivity.N;
        if (ix0Var != null) {
            if (ix0Var.G()) {
                ix0 ix0Var2 = profileActivity.N;
                if (ix0Var2.E1 && ix0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.G()) {
                ix0 ix0Var3 = profileActivity.N;
                if (ix0Var3.E1 && (ix0Var3.getClosestTab() == 8 || org.telegram.ui.Components.zt0.F0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.vq0 vq0Var = profileActivity.N.f33170a0;
            if (vq0Var == null || !vq0Var.g()) {
                org.telegram.ui.Components.zq0 zq0Var = profileActivity.N.f33173b0;
                if (zq0Var != null && zq0Var.f44256f) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        RectF rectF = ProfileActivity.R6;
        this.f36316g3.o5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        int d42;
        int action = motionEvent.getAction();
        boolean z10 = true;
        ProfileActivity profileActivity = this.f36316g3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f36315f3;
            if (velocityTracker2 == null) {
                this.f36315f3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f36315f3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f36315f3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f36315f3.computeCurrentVelocity(1000);
                profileActivity.f33826h2 = this.f36315f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f36315f3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f36315f3.computeCurrentVelocity(1000);
                profileActivity.f33826h2 = this.f36315f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f36315f3.recycle();
            this.f36315f3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                i11 = org.telegram.messenger.i0.f16020m;
            } else {
                i11 = 0;
            }
            int i12 = currentActionBarHeight + i11;
            if (profileActivity.f33858m2 && !profileActivity.I0) {
                d42 = profileActivity.i4();
            } else {
                i12 = profileActivity.f33772a.getMeasuredWidth();
                d42 = profileActivity.d4();
            }
            if (profileActivity.P1 >= (d42 + i12) - 1.0f) {
                profileActivity.J4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f33787c.m(0)) != null) {
            if (profileActivity.N1) {
                profileActivity.N1 = false;
                profileActivity.f33772a.O0 = true;
            }
            if (profileActivity.f33866n2) {
                if (profileActivity.f33873o2) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                    if (lVar.getOccupyStatusBar()) {
                        i10 = org.telegram.messenger.i0.f16020m;
                    } else {
                        i10 = 0;
                    }
                    profileActivity.f33772a.w0(0, ((m10.getTop() - profileActivity.f33772a.getMeasuredWidth()) - profileActivity.d4()) + currentActionBarHeight2 + i10, org.telegram.ui.Components.gr.h);
                    return onTouchEvent;
                }
                profileActivity.f33772a.w0(0, m10.getTop() - profileActivity.i4(), org.telegram.ui.Components.gr.h);
                return onTouchEvent;
            }
            if (profileActivity.d4() <= 0) {
                z10 = false;
            }
            if (z10) {
                float f7 = profileActivity.P1;
                if (f7 > 0.0f && ((f7 < profileActivity.i4() * 0.6f || profileActivity.f33826h2 < -1000.0f) && profileActivity.P1 > profileActivity.d4() * 0.6f)) {
                    profileActivity.f33772a.w0(0, (int) (profileActivity.P1 - profileActivity.d4()), org.telegram.ui.Components.gr.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.P1;
                if (f10 > 0.0f && f10 < profileActivity.d4() * 0.6f) {
                    profileActivity.f33772a.w0(0, (int) (profileActivity.d4() - profileActivity.P1), org.telegram.ui.Components.gr.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.P1;
                if (f11 > 0.0f && profileActivity.f33826h2 < -1000.0f) {
                    profileActivity.f33772a.w0(0, (int) f11, org.telegram.ui.Components.gr.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.P1 > 0.0f) {
                profileActivity.f33772a.w0(0, m10.getTop() - profileActivity.i4(), org.telegram.ui.Components.gr.h);
            }
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
