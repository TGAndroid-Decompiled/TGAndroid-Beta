package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gr0 extends f2.y0 {
    public final ar0 f28854a;

    public gr0(ar0 ar0Var) {
        this.f28854a = ar0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            ar0 ar0Var = this.f28854a;
            ar0Var.f34761r.getClass();
            int R = RecyclerView.R(r7Var);
            int i9 = ar0Var.f34762s.J;
            boolean z12 = true;
            if (R < i9) {
                z10 = true;
            } else {
                z10 = false;
            }
            r7Var.T = z10;
            int i10 = R % i9;
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            r7Var.R = z11;
            if (i10 != i9 - 1) {
                z12 = false;
            }
            r7Var.S = z12;
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
