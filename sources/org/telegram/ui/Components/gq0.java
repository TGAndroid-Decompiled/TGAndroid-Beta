package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gq0 extends u4.n0 {
    public final zp0 f34178a;
    public final ws0 f34179b;

    public gq0(ws0 ws0Var, zp0 zp0Var) {
        this.f34179b = ws0Var;
        this.f34178a = zp0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        boolean z10;
        boolean z11;
        zp0 zp0Var = this.f34178a;
        int i3 = 0;
        if (zp0Var.h.getAdapter() == this.f34179b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            aq0 aq0Var = zp0Var.f37791x;
            aq0Var.B1();
            if (R <= aq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            if (!zp0Var.f37791x.E1(R)) {
                i3 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i3;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            zp0Var.h.getClass();
            int R2 = RecyclerView.R(n7Var);
            int i10 = zp0Var.f37791x.J;
            boolean z12 = true;
            if (R2 < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            n7Var.f29682b0 = z10;
            int i11 = R2 % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            n7Var.W = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            n7Var.f29680a0 = z12;
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        }
    }
}
