package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mz0 extends s4.b0 {
    public final ProfileActivity I;

    public mz0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f32245c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.f32331o2;
            boolean z11 = true;
            if (!z10 && top > i10) {
                if (!profileActivity.f32322n0.X0.isEmpty() && profileActivity.f32260e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f32324n2 && !AndroidUtilities.isTablet()) || profileActivity.I0)) {
                    if (profileActivity.J2 != null) {
                        z11 = false;
                    }
                    profileActivity.f32331o2 = z11;
                }
            } else if (z10) {
                if (i10 >= top) {
                    profileActivity.f32331o2 = false;
                } else if (profileActivity.f32230a.getScrollState() == 1 && !profileActivity.f32338p2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.O1 && !profileActivity.f32230a.P0) {
            return 0;
        }
        return super.o0(i10, eVar, y0Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f32342q0 != null) {
            return true;
        }
        return false;
    }
}
