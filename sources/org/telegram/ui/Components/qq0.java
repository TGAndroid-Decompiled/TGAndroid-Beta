package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qq0 extends v4.o0 {
    public final jq0 f38980a;
    public final it0 f38981b;

    public qq0(it0 it0Var, jq0 jq0Var) {
        this.f38981b = it0Var;
        this.f38980a = jq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        boolean z10;
        boolean z11;
        jq0 jq0Var = this.f38980a;
        int i7 = 0;
        if (jq0Var.h.getAdapter() == this.f38981b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            kq0 kq0Var = jq0Var.f34450x;
            kq0Var.B1();
            if (R <= kq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            if (!jq0Var.f34450x.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            jq0Var.h.getClass();
            int R2 = RecyclerView.R(o7Var);
            int i10 = jq0Var.f34450x.J;
            boolean z12 = true;
            if (R2 < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            o7Var.f31262b0 = z10;
            int i11 = R2 % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            o7Var.W = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            o7Var.f31260a0 = z12;
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
