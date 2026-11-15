package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gq0 extends v4.n0 {
    public final aq0 f35042a;

    public gq0(aq0 aq0Var) {
        this.f35042a = aq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            aq0 aq0Var = this.f35042a;
            aq0Var.f39792n.getClass();
            int R = RecyclerView.R(n7Var);
            int i7 = aq0Var.f39793r.J;
            boolean z12 = true;
            if (R < i7) {
                z10 = true;
            } else {
                z10 = false;
            }
            n7Var.f30743b0 = z10;
            int i10 = R % i7;
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            n7Var.W = z11;
            if (i10 != i7 - 1) {
                z12 = false;
            }
            n7Var.f30741a0 = z12;
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
