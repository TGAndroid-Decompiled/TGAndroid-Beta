package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class lz0 extends s4.t0 {
    public final int f39712a;
    public final ProfileActivity f39713b;

    public lz0(ProfileActivity profileActivity, int i10) {
        this.f39712a = i10;
        this.f39713b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f39712a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39713b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f39713b;
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
                    profileActivity.f34387z1 = z10;
                    if (z10 || profileActivity.f34319p2) {
                        z11 = false;
                    }
                    v0Var.setEnabled(z11);
                }
                k01 k01Var = profileActivity.O;
                boolean z12 = profileActivity.f34211a.I1;
                k01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39712a) {
            case 1:
                ProfileActivity profileActivity = this.f39713b;
                org.telegram.ui.Components.z40 z40Var = profileActivity.X;
                boolean z10 = true;
                if (z40Var != null) {
                    z40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f34226c.N0() > profileActivity.f34363v4 - 8) {
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
