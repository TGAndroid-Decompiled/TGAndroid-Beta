package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gw0 extends s4.s0 {
    public final int f37575a;
    public final ProfileActivity f37576b;

    public gw0(ProfileActivity profileActivity, int i10) {
        this.f37575a = i10;
        this.f37576b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        View m10;
        switch (this.f37575a) {
            case 0:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f37576b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f37576b;
                boolean z11 = true;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                if (i10 == 0 && !profileActivity.F1 && (m10 = profileActivity.f33794c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                if (p5Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f33952y1 = z10;
                    if (z10 || profileActivity.f33880o2) {
                        z11 = false;
                    }
                    p5Var.setEnabled(z11);
                }
                hx0 hx0Var = profileActivity.N;
                boolean z12 = profileActivity.f33779a.I1;
                hx0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f37575a) {
            case 1:
                ProfileActivity profileActivity = this.f37576b;
                org.telegram.ui.Components.q30 q30Var = profileActivity.W;
                boolean z10 = true;
                if (q30Var != null) {
                    q30Var.b(true);
                }
                profileActivity.O3();
                if (profileActivity.B1 != null && !profileActivity.C1 && profileActivity.f33794c.N0() > profileActivity.f33924u4 - 8) {
                    profileActivity.h4(false);
                }
                hx0 hx0Var = profileActivity.N;
                if (hx0Var.getY() > 0.0f) {
                    z10 = false;
                }
                hx0Var.setPinnedToTop(z10);
                profileActivity.p5();
                return;
            default:
                return;
        }
    }
}
