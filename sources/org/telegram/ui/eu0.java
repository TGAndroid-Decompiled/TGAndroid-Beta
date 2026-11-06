package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class eu0 implements org.telegram.messenger.c20 {
    public final int f45407a;
    public final ProfileActivity f45408b;

    public eu0(ProfileActivity profileActivity, int i7) {
        this.f45407a = i7;
        this.f45408b = profileActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f45407a;
        ProfileActivity profileActivity = this.f45408b;
        switch (i7) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.S6;
                if (view instanceof org.telegram.ui.Cells.x8) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    x8Var.f30899a.setLoading(profileActivity.f41728i5);
                    x8Var.f30900b.setLoading(profileActivity.f41728i5);
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
                profileActivity.showDialog(new org.telegram.ui.Components.qu(profileActivity, profileActivity.getParentActivity(), profileActivity.f41841z0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.S6;
                if (view2 instanceof org.telegram.ui.Cells.n4) {
                    ((org.telegram.ui.Cells.n4) view2).setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, profileActivity.f41841z0));
                } else if (view2 instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.m8) {
                    ((org.telegram.ui.Cells.m8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.h5) {
                    ((org.telegram.ui.Cells.h5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof kg.f1) {
                    kg.f1 f1Var = (kg.f1) view2;
                    org.telegram.ui.Components.mp mpVar = f1Var.f17374r;
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i10 = org.telegram.ui.ActionBar.k6.f28048o6;
                    org.telegram.ui.ActionBar.f6 f6Var = f1Var.f17368a;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
                    f1Var.a(w02);
                    int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
                    f1Var.a(w03);
                    int r13 = org.telegram.ui.ActionBar.k6.r1(0.22f, w03);
                    mpVar.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, r12, r13, r13));
                    int w04 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
                    f1Var.a(w04);
                    mpVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.f6) {
                    ((org.telegram.ui.Cells.f6) view2).updateColors();
                }
                jw0 jw0Var = profileActivity.d;
                profileActivity.f41663a.getClass();
                jw0Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                return;
        }
    }
}
