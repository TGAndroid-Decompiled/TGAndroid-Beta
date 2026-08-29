package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nx0 implements f5.d {
    public final int f40920a;
    public final ProfileActivity f40921b;

    public nx0(ProfileActivity profileActivity, int i10) {
        this.f40920a = i10;
        this.f40921b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f40920a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.w8) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    gh.s sVar = w8Var.f25875a;
                    ProfileActivity profileActivity = this.f40921b;
                    sVar.setLoading(profileActivity.f36018e5);
                    w8Var.f25876b.setLoading(profileActivity.f36018e5);
                    return;
                }
                return;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.k4;
                ProfileActivity profileActivity2 = this.f40921b;
                if (z10) {
                    ((org.telegram.ui.Cells.k4) view).setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, profileActivity2.f36129v0));
                } else if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    ((org.telegram.ui.Cells.m8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.g6.P1.linkColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, ((org.telegram.ui.Cells.j) view).E);
                } else if (view instanceof org.telegram.ui.Cells.h5) {
                    ((org.telegram.ui.Cells.h5) view).getCheckBox().invalidate();
                } else if (view instanceof sf.a1) {
                    sf.a1 a1Var = (sf.a1) view;
                    org.telegram.ui.Components.xp xpVar = a1Var.f47744r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.g6.f23260o6;
                    org.telegram.ui.ActionBar.c6 c6Var = a1Var.f47738a;
                    int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    a1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    a1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.g6.l1(0.22f, v03);
                    xpVar.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                    a1Var.a(v04);
                    xpVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.e6) {
                    ((org.telegram.ui.Cells.e6) view).e();
                }
                vz0 vz0Var = profileActivity2.d;
                profileActivity2.f35984a.getClass();
                RecyclerView.R(view);
                vz0Var.getClass();
                profileActivity2.d.getClass();
                return;
        }
    }
}
