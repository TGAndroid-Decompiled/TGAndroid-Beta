package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class iy0 extends f2.b1 {

    public final int f39185a;

    public final ProfileActivity f39186b;

    public iy0(ProfileActivity profileActivity, int i10) {
        this.f39185a = i10;
        this.f39186b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f39185a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39186b.getParentActivity().getCurrentFocus());
                }
                break;
            default:
                ProfileActivity profileActivity = this.f39186b;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.B0 && i10 != 2) {
                    profileActivity.B0 = false;
                }
                org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
                if (v0Var != null) {
                    boolean z10 = i10 != 0;
                    profileActivity.f36068v1 = z10;
                    v0Var.setEnabled((z10 || profileActivity.f36002l2) ? false : true);
                }
                hz0 hz0Var = profileActivity.K;
                boolean z11 = profileActivity.f35921a.G1;
                hz0Var.getClass();
                break;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39185a) {
            case 1:
                ProfileActivity profileActivity = this.f39186b;
                org.telegram.ui.Components.x30 x30Var = profileActivity.T;
                if (x30Var != null) {
                    x30Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.f36088y1 != null && !profileActivity.f36094z1 && profileActivity.f35935c.N0() > profileActivity.f36045r4 - 8) {
                    profileActivity.R3(false);
                }
                hz0 hz0Var = profileActivity.K;
                hz0Var.setPinnedToTop(hz0Var.getY() <= 0.0f);
                profileActivity.U4();
                break;
        }
    }
}
