package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hq0 extends v4.m0 {
    public final aq0 f34365a;
    public final zs0 f34366b;

    public hq0(zs0 zs0Var, aq0 aq0Var) {
        this.f34366b = zs0Var;
        this.f34365a = aq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        boolean z9;
        boolean z10;
        aq0 aq0Var = this.f34365a;
        int i7 = 0;
        if (aq0Var.h.getAdapter() == this.f34366b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            bq0 bq0Var = aq0Var.f38796x;
            bq0Var.B1();
            if (R <= bq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            if (!aq0Var.f38796x.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            aq0Var.h.getClass();
            int R2 = RecyclerView.R(o7Var);
            int i10 = aq0Var.f38796x.J;
            boolean z11 = true;
            if (R2 < i10) {
                z9 = true;
            } else {
                z9 = false;
            }
            o7Var.f29665a0 = z9;
            int i11 = R2 % i10;
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o7Var.V = z10;
            if (i11 != i10 - 1) {
                z11 = false;
            }
            o7Var.W = z11;
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
