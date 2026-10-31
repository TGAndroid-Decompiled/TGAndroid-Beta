package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class hw0 extends s4.s0 {
    public final int f38042a;
    public final ProfileActivity f38043b;

    public hw0(ProfileActivity profileActivity, int i10) {
        this.f38042a = i10;
        this.f38043b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f38042a) {
            case 0:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f38043b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f38043b;
                boolean z11 = true;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                if (p5Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f33945y1 = z10;
                    if (z10 || profileActivity.f33873o2) {
                        z11 = false;
                    }
                    p5Var.setEnabled(z11);
                }
                ix0 ix0Var = profileActivity.N;
                boolean z12 = profileActivity.f33772a.I1;
                ix0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f38042a) {
            case 1:
                ProfileActivity profileActivity = this.f38043b;
                org.telegram.ui.Components.q30 q30Var = profileActivity.W;
                boolean z10 = true;
                if (q30Var != null) {
                    q30Var.b(true);
                }
                profileActivity.N3();
                if (profileActivity.B1 != null && !profileActivity.C1 && profileActivity.f33787c.N0() > profileActivity.f33917u4 - 8) {
                    profileActivity.g4(false);
                }
                ix0 ix0Var = profileActivity.N;
                if (ix0Var.getY() > 0.0f) {
                    z10 = false;
                }
                ix0Var.setPinnedToTop(z10);
                profileActivity.o5();
                return;
            default:
                return;
        }
    }
}
