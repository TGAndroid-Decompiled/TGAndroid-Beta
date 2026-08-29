package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class by0 extends org.telegram.ui.Components.jl0 implements lh.z6 {
    public final ProfileActivity T2;
    public VelocityTracker U2;
    public final ProfileActivity V2;

    public by0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = profileActivity;
        this.T2 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.V2.K) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean H0(View view, float f9, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.T2).actionBar;
        iArr[0] = lVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.V2.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.V2;
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null) {
            if (hz0Var.C()) {
                hz0 hz0Var2 = profileActivity.K;
                if (hz0Var2.f32111y1 && hz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.K.C()) {
                hz0 hz0Var3 = profileActivity.K;
                if (hz0Var3.f32111y1 && (hz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.qu0.w0(profileActivity.K.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.gr0 gr0Var = profileActivity.K.R;
            if (gr0Var == null || !gr0Var.g()) {
                org.telegram.ui.Components.kr0 kr0Var = profileActivity.K.S;
                if (kr0Var != null && kr0Var.f44689w) {
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
        this.V2.U4();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        int O3;
        int action = motionEvent.getAction();
        boolean z10 = true;
        ProfileActivity profileActivity = this.V2;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.U2;
            if (velocityTracker2 == null) {
                this.U2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.U2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.U2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.U2.computeCurrentVelocity(1000);
                profileActivity.f36015e2 = this.U2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.U2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.U2.computeCurrentVelocity(1000);
                profileActivity.f36015e2 = this.U2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.U2.recycle();
            this.U2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int i12 = currentActionBarHeight + i11;
            if (profileActivity.f36051j2 && !profileActivity.E0) {
                O3 = profileActivity.T3();
            } else {
                i12 = profileActivity.f35984a.getMeasuredWidth();
                O3 = profileActivity.O3();
            }
            if (profileActivity.M1 >= (O3 + i12) - 1.0f) {
                profileActivity.w4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f35999c.m(0)) != null) {
            if (profileActivity.K1) {
                profileActivity.K1 = false;
                profileActivity.f35984a.J0 = true;
            }
            if (profileActivity.f36058k2) {
                if (profileActivity.f36064l2) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    if (lVar.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    profileActivity.f35984a.v0(0, ((m10.getTop() - profileActivity.f35984a.getMeasuredWidth()) - profileActivity.O3()) + currentActionBarHeight2 + i10, org.telegram.ui.Components.jr.h);
                    return onTouchEvent;
                }
                profileActivity.f35984a.v0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.jr.h);
                return onTouchEvent;
            }
            if (profileActivity.O3() <= 0) {
                z10 = false;
            }
            if (z10) {
                float f9 = profileActivity.M1;
                if (f9 > 0.0f && ((f9 < profileActivity.T3() * 0.6f || profileActivity.f36015e2 < -1000.0f) && profileActivity.M1 > profileActivity.O3() * 0.6f)) {
                    profileActivity.f35984a.v0(0, (int) (profileActivity.M1 - profileActivity.O3()), org.telegram.ui.Components.jr.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.M1;
                if (f10 > 0.0f && f10 < profileActivity.O3() * 0.6f) {
                    profileActivity.f35984a.v0(0, (int) (profileActivity.O3() - profileActivity.M1), org.telegram.ui.Components.jr.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.M1;
                if (f11 > 0.0f && profileActivity.f36015e2 < -1000.0f) {
                    profileActivity.f35984a.v0(0, (int) f11, org.telegram.ui.Components.jr.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.M1 > 0.0f) {
                profileActivity.f35984a.v0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.jr.h);
            }
        }
        return onTouchEvent;
    }

    @Override
    public final void q0(View view, View view2) {
    }
}
