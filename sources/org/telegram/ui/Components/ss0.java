package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ss0 extends s4.n0 {
    public final ls0 f30877a;
    public final pv0 f30878b;

    public ss0(pv0 pv0Var, ls0 ls0Var) {
        this.f30878b = pv0Var;
        this.f30877a = ls0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        ls0 ls0Var = this.f30877a;
        int i10 = 0;
        if (ls0Var.h.getAdapter() == this.f30878b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ms0 ms0Var = ls0Var.f27510x;
            ms0Var.B1();
            if (R <= ms0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!ls0Var.f27510x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            ls0Var.h.getClass();
            int R2 = RecyclerView.R(t7Var);
            int i11 = ls0Var.f27510x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f23073a0 = z10;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            t7Var.V = z11;
            if (i12 != i11 - 1) {
                z12 = false;
            }
            t7Var.W = z12;
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
