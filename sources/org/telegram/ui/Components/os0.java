package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class os0 extends s4.n0 {
    public final is0 f27171a;

    public os0(is0 is0Var) {
        this.f27171a = is0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            is0 is0Var = this.f27171a;
            is0Var.f24356r.getClass();
            int R = RecyclerView.R(t7Var);
            int i10 = is0Var.f24357s.J;
            boolean z12 = true;
            if (R < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f21233a0 = z10;
            int i11 = R % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            t7Var.V = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            t7Var.W = z12;
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
