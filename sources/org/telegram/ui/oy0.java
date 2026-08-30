package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oy0 extends f2.i0 {
    public final ProfileActivity I;

    public oy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, bf.f fVar, f2.i1 i1Var) {
        ProfileActivity profileActivity = this.I;
        View m9 = profileActivity.f32043c.m(0);
        if (m9 != null && !profileActivity.C0) {
            int top = m9.getTop() - profileActivity.T3();
            boolean z4 = profileActivity.f32107l2;
            boolean z10 = true;
            if (!z4 && top > i10) {
                if (!profileActivity.f32099k0.U0.isEmpty() && profileActivity.f32036b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f32101k2 && !AndroidUtilities.isTablet()) || profileActivity.F0)) {
                    if (profileActivity.G2 != null) {
                        z10 = false;
                    }
                    profileActivity.f32107l2 = z10;
                }
            } else if (z4) {
                if (i10 >= top) {
                    profileActivity.f32107l2 = false;
                } else if (profileActivity.f32028a.getScrollState() == 1 && !profileActivity.f32113m2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.L1 && !profileActivity.f32028a.L0) {
            return 0;
        }
        return super.o0(i10, fVar, i1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f32119n0 != null) {
            return true;
        }
        return false;
    }
}
