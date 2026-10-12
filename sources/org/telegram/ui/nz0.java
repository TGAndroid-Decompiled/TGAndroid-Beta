package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nz0 extends s4.b0 {
    public final ProfileActivity I;

    public nz0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f32543c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.T3();
            boolean z10 = profileActivity.f32629o2;
            boolean z11 = true;
            if (!z10 && top > i10) {
                if (!profileActivity.f32620n0.X0.isEmpty() && profileActivity.f32558e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f32622n2 && !AndroidUtilities.isTablet()) || profileActivity.I0)) {
                    if (profileActivity.J2 != null) {
                        z11 = false;
                    }
                    profileActivity.f32629o2 = z11;
                }
            } else if (z10) {
                if (i10 >= top) {
                    profileActivity.f32629o2 = false;
                } else if (profileActivity.f32528a.getScrollState() == 1 && !profileActivity.f32636p2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.O1 && !profileActivity.f32528a.P0) {
            return 0;
        }
        return super.o0(i10, eVar, y0Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f32640q0 != null) {
            return true;
        }
        return false;
    }
}
