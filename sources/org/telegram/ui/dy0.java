package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy0 extends f2.j0 {
    public final ProfileActivity I;

    public dy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f35999c.m(0);
        if (m10 != null && !profileActivity.B0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.f36058k2;
            boolean z11 = true;
            if (!z10 && top > i10) {
                if (!profileActivity.f36049j0.T0.isEmpty() && profileActivity.f35985a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f36051j2 && !AndroidUtilities.isTablet()) || profileActivity.E0)) {
                    if (profileActivity.F2 != null) {
                        z11 = false;
                    }
                    profileActivity.f36058k2 = z11;
                }
            } else if (z10) {
                if (i10 >= top) {
                    profileActivity.f36058k2 = false;
                } else if (profileActivity.f35984a.getScrollState() == 1 && !profileActivity.f36064l2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.K1 && !profileActivity.f35984a.K0) {
            return 0;
        }
        return super.o0(i10, d1Var, k1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.m0 != null) {
            return true;
        }
        return false;
    }
}
