package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gq0 extends v4.m0 {
    public final zp0 f33976a;
    public final xs0 f33977b;

    public gq0(xs0 xs0Var, zp0 zp0Var) {
        this.f33977b = xs0Var;
        this.f33976a = zp0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        boolean z9;
        boolean z10;
        zp0 zp0Var = this.f33976a;
        int i7 = 0;
        if (zp0Var.h.getAdapter() == this.f33977b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            aq0 aq0Var = zp0Var.f38110x;
            aq0Var.B1();
            if (R <= aq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            if (!zp0Var.f38110x.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            zp0Var.h.getClass();
            int R2 = RecyclerView.R(o7Var);
            int i10 = zp0Var.f38110x.J;
            boolean z11 = true;
            if (R2 < i10) {
                z9 = true;
            } else {
                z9 = false;
            }
            o7Var.f29657a0 = z9;
            int i11 = R2 % i10;
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o7Var.V = z10;
            if (i11 != i10 - 1) {
                z11 = false;
            }
            o7Var.W = z11;
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
