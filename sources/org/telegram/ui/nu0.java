package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class nu0 extends u4.t0 {
    public final int f48128a;
    public final ProfileActivity f48129b;

    public nu0(ProfileActivity profileActivity, int i3) {
        this.f48128a = i3;
        this.f48129b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        boolean z10;
        View m10;
        switch (this.f48128a) {
            case 0:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.f48129b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f48129b;
                boolean z11 = true;
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i3 != 2) {
                    profileActivity.G0 = false;
                }
                if (i3 == 0 && !profileActivity.G1 && (m10 = profileActivity.f41735c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                if (f5Var != null) {
                    if (i3 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f41898z1 = z10;
                    if (z10 || profileActivity.f41826p2) {
                        z11 = false;
                    }
                    f5Var.setEnabled(z11);
                }
                mv0 mv0Var = profileActivity.O;
                boolean z12 = profileActivity.f41719a.J1;
                mv0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.f48128a) {
            case 1:
                ProfileActivity profileActivity = this.f48129b;
                gi.l3 l3Var = profileActivity.X;
                boolean z10 = true;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f41735c.N0() > profileActivity.f41870v4 - 8) {
                    profileActivity.h4(false);
                }
                mv0 mv0Var = profileActivity.O;
                if (mv0Var.getY() > 0.0f) {
                    z10 = false;
                }
                mv0Var.setPinnedToTop(z10);
                profileActivity.p5();
                return;
            default:
                return;
        }
    }
}
