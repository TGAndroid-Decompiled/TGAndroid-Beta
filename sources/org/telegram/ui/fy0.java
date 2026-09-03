package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class fy0 implements h5.d {
    public final int f34253a;
    public final ProfileActivity f34254b;

    public fy0(ProfileActivity profileActivity, int i10) {
        this.f34253a = i10;
        this.f34254b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f34253a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.x8) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    ih.s sVar = x8Var.f22552a;
                    ProfileActivity profileActivity = this.f34254b;
                    sVar.setLoading(profileActivity.f32043f5);
                    x8Var.f22553b.setLoading(profileActivity.f32043f5);
                    return;
                }
                return;
            default:
                boolean z4 = view instanceof org.telegram.ui.Cells.l4;
                ProfileActivity profileActivity2 = this.f34254b;
                if (z4) {
                    ((org.telegram.ui.Cells.l4) view).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, profileActivity2.f32155w0));
                } else if (view instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    ((org.telegram.ui.Cells.n8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.j6.P1.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, ((org.telegram.ui.Cells.j) view).F);
                } else if (view instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view).getCheckBox().invalidate();
                } else if (view instanceof uf.a1) {
                    uf.a1 a1Var = (uf.a1) view;
                    org.telegram.ui.Components.aq aqVar = a1Var.f45310r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.f20078o6;
                    org.telegram.ui.ActionBar.f6 f6Var = a1Var.f45305a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.j6.l1(0.22f, v03);
                    aqVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v04);
                    aqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.f6) {
                    ((org.telegram.ui.Cells.f6) view).e();
                }
                n01 n01Var = profileActivity2.d;
                profileActivity2.f32002a.getClass();
                RecyclerView.R(view);
                n01Var.getClass();
                profileActivity2.d.getClass();
                return;
        }
    }
}
