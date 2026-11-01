package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ir0 extends s4.m0 {
    public final br0 f27159a;
    public final au0 f27160b;

    public ir0(au0 au0Var, br0 br0Var) {
        this.f27160b = au0Var;
        this.f27159a = br0Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        br0 br0Var = this.f27159a;
        int i10 = 0;
        if (br0Var.h.getAdapter() == this.f27160b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            cr0 cr0Var = br0Var.f30723x;
            cr0Var.B1();
            if (R <= cr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.i0.L(2.0f);
            }
            if (!br0Var.f30723x.E1(R)) {
                i10 = org.telegram.messenger.i0.L(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            br0Var.h.getClass();
            int R2 = RecyclerView.R(s7Var);
            int i11 = br0Var.f30723x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            s7Var.f23019a0 = z10;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            s7Var.V = z11;
            if (i12 != i11 - 1) {
                z12 = false;
            }
            s7Var.W = z12;
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        }
    }
}
