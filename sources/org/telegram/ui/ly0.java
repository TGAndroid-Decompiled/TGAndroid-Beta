package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ly0 implements Utilities.Callback {
    public final int f35107a;
    public final ProfileActivity f35108b;

    public ly0(ProfileActivity profileActivity, int i10) {
        this.f35107a = i10;
        this.f35108b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35107a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    vh.o oVar = d9Var.f19880a;
                    ProfileActivity profileActivity = this.f35108b;
                    oVar.setLoading(profileActivity.f31273i5);
                    d9Var.f19881b.setLoading(profileActivity.f31273i5);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f35108b;
                profileActivity2.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity2.showDialog(new org.telegram.ui.Components.tv(profileActivity2, profileActivity2.getParentActivity(), profileActivity2.f31383z0, arrayList));
                return;
            case 2:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity3 = this.f35108b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view2).setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, profileActivity3.f31383z0));
                } else if (view2 instanceof org.telegram.ui.Cells.d9) {
                    ((org.telegram.ui.Cells.d9) view2).e();
                } else if (view2 instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view2).v();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.h6.P1.linkColor = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, ((org.telegram.ui.Cells.j) view2).I);
                } else if (view2 instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof hg.k1) {
                    hg.k1 k1Var = (hg.k1) view2;
                    org.telegram.ui.Components.eq eqVar = k1Var.f10321r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.h6.f18990o6;
                    org.telegram.ui.ActionBar.d6 d6Var = k1Var.f10316a;
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.h6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.h6.l1(0.22f, v03);
                    eqVar.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v04);
                    eqVar.setTextColor(v04);
                } else if (view2 instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view2).e();
                }
                s01 s01Var = profileActivity3.d;
                profileActivity3.f31209a.getClass();
                RecyclerView.R(view2);
                s01Var.getClass();
                profileActivity3.d.getClass();
                return;
            default:
                ProfileActivity.e0(this.f35108b, (Boolean) obj);
                return;
        }
    }
}
