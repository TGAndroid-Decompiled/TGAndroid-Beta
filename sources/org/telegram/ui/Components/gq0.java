package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gq0 extends v4.m0 {
    public final aq0 f34041a;

    public gq0(aq0 aq0Var) {
        this.f34041a = aq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        boolean z9;
        boolean z10;
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            aq0 aq0Var = this.f34041a;
            aq0Var.f38792n.getClass();
            int R = RecyclerView.R(o7Var);
            int i7 = aq0Var.f38793r.J;
            boolean z11 = true;
            if (R < i7) {
                z9 = true;
            } else {
                z9 = false;
            }
            o7Var.f29665a0 = z9;
            int i10 = R % i7;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o7Var.V = z10;
            if (i10 != i7 - 1) {
                z11 = false;
            }
            o7Var.W = z11;
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
