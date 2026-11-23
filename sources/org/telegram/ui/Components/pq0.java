package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class pq0 extends v4.o0 {
    public final jq0 f38564a;

    public pq0(jq0 jq0Var) {
        this.f38564a = jq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            jq0 jq0Var = this.f38564a;
            jq0Var.f34446n.getClass();
            int R = RecyclerView.R(o7Var);
            int i7 = jq0Var.f34447r.J;
            boolean z12 = true;
            if (R < i7) {
                z10 = true;
            } else {
                z10 = false;
            }
            o7Var.f31262b0 = z10;
            int i10 = R % i7;
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            o7Var.W = z11;
            if (i10 != i7 - 1) {
                z12 = false;
            }
            o7Var.f31260a0 = z12;
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
