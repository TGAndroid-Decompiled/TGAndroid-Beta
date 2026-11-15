package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
public final class ou0 extends org.telegram.ui.Components.uj0 implements fi.z6 {
    public final ProfileActivity f50039f3;
    public VelocityTracker f50040g3;
    public final ProfileActivity f50041h3;

    public ou0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f50041h3 = profileActivity;
        this.f50039f3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f50041h3.O) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean H0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.e2) this.f50039f3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f50041h3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f50041h3;
        uv0 uv0Var = profileActivity.O;
        if (uv0Var != null) {
            if (uv0Var.H()) {
                uv0 uv0Var2 = profileActivity.O;
                if (uv0Var2.F1 && uv0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.H()) {
                uv0 uv0Var3 = profileActivity.O;
                if (uv0Var3.F1 && (uv0Var3.getClosestTab() == 8 || org.telegram.ui.Components.ys0.J0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.wp0 wp0Var = profileActivity.O.f42082b0;
            if (wp0Var == null || !wp0Var.g()) {
                org.telegram.ui.Components.zp0 zp0Var = profileActivity.O.f42086c0;
                if (zp0Var != null && zp0Var.f48449f) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        RectF rectF = ProfileActivity.X6;
        this.f50041h3.r5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int d42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.f50041h3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f50040g3;
            if (velocityTracker2 == null) {
                this.f50040g3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f50040g3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f50040g3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f50040g3.computeCurrentVelocity(1000);
                profileActivity.f43131j2 = this.f50040g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f50040g3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f50040g3.computeCurrentVelocity(1000);
                profileActivity.f43131j2 = this.f50040g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f50040g3.recycle();
            this.f50040g3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
            if (kVar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f23605m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            if (profileActivity.f43163o2 && !profileActivity.J0) {
                d42 = profileActivity.i4();
            } else {
                i10 = profileActivity.f43062a.getMeasuredWidth();
                d42 = profileActivity.d4();
            }
            if (profileActivity.Q1 >= (d42 + i10) - 1.0f) {
                profileActivity.M4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f43078c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.f43062a.P0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.f43131j2);
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
