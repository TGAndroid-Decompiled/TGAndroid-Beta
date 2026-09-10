package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class js0 extends s4.n0 {
    public final ds0 f24494a;

    public js0(ds0 ds0Var) {
        this.f24494a = ds0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            ds0 ds0Var = this.f24494a;
            ds0Var.f21595r.getClass();
            int R = RecyclerView.R(u7Var);
            int i10 = ds0Var.f21596s.J;
            boolean z12 = true;
            if (R < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            u7Var.f20494a0 = z10;
            int i11 = R % i10;
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
