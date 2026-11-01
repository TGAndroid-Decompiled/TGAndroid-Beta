package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hr0 extends s4.m0 {
    public final br0 f26909a;

    public hr0(br0 br0Var) {
        this.f26909a = br0Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            br0 br0Var = this.f26909a;
            br0Var.f30719n.getClass();
            int R = RecyclerView.R(s7Var);
            int i10 = br0Var.f30720r.J;
            boolean z12 = true;
            if (R < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            s7Var.f23019a0 = z10;
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
