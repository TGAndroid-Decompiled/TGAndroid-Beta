package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dy0 extends f2.m0 {
    public final ProfileActivity I;

    public dy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f35932c.m(0);
        if (m10 != null && !profileActivity.B0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.f35993k2;
            boolean z11 = true;
            if (!z10 && top > i9) {
                if (!profileActivity.f35984j0.T0.isEmpty() && profileActivity.f35919a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f35986j2 && !AndroidUtilities.isTablet()) || profileActivity.E0)) {
                    if (profileActivity.F2 != null) {
                        z11 = false;
                    }
                    profileActivity.f35993k2 = z11;
                }
            } else if (z10) {
                if (i9 >= top) {
                    profileActivity.f35993k2 = false;
                } else if (profileActivity.f35918a.getScrollState() == 1 && !profileActivity.f35999l2) {
                    i9 /= 2;
                }
            }
            i9 = top;
        }
        if (profileActivity.K1 && !profileActivity.f35918a.K0) {
            return 0;
        }
        return super.o0(i9, g1Var, n1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.m0 != null) {
            return true;
        }
        return false;
    }
}
