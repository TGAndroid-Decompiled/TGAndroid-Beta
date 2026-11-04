package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class fq0 extends u4.n0 {
    public final zp0 f33853a;

    public fq0(zp0 zp0Var) {
        this.f33853a = zp0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            zp0 zp0Var = this.f33853a;
            zp0Var.f37787n.getClass();
            int R = RecyclerView.R(n7Var);
            int i3 = zp0Var.f37788r.J;
            boolean z12 = true;
            if (R < i3) {
                z10 = true;
            } else {
                z10 = false;
            }
            n7Var.f29682b0 = z10;
            int i10 = R % i3;
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            n7Var.W = z11;
            if (i10 != i3 - 1) {
                z12 = false;
            }
            n7Var.f29680a0 = z12;
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
