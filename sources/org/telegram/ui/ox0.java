package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class ox0 implements d5.d {

    public final int f41205a;

    public final ProfileActivity f41206b;

    public ox0(ProfileActivity profileActivity, int i10) {
        this.f41205a = i10;
        this.f41206b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f41205a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.v8) {
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    eh.s sVar = v8Var.f25814a;
                    ProfileActivity profileActivity = this.f41206b;
                    sVar.setLoading(profileActivity.f35956e5);
                    v8Var.f25815b.setLoading(profileActivity.f35956e5);
                }
                break;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.j4;
                ProfileActivity profileActivity2 = this.f41206b;
                if (z10) {
                    ((org.telegram.ui.Cells.j4) view).setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, profileActivity2.f36067v0));
                } else if (view instanceof org.telegram.ui.Cells.v8) {
                    ((org.telegram.ui.Cells.v8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    ((org.telegram.ui.Cells.l8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.g6.P1.linkColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, ((org.telegram.ui.Cells.j) view).E);
                } else if (view instanceof org.telegram.ui.Cells.g5) {
                    ((org.telegram.ui.Cells.g5) view).getCheckBox().invalidate();
                } else if (view instanceof qf.b1) {
                    qf.b1 b1Var = (qf.b1) view;
                    org.telegram.ui.Components.rp rpVar = b1Var.f46248r;
                    int iDp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.g6.f23251o6;
                    org.telegram.ui.ActionBar.c6 c6Var = b1Var.f46242a;
                    int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    b1Var.a(iV0);
                    int iL1 = org.telegram.ui.ActionBar.g6.l1(0.1f, iV0);
                    int iV1 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    b1Var.a(iV1);
                    int iL2 = org.telegram.ui.ActionBar.g6.l1(0.22f, iV1);
                    rpVar.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iL1, iL2, iL2));
                    int iV2 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    b1Var.a(iV2);
                    rpVar.setTextColor(iV2);
                } else if (view instanceof org.telegram.ui.Cells.d6) {
                    ((org.telegram.ui.Cells.d6) view).d();
                }
                vz0 vz0Var = profileActivity2.d;
                profileActivity2.f35921a.getClass();
                RecyclerView.R(view);
                vz0Var.getClass();
                profileActivity2.d.getClass();
                break;
        }
    }
}
