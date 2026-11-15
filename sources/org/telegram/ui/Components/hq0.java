package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hq0 extends v4.n0 {
    public final aq0 f35317a;
    public final ys0 f35318b;

    public hq0(ys0 ys0Var, aq0 aq0Var) {
        this.f35318b = ys0Var;
        this.f35317a = aq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        boolean z10;
        boolean z11;
        aq0 aq0Var = this.f35317a;
        int i7 = 0;
        if (aq0Var.h.getAdapter() == this.f35318b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            bq0 bq0Var = aq0Var.f39796x;
            bq0Var.B1();
            if (R <= bq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            if (!aq0Var.f39796x.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            aq0Var.h.getClass();
            int R2 = RecyclerView.R(n7Var);
            int i10 = aq0Var.f39796x.J;
            boolean z12 = true;
            if (R2 < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            n7Var.f30743b0 = z10;
            int i11 = R2 % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            n7Var.W = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            n7Var.f30741a0 = z12;
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
