package org.telegram.ui;

import android.view.View;
public final class ju0 extends u4.b0 {
    public final ProfileActivity I;

    public ju0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f41735c.m(0);
        if (m10 != null && !profileActivity.G0) {
            int top = m10.getTop() - profileActivity.j4();
            boolean z10 = profileActivity.f41819o2;
            boolean z11 = true;
            if (!z10 && top > i3) {
                if (!profileActivity.f41817o0.Y0.isEmpty() && profileActivity.f41758f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1() && ((!profileActivity.f41813n2 && !org.telegram.messenger.g0.Q1()) || profileActivity.J0)) {
                    if (profileActivity.J2 != null) {
                        z11 = false;
                    }
                    profileActivity.f41819o2 = z11;
                }
            } else if (z10) {
                if (i3 >= top) {
                    profileActivity.f41819o2 = false;
                } else if (profileActivity.f41719a.getScrollState() == 1 && !profileActivity.f41826p2) {
                    i3 /= 2;
                }
            }
            i3 = top;
        }
        if (profileActivity.O1 && !profileActivity.f41719a.Q0) {
            return 0;
        }
        return super.o0(i3, eVar, a1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f41839r0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void z0(u4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.J0(this.I));
    }
}
