package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class kz0 extends s4.t0 {
    public final int f39455a;
    public final ProfileActivity f39456b;

    public kz0(ProfileActivity profileActivity, int i10) {
        this.f39455a = i10;
        this.f39456b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f39455a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39456b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f39456b;
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
                    profileActivity.f34415z1 = z10;
                    if (z10 || profileActivity.f34347p2) {
                        z11 = false;
                    }
                    u0Var.setEnabled(z11);
                }
                j01 j01Var = profileActivity.O;
                boolean z12 = profileActivity.f34239a.I1;
                j01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39455a) {
            case 1:
                ProfileActivity profileActivity = this.f39456b;
                org.telegram.ui.Components.a50 a50Var = profileActivity.X;
                boolean z10 = true;
                if (a50Var != null) {
                    a50Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f34254c.N0() > profileActivity.f34391v4 - 8) {
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
