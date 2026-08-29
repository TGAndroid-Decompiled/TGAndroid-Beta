package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rr0 extends f2.v0 {
    public final lr0 f32372a;

    public rr0(lr0 lr0Var) {
        this.f32372a = lr0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            lr0 lr0Var = this.f32372a;
            lr0Var.f29469r.getClass();
            int R = RecyclerView.R(p7Var);
            int i10 = lr0Var.f29470s.J;
            boolean z12 = true;
            if (R < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7Var.T = z10;
            int i11 = R % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            p7Var.R = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            p7Var.S = z12;
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
