package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hr0 extends s4.m0 {
    public final ar0 f26803a;
    public final zt0 f26804b;

    public hr0(zt0 zt0Var, ar0 ar0Var) {
        this.f26804b = zt0Var;
        this.f26803a = ar0Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        ar0 ar0Var = this.f26803a;
        int i10 = 0;
        if (ar0Var.h.getAdapter() == this.f26804b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            br0 br0Var = ar0Var.f30356x;
            br0Var.B1();
            if (R <= br0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.i0.L(2.0f);
            }
            if (!ar0Var.f30356x.E1(R)) {
                i10 = org.telegram.messenger.i0.L(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            ar0Var.h.getClass();
            int R2 = RecyclerView.R(s7Var);
            int i11 = ar0Var.f30356x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            s7Var.f23018a0 = z10;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            s7Var.V = z11;
            if (i12 != i11 - 1) {
                z12 = false;
            }
            s7Var.W = z12;
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
