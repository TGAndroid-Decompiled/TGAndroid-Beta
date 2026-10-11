package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fz0 extends s4.d0 {
    public final ProfileActivity I;

    public fz0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f34288c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.f34374o2;
            boolean z11 = true;
            if (!z10 && top > i10) {
                if (!profileActivity.f34365n0.X0.isEmpty() && profileActivity.f34304e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f34367n2 && !AndroidUtilities.isTablet()) || profileActivity.I0)) {
                    if (profileActivity.J2 != null) {
                        z11 = false;
                    }
                    profileActivity.f34374o2 = z11;
                }
            } else if (z10) {
                if (i10 >= top) {
                    profileActivity.f34374o2 = false;
                } else if (profileActivity.f34273a.getScrollState() == 1 && !profileActivity.f34381p2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.O1 && !profileActivity.f34273a.P0) {
            return 0;
        }
        return super.o0(i10, eVar, a1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f34385q0 != null) {
            return true;
        }
        return false;
    }
}
