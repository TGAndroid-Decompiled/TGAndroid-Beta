package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iu0 implements org.telegram.messenger.c20 {
    public final int f46754a;
    public final ProfileActivity f46755b;

    public iu0(ProfileActivity profileActivity, int i7) {
        this.f46754a = i7;
        this.f46755b = profileActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f46754a;
        ProfileActivity profileActivity = this.f46755b;
        switch (i7) {
            case 0:
                View view = (View) obj;
                RectF rectF = ProfileActivity.V6;
                if (view instanceof org.telegram.ui.Cells.x8) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    x8Var.f30920a.setLoading(profileActivity.f41767k5);
                    x8Var.f30921b.setLoading(profileActivity.f41767k5);
                    return;
                }
                return;
            case 1:
                ProfileActivity.q0(profileActivity, (Boolean) obj);
                return;
            case 2:
                RectF rectF2 = ProfileActivity.V6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.qu(profileActivity, profileActivity.getParentActivity(), profileActivity.f41867z0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                RectF rectF3 = ProfileActivity.V6;
                if (view2 instanceof org.telegram.ui.Cells.n4) {
                    ((org.telegram.ui.Cells.n4) view2).setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L6, profileActivity.f41867z0));
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
                    org.telegram.ui.Components.mp mpVar = f1Var.f17377r;
                    int L = org.telegram.messenger.g0.L(8.0f);
                    int i10 = org.telegram.ui.ActionBar.m6.f28090o6;
                    org.telegram.ui.ActionBar.h6 h6Var = f1Var.f17371a;
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
                    f1Var.a(w02);
                    int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
                    f1Var.a(w03);
                    int r13 = org.telegram.ui.ActionBar.m6.r1(0.22f, w03);
                    mpVar.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13));
                    int w04 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
                    f1Var.a(w04);
                    mpVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.f6) {
                    ((org.telegram.ui.Cells.f6) view2).updateColors();
                }
                mw0 mw0Var = profileActivity.d;
                profileActivity.f41689a.getClass();
                mw0Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                return;
        }
    }
}
