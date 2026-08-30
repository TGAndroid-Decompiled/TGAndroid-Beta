package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class zr0 extends f2.u0 {
    public final tr0 f31435a;

    public zr0(tr0 tr0Var) {
        this.f31435a = tr0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        boolean z4;
        boolean z10;
        if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            tr0 tr0Var = this.f31435a;
            tr0Var.f28242r.getClass();
            int R = RecyclerView.R(r7Var);
            int i10 = tr0Var.f28243s.J;
            boolean z11 = true;
            if (R < i10) {
                z4 = true;
            } else {
                z4 = false;
            }
            r7Var.U = z4;
            int i11 = R % i10;
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r7Var.S = z10;
            if (i11 != i10 - 1) {
                z11 = false;
            }
            r7Var.T = z11;
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
