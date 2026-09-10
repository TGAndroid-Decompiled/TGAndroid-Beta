package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lz0 extends s4.c0 {
    public final ProfileActivity I;

    public lz0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f30365c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.f30450o2;
            boolean z11 = true;
            if (!z10 && top > i10) {
                if (!profileActivity.f30441n0.X0.isEmpty() && profileActivity.f30380e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f30443n2 && !AndroidUtilities.isTablet()) || profileActivity.I0)) {
                    if (profileActivity.J2 != null) {
                        z11 = false;
                    }
                    profileActivity.f30450o2 = z11;
                }
            } else if (z10) {
                if (i10 >= top) {
                    profileActivity.f30450o2 = false;
                } else if (profileActivity.f30350a.getScrollState() == 1 && !profileActivity.f30457p2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.O1 && !profileActivity.f30350a.O0) {
            return 0;
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f30461q0 != null) {
            return true;
        }
        return false;
    }
}
