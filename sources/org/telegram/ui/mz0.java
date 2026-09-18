package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class mz0 extends s4.s0 {
    public final int f35780a;
    public final ProfileActivity f35781b;

    public mz0(ProfileActivity profileActivity, int i10) {
        this.f35780a = i10;
        this.f35781b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f35780a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f35781b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f35781b;
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
                    profileActivity.f31657z1 = z10;
                    v0Var.setEnabled((z10 || profileActivity.f31589p2) ? false : false);
                }
                l01 l01Var = profileActivity.O;
                boolean z12 = profileActivity.f31482a.K1;
                l01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f35780a) {
            case 1:
                ProfileActivity profileActivity = this.f35781b;
                org.telegram.ui.Components.i40 i40Var = profileActivity.X;
                boolean z10 = true;
                if (i40Var != null) {
                    i40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f31497c.N0() > profileActivity.f31633v4 - 8) {
                    profileActivity.R3(false);
                }
                l01 l01Var = profileActivity.O;
                if (l01Var.getY() > 0.0f) {
                    z10 = false;
                }
                l01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
