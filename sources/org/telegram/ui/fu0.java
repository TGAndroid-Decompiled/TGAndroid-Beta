package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fu0 implements org.telegram.messenger.w10 {
    public final int f47984a;
    public final ProfileActivity f47985b;

    public fu0(ProfileActivity profileActivity, int i7) {
        this.f47984a = i7;
        this.f47985b = profileActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f47984a;
        ProfileActivity profileActivity = this.f47985b;
        switch (i7) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.Z6;
                if (view instanceof org.telegram.ui.Cells.x8) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    x8Var.f32430a.setLoading(profileActivity.f43737o5);
                    x8Var.f32431b.setLoading(profileActivity.f43737o5);
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
                profileActivity.showDialog(new org.telegram.ui.Components.bv(profileActivity, profileActivity.getParentActivity(), profileActivity.A0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.Z6;
                if (view2 instanceof org.telegram.ui.Cells.o4) {
                    ((org.telegram.ui.Cells.o4) view2).setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.L6, profileActivity.A0));
                } else if (view2 instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.m8) {
                    ((org.telegram.ui.Cells.m8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof kg.i1) {
                    kg.i1 i1Var = (kg.i1) view2;
                    org.telegram.ui.Components.aq aqVar = i1Var.f18441r;
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i10 = org.telegram.ui.ActionBar.n6.f29651o6;
                    org.telegram.ui.ActionBar.i6 i6Var = i1Var.f18435a;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
                    i1Var.a(w02);
                    int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
                    i1Var.a(w03);
                    int r13 = org.telegram.ui.ActionBar.n6.r1(0.22f, w03);
                    aqVar.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, r12, r13, r13));
                    int w04 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
                    i1Var.a(w04);
                    aqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.f6) {
                    ((org.telegram.ui.Cells.f6) view2).updateColors();
                }
                jw0 jw0Var = profileActivity.d;
                profileActivity.f43634a.getClass();
                jw0Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                return;
        }
    }
}
