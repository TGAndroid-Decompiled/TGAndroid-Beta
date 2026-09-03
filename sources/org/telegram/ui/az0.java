package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class az0 extends f2.z0 {
    public final int f32677a;
    public final ProfileActivity f32678b;

    public az0(ProfileActivity profileActivity, int i10) {
        this.f32677a = i10;
        this.f32678b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        switch (this.f32677a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f32678b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f32678b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.C0 && i10 != 2) {
                    profileActivity.C0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    profileActivity.f32156w1 = z4;
                    w0Var.setEnabled((z4 || profileActivity.f32087m2) ? false : false);
                }
                zz0 zz0Var = profileActivity.L;
                boolean z11 = profileActivity.f32002a.H1;
                zz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f32677a) {
            case 1:
                ProfileActivity profileActivity = this.f32678b;
                org.telegram.ui.Components.l40 l40Var = profileActivity.U;
                boolean z4 = true;
                if (l40Var != null) {
                    l40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.f32176z1 != null && !profileActivity.A1 && profileActivity.f32017c.N0() > profileActivity.f32134s4 - 8) {
                    profileActivity.R3(false);
                }
                zz0 zz0Var = profileActivity.L;
                if (zz0Var.getY() > 0.0f) {
                    z4 = false;
                }
                zz0Var.setPinnedToTop(z4);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
