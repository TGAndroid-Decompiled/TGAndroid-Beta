package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class kz0 extends s4.t0 {
    public final int f39489a;
    public final ProfileActivity f39490b;

    public kz0(ProfileActivity profileActivity, int i10) {
        this.f39489a = i10;
        this.f39490b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f39489a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39490b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f39490b;
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
                    profileActivity.f34449z1 = z10;
                    if (z10 || profileActivity.f34381p2) {
                        z11 = false;
                    }
                    u0Var.setEnabled(z11);
                }
                j01 j01Var = profileActivity.O;
                boolean z12 = profileActivity.f34273a.I1;
                j01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39489a) {
            case 1:
                ProfileActivity profileActivity = this.f39490b;
                org.telegram.ui.Components.a50 a50Var = profileActivity.X;
                boolean z10 = true;
                if (a50Var != null) {
                    a50Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f34288c.N0() > profileActivity.f34425v4 - 8) {
                    profileActivity.R3(false);
                }
                j01 j01Var = profileActivity.O;
                if (j01Var.getY() > 0.0f) {
                    z10 = false;
                }
                j01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
