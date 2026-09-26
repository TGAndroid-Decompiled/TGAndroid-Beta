package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class jy0 implements Utilities.Callback {
    public final int f34894a;
    public final ProfileActivity f34895b;

    public jy0(ProfileActivity profileActivity, int i10) {
        this.f34894a = i10;
        this.f34895b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34894a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    vh.n nVar = c9Var.f20106a;
                    ProfileActivity profileActivity = this.f34895b;
                    nVar.setLoading(profileActivity.f31587i5);
                    c9Var.f20107b.setLoading(profileActivity.f31587i5);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f34895b;
                profileActivity2.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity2.showDialog(new org.telegram.ui.Components.uv(profileActivity2, profileActivity2.getParentActivity(), profileActivity2.f31697z0, arrayList));
                return;
            case 2:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity3 = this.f34895b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view2).setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, profileActivity3.f31697z0));
                } else if (view2 instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view2).e();
                } else if (view2 instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view2).v();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.h6.P1.linkColor = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, ((org.telegram.ui.Cells.j) view2).I);
                } else if (view2 instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof hg.k1) {
                    hg.k1 k1Var = (hg.k1) view2;
                    org.telegram.ui.Components.fq fqVar = k1Var.f10321r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.h6.f19260o6;
                    org.telegram.ui.ActionBar.d6 d6Var = k1Var.f10316a;
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.h6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.h6.l1(0.22f, v03);
                    fqVar.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                    k1Var.a(v04);
                    fqVar.setTextColor(v04);
                } else if (view2 instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view2).e();
                }
                q01 q01Var = profileActivity3.d;
                profileActivity3.f31523a.getClass();
                RecyclerView.R(view2);
                q01Var.getClass();
                profileActivity3.d.getClass();
                return;
            default:
                ProfileActivity.e0(this.f34895b, (Boolean) obj);
                return;
        }
    }
}
