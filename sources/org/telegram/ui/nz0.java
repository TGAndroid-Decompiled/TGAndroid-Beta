package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nz0 extends s4.t0 {
    public final int f40515a;
    public final ProfileActivity f40516b;

    public nz0(ProfileActivity profileActivity, int i10) {
        this.f40515a = i10;
        this.f40516b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f40515a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f40516b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f40516b;
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
                    profileActivity.f34226z1 = z10;
                    if (z10 || profileActivity.f34158p2) {
                        z11 = false;
                    }
                    u0Var.setEnabled(z11);
                }
                m01 m01Var = profileActivity.O;
                boolean z12 = profileActivity.f34050a.I1;
                m01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f40515a) {
            case 1:
                ProfileActivity profileActivity = this.f40516b;
                org.telegram.ui.Components.c50 c50Var = profileActivity.X;
                boolean z10 = true;
                if (c50Var != null) {
                    c50Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f34065c.N0() > profileActivity.f34202v4 - 8) {
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
