package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nv0 implements org.telegram.messenger.r20 {
    public final int f39977a;
    public final ProfileActivity f39978b;

    public nv0(ProfileActivity profileActivity, int i10) {
        this.f39977a = i10;
        this.f39978b = profileActivity;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f39977a;
        ProfileActivity profileActivity = this.f39978b;
        switch (i10) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.S6;
                if (view instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    z8Var.f23649a.setLoading(profileActivity.f33843i5);
                    z8Var.f23650b.setLoading(profileActivity.f33843i5);
                    return;
                }
                return;
            case 1:
                ProfileActivity.q0(profileActivity, (Boolean) obj);
                return;
            case 2:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.cv(profileActivity, profileActivity.getParentActivity(), profileActivity.f33957z0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.S6;
                if (view2 instanceof org.telegram.ui.Cells.p4) {
                    ((org.telegram.ui.Cells.p4) view2).setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L6, profileActivity.f33957z0));
                } else if (view2 instanceof org.telegram.ui.Cells.z8) {
                    ((org.telegram.ui.Cells.z8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.i) {
                    ((org.telegram.ui.Cells.i) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.l5) {
                    ((org.telegram.ui.Cells.l5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof ag.k2) {
                    ag.k2 k2Var = (ag.k2) view2;
                    org.telegram.ui.Components.tp tpVar = k2Var.f609r;
                    int L = org.telegram.messenger.i0.L(8.0f);
                    int i11 = org.telegram.ui.ActionBar.t6.f21135o6;
                    org.telegram.ui.ActionBar.p6 p6Var = k2Var.f604a;
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
                    k2Var.a(w02);
                    int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
                    k2Var.a(w03);
                    int r13 = org.telegram.ui.ActionBar.t6.r1(0.22f, w03);
                    tpVar.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, r12, r13, r13));
                    int w04 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
                    k2Var.a(w04);
                    tpVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.j6) {
                    ((org.telegram.ui.Cells.j6) view2).updateColors();
                }
                wx0 wx0Var = profileActivity.d;
                profileActivity.f33779a.getClass();
                wx0Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                return;
        }
    }
}
