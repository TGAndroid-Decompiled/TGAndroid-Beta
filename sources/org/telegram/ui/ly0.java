package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ly0 extends org.telegram.ui.Components.mm0 implements ci.o7 {
    public final ProfileActivity Y2;
    public VelocityTracker Z2;
    public final ProfileActivity f39343a3;

    public ly0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f39343a3 = profileActivity;
        this.Y2 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f39343a3.O) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean H0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.Y2).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f39343a3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f39343a3;
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null) {
            if (rz0Var.D()) {
                rz0 rz0Var2 = profileActivity.O;
                if (rz0Var2.C1 && rz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.D()) {
                rz0 rz0Var3 = profileActivity.O;
                if (rz0Var3.C1 && (rz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.xv0.z0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.ns0 ns0Var = profileActivity.O.V;
            if (ns0Var == null || !ns0Var.g()) {
                org.telegram.ui.Components.ss0 ss0Var = profileActivity.O.W;
                if (ss0Var != null && ss0Var.f38040w) {
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
        this.f39343a3.Y4();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        int Q3;
        int action = motionEvent.getAction();
        boolean z10 = true;
        ProfileActivity profileActivity = this.f39343a3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.Z2;
            if (velocityTracker2 == null) {
                this.Z2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.Z2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.Z2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.Z2.computeCurrentVelocity(1000);
                profileActivity.f33950j2 = this.Z2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.Z2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.Z2.computeCurrentVelocity(1000);
                profileActivity.f33950j2 = this.Z2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.Z2.recycle();
            this.Z2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int i12 = currentActionBarHeight + i11;
            if (profileActivity.f33983o2 && !profileActivity.J0) {
                Q3 = profileActivity.V3();
            } else {
                i12 = profileActivity.f33882a.getMeasuredWidth();
                Q3 = profileActivity.Q3();
            }
            if (profileActivity.R1 >= (Q3 + i12) - 1.0f) {
                profileActivity.y4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f33897c.m(0)) != null) {
            if (profileActivity.P1) {
                profileActivity.P1 = false;
                profileActivity.f33882a.O0 = true;
            }
            if (profileActivity.f33990p2) {
                if (profileActivity.f33996q2) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    if (kVar.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    profileActivity.f33882a.v0(0, ((m10.getTop() - profileActivity.f33882a.getMeasuredWidth()) - profileActivity.Q3()) + currentActionBarHeight2 + i10, org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
                profileActivity.f33882a.v0(0, m10.getTop() - profileActivity.V3(), org.telegram.ui.Components.bs.h);
                return onTouchEvent;
            }
            if (profileActivity.Q3() <= 0) {
                z10 = false;
            }
            if (z10) {
                float f7 = profileActivity.R1;
                if (f7 > 0.0f && ((f7 < profileActivity.V3() * 0.6f || profileActivity.f33950j2 < -1000.0f) && profileActivity.R1 > profileActivity.Q3() * 0.6f)) {
                    profileActivity.f33882a.v0(0, (int) (profileActivity.R1 - profileActivity.Q3()), org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.R1;
                if (f10 > 0.0f && f10 < profileActivity.Q3() * 0.6f) {
                    profileActivity.f33882a.v0(0, (int) (profileActivity.Q3() - profileActivity.R1), org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.R1;
                if (f11 > 0.0f && profileActivity.f33950j2 < -1000.0f) {
                    profileActivity.f33882a.v0(0, (int) f11, org.telegram.ui.Components.bs.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.R1 > 0.0f) {
                profileActivity.f33882a.v0(0, m10.getTop() - profileActivity.V3(), org.telegram.ui.Components.bs.h);
            }
        }
        return onTouchEvent;
    }

    @Override
    public final void q0(View view, View view2) {
    }
}
