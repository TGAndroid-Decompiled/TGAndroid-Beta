package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gt0 extends s4.n0 {
    public final at0 f28712a;

    public gt0(at0 at0Var) {
        this.f28712a = at0Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.w7) {
            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
            at0 at0Var = this.f28712a;
            at0Var.f33157n.getClass();
            int R = RecyclerView.R(w7Var);
            int i10 = at0Var.f33158r.J;
            boolean z12 = true;
            if (R < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            w7Var.f25633a0 = z10;
            int i11 = R % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            w7Var.V = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            w7Var.W = z12;
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
