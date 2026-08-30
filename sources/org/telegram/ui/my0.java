package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class my0 extends org.telegram.ui.Components.sl0 implements nh.a7 {
    public final ProfileActivity U2;
    public VelocityTracker V2;
    public final ProfileActivity W2;

    public my0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.W2 = profileActivity;
        this.U2 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.W2.L) {
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
        kVar = ((org.telegram.ui.ActionBar.p2) this.U2).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.W2.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.W2;
        sz0 sz0Var = profileActivity.L;
        if (sz0Var != null) {
            if (sz0Var.C()) {
                sz0 sz0Var2 = profileActivity.L;
                if (sz0Var2.f31161z1 && sz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.L.C()) {
                sz0 sz0Var3 = profileActivity.L;
                if (sz0Var3.f31161z1 && (sz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.yu0.w0(profileActivity.L.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.or0 or0Var = profileActivity.L.S;
            if (or0Var == null || !or0Var.g()) {
                org.telegram.ui.Components.sr0 sr0Var = profileActivity.L.T;
                if (sr0Var != null && sr0Var.f35204w) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.W2.U4();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m9;
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        int O3;
        int action = motionEvent.getAction();
        boolean z4 = true;
        ProfileActivity profileActivity = this.W2;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.V2;
            if (velocityTracker2 == null) {
                this.V2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.V2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.V2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.V2.computeCurrentVelocity(1000);
                profileActivity.f32066f2 = this.V2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.V2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.V2.computeCurrentVelocity(1000);
                profileActivity.f32066f2 = this.V2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.V2.recycle();
            this.V2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int i12 = currentActionBarHeight + i11;
            if (profileActivity.f32101k2 && !profileActivity.F0) {
                O3 = profileActivity.T3();
            } else {
                i12 = profileActivity.f32028a.getMeasuredWidth();
                O3 = profileActivity.O3();
            }
            if (profileActivity.N1 >= (O3 + i12) - 1.0f) {
                profileActivity.w4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m9 = profileActivity.f32043c.m(0)) != null) {
            if (profileActivity.L1) {
                profileActivity.L1 = false;
                profileActivity.f32028a.K0 = true;
            }
            if (profileActivity.f32107l2) {
                if (profileActivity.f32113m2) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    if (kVar.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    profileActivity.f32028a.v0(0, ((m9.getTop() - profileActivity.f32028a.getMeasuredWidth()) - profileActivity.O3()) + currentActionBarHeight2 + i10, org.telegram.ui.Components.nr.h);
                    return onTouchEvent;
                }
                profileActivity.f32028a.v0(0, m9.getTop() - profileActivity.T3(), org.telegram.ui.Components.nr.h);
                return onTouchEvent;
            }
            if (profileActivity.O3() <= 0) {
                z4 = false;
            }
            if (z4) {
                float f10 = profileActivity.N1;
                if (f10 > 0.0f && ((f10 < profileActivity.T3() * 0.6f || profileActivity.f32066f2 < -1000.0f) && profileActivity.N1 > profileActivity.O3() * 0.6f)) {
                    profileActivity.f32028a.v0(0, (int) (profileActivity.N1 - profileActivity.O3()), org.telegram.ui.Components.nr.h);
                    return onTouchEvent;
                }
            }
            if (z4) {
                float f11 = profileActivity.N1;
                if (f11 > 0.0f && f11 < profileActivity.O3() * 0.6f) {
                    profileActivity.f32028a.v0(0, (int) (profileActivity.O3() - profileActivity.N1), org.telegram.ui.Components.nr.h);
                    return onTouchEvent;
                }
            }
            if (!z4) {
                float f12 = profileActivity.N1;
                if (f12 > 0.0f && profileActivity.f32066f2 < -1000.0f) {
                    profileActivity.f32028a.v0(0, (int) f12, org.telegram.ui.Components.nr.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.N1 > 0.0f) {
                profileActivity.f32028a.v0(0, m9.getTop() - profileActivity.T3(), org.telegram.ui.Components.nr.h);
            }
        }
        return onTouchEvent;
    }

    @Override
    public final void q0(View view, View view2) {
    }
}
