package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class my0 implements Utilities.Callback {
    public final int f38784a;
    public final ProfileActivity f38785b;

    public my0(ProfileActivity profileActivity, int i10) {
        this.f38784a = i10;
        this.f38785b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38784a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    vh.n nVar = c9Var.f21892a;
                    ProfileActivity profileActivity = this.f38785b;
                    nVar.setLoading(profileActivity.f34273i5);
                    c9Var.f21893b.setLoading(profileActivity.f34273i5);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f38785b;
                profileActivity2.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity2.showDialog(new org.telegram.ui.Components.wv(profileActivity2, profileActivity2.getParentActivity(), profileActivity2.f34383z0, arrayList));
                return;
            case 2:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity3 = this.f38785b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view2).setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, profileActivity3.f34383z0));
                } else if (view2 instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view2).e();
                } else if (view2 instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view2).v();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.i6.P1.linkColor = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, ((org.telegram.ui.Cells.j) view2).I);
                } else if (view2 instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof hg.j1) {
                    hg.j1 j1Var = (hg.j1) view2;
                    org.telegram.ui.Components.gq gqVar = j1Var.f11234r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.i6.f21025o6;
                    org.telegram.ui.ActionBar.d6 d6Var = j1Var.f11228a;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
                    j1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.i6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
                    j1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.i6.l1(0.22f, v03);
                    gqVar.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
                    j1Var.a(v04);
                    gqVar.setTextColor(v04);
                } else if (view2 instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view2).e();
                }
                s01 s01Var = profileActivity3.d;
                profileActivity3.f34208a.getClass();
                RecyclerView.R(view2);
                s01Var.getClass();
                profileActivity3.d.getClass();
                return;
            default:
                ProfileActivity.e0(this.f38785b, (Boolean) obj);
                return;
        }
    }
}
