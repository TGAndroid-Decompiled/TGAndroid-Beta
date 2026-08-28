package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nx0 implements d5.d {
    public final int f40846a;
    public final ProfileActivity f40847b;

    public nx0(ProfileActivity profileActivity, int i9) {
        this.f40846a = i9;
        this.f40847b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f40846a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    dh.u uVar = z8Var.f26035a;
                    ProfileActivity profileActivity = this.f40847b;
                    uVar.setLoading(profileActivity.f35953e5);
                    z8Var.f26036b.setLoading(profileActivity.f35953e5);
                    return;
                }
                return;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity2 = this.f40847b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view).setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, profileActivity2.f36064v0));
                } else if (view instanceof org.telegram.ui.Cells.z8) {
                    ((org.telegram.ui.Cells.z8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.f6.P1.linkColor = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, ((org.telegram.ui.Cells.j) view).E);
                } else if (view instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view).getCheckBox().invalidate();
                } else if (view instanceof pf.b1) {
                    pf.b1 b1Var = (pf.b1) view;
                    org.telegram.ui.Components.tp tpVar = b1Var.f45577r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i9 = org.telegram.ui.ActionBar.f6.o6;
                    org.telegram.ui.ActionBar.b6 b6Var = b1Var.f45571a;
                    int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                    b1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                    b1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.f6.l1(0.22f, v03);
                    tpVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                    b1Var.a(v04);
                    tpVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view).d();
                }
                vz0 vz0Var = profileActivity2.d;
                profileActivity2.f35918a.getClass();
                RecyclerView.R(view);
                vz0Var.getClass();
                profileActivity2.d.getClass();
                return;
        }
    }
}
