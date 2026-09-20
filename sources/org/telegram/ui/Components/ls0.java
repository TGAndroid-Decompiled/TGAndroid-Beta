package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ls0 extends s4.n0 {
    public final fs0 f26230a;

    public ls0(fs0 fs0Var) {
        this.f26230a = fs0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            fs0 fs0Var = this.f26230a;
            fs0Var.f23407r.getClass();
            int S = RecyclerView.S(u7Var);
            int i10 = fs0Var.f23408s.J;
            boolean z12 = true;
            if (S < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            u7Var.f21620a0 = z10;
            int i11 = S % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u7Var.V = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            u7Var.W = z12;
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
