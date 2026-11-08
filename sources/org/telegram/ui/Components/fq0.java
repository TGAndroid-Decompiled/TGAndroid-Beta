package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class fq0 extends v4.m0 {
    public final zp0 f33636a;

    public fq0(zp0 zp0Var) {
        this.f33636a = zp0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        boolean z9;
        boolean z10;
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            zp0 zp0Var = this.f33636a;
            zp0Var.f38126n.getClass();
            int R = RecyclerView.R(o7Var);
            int i7 = zp0Var.f38127r.J;
            boolean z11 = true;
            if (R < i7) {
                z9 = true;
            } else {
                z9 = false;
            }
            o7Var.f29661a0 = z9;
            int i10 = R % i7;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o7Var.V = z10;
            if (i10 != i7 - 1) {
                z11 = false;
            }
            o7Var.W = z11;
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
