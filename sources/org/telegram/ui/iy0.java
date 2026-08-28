package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class iy0 extends f2.d1 {
    public final int f39319a;
    public final ProfileActivity f39320b;

    public iy0(ProfileActivity profileActivity, int i9) {
        this.f39319a = i9;
        this.f39320b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        boolean z10;
        switch (this.f39319a) {
            case 0:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39320b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f39320b;
                boolean z11 = true;
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.B0 && i9 != 2) {
                    profileActivity.B0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                if (w0Var != null) {
                    if (i9 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f36065v1 = z10;
                    w0Var.setEnabled((z10 || profileActivity.f35999l2) ? false : false);
                }
                hz0 hz0Var = profileActivity.K;
                boolean z12 = profileActivity.f35918a.G1;
                hz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i9, int i10) {
        switch (this.f39319a) {
            case 1:
                ProfileActivity profileActivity = this.f39320b;
                org.telegram.ui.Components.s30 s30Var = profileActivity.T;
                boolean z10 = true;
                if (s30Var != null) {
                    s30Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.f36085y1 != null && !profileActivity.f36091z1 && profileActivity.f35932c.N0() > profileActivity.f36042r4 - 8) {
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
