package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class dz0 extends s4.s0 {
    public final int f33234a;
    public final ProfileActivity f33235b;

    public dz0(ProfileActivity profileActivity, int i10) {
        this.f33234a = i10;
        this.f33235b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f33234a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33235b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f33235b;
                boolean z11 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                if (u0Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f31700z1 = z10;
                    u0Var.setEnabled((z10 || profileActivity.f31632p2) ? false : false);
                }
                c01 c01Var = profileActivity.O;
                boolean z12 = profileActivity.f31525a.K1;
                c01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f33234a) {
            case 1:
                ProfileActivity profileActivity = this.f33235b;
                org.telegram.ui.Components.j40 j40Var = profileActivity.X;
                boolean z10 = true;
                if (j40Var != null) {
                    j40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f31540c.N0() > profileActivity.f31676v4 - 8) {
                    profileActivity.R3(false);
                }
                c01 c01Var = profileActivity.O;
                if (c01Var.getY() > 0.0f) {
                    z10 = false;
                }
                c01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
