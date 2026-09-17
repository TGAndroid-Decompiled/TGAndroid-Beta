package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class oz0 extends s4.s0 {
    public final int f36463a;
    public final ProfileActivity f36464b;

    public oz0(ProfileActivity profileActivity, int i10) {
        this.f36463a = i10;
        this.f36464b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f36463a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f36464b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f36464b;
                boolean z11 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f31426z1 = z10;
                    w0Var.setEnabled((z10 || profileActivity.f31358p2) ? false : false);
                }
                n01 n01Var = profileActivity.O;
                boolean z12 = profileActivity.f31251a.K1;
                n01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f36463a) {
            case 1:
                ProfileActivity profileActivity = this.f36464b;
                org.telegram.ui.Components.i40 i40Var = profileActivity.X;
                boolean z10 = true;
                if (i40Var != null) {
                    i40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f31266c.N0() > profileActivity.f31402v4 - 8) {
                    profileActivity.R3(false);
                }
                n01 n01Var = profileActivity.O;
                if (n01Var.getY() > 0.0f) {
                    z10 = false;
                }
                n01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
