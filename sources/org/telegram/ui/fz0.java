package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class fz0 extends s4.s0 {
    public final int f36447a;
    public final ProfileActivity f36448b;

    public fz0(ProfileActivity profileActivity, int i10) {
        this.f36447a = i10;
        this.f36448b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f36447a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f36448b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f36448b;
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
                    profileActivity.f34377z1 = z10;
                    v0Var.setEnabled((z10 || profileActivity.f34309p2) ? false : false);
                }
                e01 e01Var = profileActivity.O;
                boolean z12 = profileActivity.f34201a.K1;
                e01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f36447a) {
            case 1:
                ProfileActivity profileActivity = this.f36448b;
                org.telegram.ui.Components.m40 m40Var = profileActivity.X;
                boolean z10 = true;
                if (m40Var != null) {
                    m40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f34216c.N0() > profileActivity.f34353v4 - 8) {
                    profileActivity.R3(false);
                }
                e01 e01Var = profileActivity.O;
                if (e01Var.getY() > 0.0f) {
                    z10 = false;
                }
                e01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
