package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hu0 implements org.telegram.messenger.y10 {
    public final int f48499a;
    public final ProfileActivity f48500b;

    public hu0(ProfileActivity profileActivity, int i7) {
        this.f48499a = i7;
        this.f48500b = profileActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f48499a;
        ProfileActivity profileActivity = this.f48500b;
        switch (i7) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.Z6;
                if (view instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    y8Var.f32481a.setLoading(profileActivity.f43621o5);
                    y8Var.f32482b.setLoading(profileActivity.f43621o5);
                    return;
                }
                return;
            case 1:
                ProfileActivity.q0(profileActivity, (Boolean) obj);
                return;
            case 2:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.dv(profileActivity, profileActivity.getParentActivity(), profileActivity.A0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.Z6;
                if (view2 instanceof org.telegram.ui.Cells.o4) {
                    ((org.telegram.ui.Cells.o4) view2).setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L6, profileActivity.A0));
                } else if (view2 instanceof org.telegram.ui.Cells.y8) {
                    ((org.telegram.ui.Cells.y8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.n8) {
                    ((org.telegram.ui.Cells.n8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof kg.i1) {
                    kg.i1 i1Var = (kg.i1) view2;
                    org.telegram.ui.Components.dq dqVar = i1Var.f18346r;
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i10 = org.telegram.ui.ActionBar.m6.f29547o6;
                    org.telegram.ui.ActionBar.h6 h6Var = i1Var.f18340a;
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
                    i1Var.a(w02);
                    int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
                    i1Var.a(w03);
                    int r13 = org.telegram.ui.ActionBar.m6.r1(0.22f, w03);
                    dqVar.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13));
                    int w04 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
                    i1Var.a(w04);
                    dqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view2).updateColors();
                }
                lw0 lw0Var = profileActivity.d;
                profileActivity.f43518a.getClass();
                lw0Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                return;
        }
    }
}
