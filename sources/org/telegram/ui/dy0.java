package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class dy0 extends f2.k0 {
    public final ProfileActivity I;

    public dy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        ProfileActivity profileActivity = this.I;
        View viewM = profileActivity.f35935c.m(0);
        if (viewM != null && !profileActivity.B0) {
            int top = viewM.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.f35996k2;
            if (z10 || top <= i10) {
                if (z10) {
                    if (i10 >= top) {
                        profileActivity.f35996k2 = false;
                    } else if (profileActivity.f35921a.getScrollState() == 1 && !profileActivity.f36002l2) {
                        i10 /= 2;
                    }
                }
            } else if (!profileActivity.f35987j0.T0.isEmpty() && profileActivity.f35922a0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f35989j2 && !AndroidUtilities.isTablet()) || profileActivity.E0)) {
                profileActivity.f35996k2 = profileActivity.F2 == null;
            }
            i10 = top;
        }
        if (!profileActivity.K1 || profileActivity.f35921a.K0) {
            return super.o0(i10, e1Var, l1Var);
        }
        return 0;
    }

    @Override
    public final boolean y0() {
        return this.I.m0 != null;
    }
}
