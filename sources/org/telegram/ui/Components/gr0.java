package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gr0 extends s4.m0 {
    public final ar0 f26504a;

    public gr0(ar0 ar0Var) {
        this.f26504a = ar0Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            ar0 ar0Var = this.f26504a;
            ar0Var.f30352n.getClass();
            int R = RecyclerView.R(s7Var);
            int i10 = ar0Var.f30353r.J;
            boolean z12 = true;
            if (R < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            s7Var.f23018a0 = z10;
            int i11 = R % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            s7Var.V = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            s7Var.W = z12;
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
