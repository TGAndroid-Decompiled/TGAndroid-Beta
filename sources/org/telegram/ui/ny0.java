package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ny0 extends s4.b0 {
    public final ProfileActivity I;

    public ny0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f33899c.m(0);
        if (m10 != null && !profileActivity.G0) {
            int top = m10.getTop() - profileActivity.V3();
            boolean z10 = profileActivity.f33992p2;
            boolean z11 = true;
            if (!z10 && top > i10) {
                if (!profileActivity.f33983o0.X0.isEmpty() && profileActivity.f33922f0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f33985o2 && !AndroidUtilities.isTablet()) || profileActivity.J0)) {
                    if (profileActivity.K2 != null) {
                        z11 = false;
                    }
                    profileActivity.f33992p2 = z11;
                }
            } else if (z10) {
                if (i10 >= top) {
                    profileActivity.f33992p2 = false;
                } else if (profileActivity.f33884a.getScrollState() == 1 && !profileActivity.f33998q2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.P1 && !profileActivity.f33884a.P0) {
            return 0;
        }
        return super.o0(i10, eVar, y0Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f34003r0 != null) {
            return true;
        }
        return false;
    }
}
