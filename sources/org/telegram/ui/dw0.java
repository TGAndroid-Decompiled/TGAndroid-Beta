package org.telegram.ui;

import android.view.View;
public final class dw0 extends s4.a0 {
    public final ProfileActivity I;

    public dw0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f33787c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.i4();
            boolean z10 = profileActivity.f33866n2;
            boolean z11 = true;
            if (!z10 && top > i10) {
                if (!profileActivity.f33864n0.X0.isEmpty() && profileActivity.f33802e0.getImageReceiver().L() && !org.telegram.messenger.i0.C1() && ((!profileActivity.f33858m2 && !org.telegram.messenger.i0.Q1()) || profileActivity.I0)) {
                    if (profileActivity.I2 != null) {
                        z11 = false;
                    }
                    profileActivity.f33866n2 = z11;
                }
            } else if (z10) {
                if (i10 >= top) {
                    profileActivity.f33866n2 = false;
                } else if (profileActivity.f33772a.getScrollState() == 1 && !profileActivity.f33873o2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.N1 && !profileActivity.f33772a.P0) {
            return 0;
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f33884q0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void z0(s4.z0 z0Var, int[] iArr) {
        super.z0(z0Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.I0(this.I));
    }
}
