package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class iy0 extends f2.a1 {
    public final int f39367a;
    public final ProfileActivity f39368b;

    public iy0(ProfileActivity profileActivity, int i10) {
        this.f39367a = i10;
        this.f39368b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f39367a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39368b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f39368b;
                boolean z11 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.B0 && i10 != 2) {
                    profileActivity.B0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                if (w0Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f36130v1 = z10;
                    w0Var.setEnabled((z10 || profileActivity.f36064l2) ? false : false);
                }
                hz0 hz0Var = profileActivity.K;
                boolean z12 = profileActivity.f35984a.G1;
                hz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39367a) {
            case 1:
                ProfileActivity profileActivity = this.f39368b;
                org.telegram.ui.Components.g40 g40Var = profileActivity.T;
                boolean z10 = true;
                if (g40Var != null) {
                    g40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.f36150y1 != null && !profileActivity.f36156z1 && profileActivity.f35999c.N0() > profileActivity.f36108r4 - 8) {
                    profileActivity.R3(false);
                }
                hz0 hz0Var = profileActivity.K;
                if (hz0Var.getY() > 0.0f) {
                    z10 = false;
                }
                hz0Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
