package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nz0 extends s4.s0 {
    public final int f39064a;
    public final ProfileActivity f39065b;

    public nz0(ProfileActivity profileActivity, int i10) {
        this.f39064a = i10;
        this.f39065b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f39064a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39065b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f39065b;
                boolean z11 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                if (v0Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f34032z1 = z10;
                    v0Var.setEnabled((z10 || profileActivity.f33964p2) ? false : false);
                }
                m01 m01Var = profileActivity.O;
                boolean z12 = profileActivity.f33856a.K1;
                m01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39064a) {
            case 1:
                ProfileActivity profileActivity = this.f39065b;
                org.telegram.ui.Components.i40 i40Var = profileActivity.X;
                boolean z10 = true;
                if (i40Var != null) {
                    i40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f33871c.N0() > profileActivity.f34008v4 - 8) {
                    profileActivity.R3(false);
                }
                m01 m01Var = profileActivity.O;
                if (m01Var.getY() > 0.0f) {
                    z10 = false;
                }
                m01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
