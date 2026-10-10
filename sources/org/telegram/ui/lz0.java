package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class lz0 extends s4.t0 {
    public final int f39758a;
    public final ProfileActivity f39759b;

    public lz0(ProfileActivity profileActivity, int i10) {
        this.f39758a = i10;
        this.f39759b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f39758a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39759b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f39759b;
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
                    profileActivity.f34425z1 = z10;
                    if (z10 || profileActivity.f34357p2) {
                        z11 = false;
                    }
                    v0Var.setEnabled(z11);
                }
                k01 k01Var = profileActivity.O;
                boolean z12 = profileActivity.f34249a.I1;
                k01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39758a) {
            case 1:
                ProfileActivity profileActivity = this.f39759b;
                org.telegram.ui.Components.a50 a50Var = profileActivity.X;
                boolean z10 = true;
                if (a50Var != null) {
                    a50Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f34264c.N0() > profileActivity.f34401v4 - 8) {
                    profileActivity.R3(false);
                }
                k01 k01Var = profileActivity.O;
                if (k01Var.getY() > 0.0f) {
                    z10 = false;
                }
                k01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
