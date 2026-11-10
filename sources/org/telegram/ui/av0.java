package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class av0 extends v4.s0 {
    public final int f43824a;
    public final ProfileActivity f43825b;

    public av0(ProfileActivity profileActivity, int i7) {
        this.f43824a = i7;
        this.f43825b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        View m10;
        switch (this.f43824a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f43825b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f43825b;
                boolean z10 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i7 != 2) {
                    profileActivity.F0 = false;
                }
                if (i7 == 0 && !profileActivity.F1 && (m10 = profileActivity.f41705c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.T0;
                if (g5Var != null) {
                    if (i7 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    profileActivity.f41861y1 = z9;
                    if (z9 || profileActivity.f41790o2) {
                        z10 = false;
                    }
                    g5Var.setEnabled(z10);
                }
                yv0 yv0Var = profileActivity.N;
                boolean z11 = profileActivity.f41689a.I1;
                yv0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f43824a) {
            case 1:
                ProfileActivity profileActivity = this.f43825b;
                fi.m3 m3Var = profileActivity.W;
                boolean z9 = true;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.B1 != null && !profileActivity.C1 && profileActivity.f41705c.N0() > profileActivity.f41833u4 - 8) {
                    profileActivity.h4(false);
                }
                yv0 yv0Var = profileActivity.N;
                if (yv0Var.getY() > 0.0f) {
                    z9 = false;
                }
                yv0Var.setPinnedToTop(z9);
                profileActivity.s5();
                return;
            default:
                return;
        }
    }
}
