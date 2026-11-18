package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class pq0 extends v4.o0 {
    public final iq0 f38526a;
    public final gt0 f38527b;

    public pq0(gt0 gt0Var, iq0 iq0Var) {
        this.f38527b = gt0Var;
        this.f38526a = iq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        boolean z10;
        boolean z11;
        iq0 iq0Var = this.f38526a;
        int i7 = 0;
        if (iq0Var.h.getAdapter() == this.f38527b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            jq0 jq0Var = iq0Var.f33775x;
            jq0Var.B1();
            if (R <= jq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            if (!iq0Var.f33775x.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        } else if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            iq0Var.h.getClass();
            int R2 = RecyclerView.R(p7Var);
            int i10 = iq0Var.f33775x.J;
            boolean z12 = true;
            if (R2 < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7Var.f31225b0 = z10;
            int i11 = R2 % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            p7Var.W = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            p7Var.f31223a0 = z12;
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
