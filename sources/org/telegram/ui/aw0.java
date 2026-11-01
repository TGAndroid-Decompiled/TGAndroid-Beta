package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
public final class aw0 extends org.telegram.ui.Components.uk0 implements th.l5 {
    public final ProfileActivity f35847e3;
    public VelocityTracker f35848f3;
    public final ProfileActivity f35849g3;

    public aw0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f35849g3 = profileActivity;
        this.f35847e3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f35849g3.N) {
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
        lVar = ((org.telegram.ui.ActionBar.k2) this.f35847e3).actionBar;
        iArr[0] = lVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f35849g3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f35849g3;
        hx0 hx0Var = profileActivity.N;
        if (hx0Var != null) {
            if (hx0Var.G()) {
                hx0 hx0Var2 = profileActivity.N;
                if (hx0Var2.E1 && hx0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.G()) {
                hx0 hx0Var3 = profileActivity.N;
                if (hx0Var3.E1 && (hx0Var3.getClosestTab() == 8 || org.telegram.ui.Components.au0.G0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.wq0 wq0Var = profileActivity.N.f24498a0;
            if (wq0Var == null || !wq0Var.g()) {
                org.telegram.ui.Components.ar0 ar0Var = profileActivity.N.f24501b0;
                if (ar0Var != null && ar0Var.f43750f) {
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
        RectF rectF = ProfileActivity.S6;
        this.f35849g3.p5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.f35849g3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f35848f3;
            if (velocityTracker2 == null) {
                this.f35848f3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f35848f3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f35848f3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f35848f3.computeCurrentVelocity(1000);
                profileActivity.f33833h2 = this.f35848f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f35848f3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f35848f3.computeCurrentVelocity(1000);
                profileActivity.f33833h2 = this.f35848f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f35848f3.recycle();
            this.f35848f3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            if (lVar.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16166m;
            } else {
                i10 = 0;
            }
            int i11 = currentActionBarHeight + i10;
            if (profileActivity.f33865m2 && !profileActivity.I0) {
                e42 = profileActivity.j4();
            } else {
                i11 = profileActivity.f33779a.getMeasuredWidth();
                e42 = profileActivity.e4();
            }
            if (profileActivity.P1 >= (e42 + i11) - 1.0f) {
                profileActivity.K4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f33794c.m(0)) != null) {
            if (profileActivity.N1) {
                profileActivity.N1 = false;
                profileActivity.f33779a.O0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.f33833h2);
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
