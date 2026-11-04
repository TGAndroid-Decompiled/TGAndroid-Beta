package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
public final class hu0 extends org.telegram.ui.Components.tj0 implements ei.g7 {
    public final ProfileActivity f45989f3;
    public VelocityTracker f45990g3;
    public final ProfileActivity f45991h3;

    public hu0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f45991h3 = profileActivity;
        this.f45989f3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f45991h3.O) {
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
        kVar = ((org.telegram.ui.ActionBar.d2) this.f45989f3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f45991h3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f45991h3;
        mv0 mv0Var = profileActivity.O;
        if (mv0Var != null) {
            if (mv0Var.H()) {
                mv0 mv0Var2 = profileActivity.O;
                if (mv0Var2.F1 && mv0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.H()) {
                mv0 mv0Var3 = profileActivity.O;
                if (mv0Var3.F1 && (mv0Var3.getClosestTab() == 8 || org.telegram.ui.Components.ws0.I0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.vp0 vp0Var = profileActivity.O.f40072b0;
            if (vp0Var == null || !vp0Var.g()) {
                org.telegram.ui.Components.yp0 yp0Var = profileActivity.O.f40076c0;
                if (yp0Var != null && yp0Var.f44470f) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        RectF rectF = ProfileActivity.T6;
        this.f45991h3.p5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int i3;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.f45991h3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f45990g3;
            if (velocityTracker2 == null) {
                this.f45990g3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f45990g3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f45990g3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f45990g3.computeCurrentVelocity(1000);
                profileActivity.f41781i2 = this.f45990g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f45990g3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f45990g3.computeCurrentVelocity(1000);
                profileActivity.f41781i2 = this.f45990g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f45990g3.recycle();
            this.f45990g3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            if (kVar.getOccupyStatusBar()) {
                i3 = org.telegram.messenger.g0.f22602m;
            } else {
                i3 = 0;
            }
            int i10 = currentActionBarHeight + i3;
            if (profileActivity.f41813n2 && !profileActivity.J0) {
                e42 = profileActivity.j4();
            } else {
                i10 = profileActivity.f41719a.getMeasuredWidth();
                e42 = profileActivity.e4();
            }
            if (profileActivity.Q1 >= (e42 + i10) - 1.0f) {
                profileActivity.K4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f41735c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.f41719a.P0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.f41781i2);
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
