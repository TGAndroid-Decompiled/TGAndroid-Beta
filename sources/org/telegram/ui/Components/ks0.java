package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ks0 extends s4.n0 {
    public final ds0 f24809a;
    public final iv0 f24810b;

    public ks0(iv0 iv0Var, ds0 ds0Var) {
        this.f24810b = iv0Var;
        this.f24809a = ds0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        ds0 ds0Var = this.f24809a;
        int i10 = 0;
        if (ds0Var.h.getAdapter() == this.f24810b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            es0 es0Var = ds0Var.f21598x;
            es0Var.B1();
            if (R <= es0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!ds0Var.f21598x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            ds0Var.h.getClass();
            int R2 = RecyclerView.R(u7Var);
            int i11 = ds0Var.f21598x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            u7Var.f20494a0 = z10;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u7Var.V = z11;
            if (i12 != i11 - 1) {
                z12 = false;
            }
            u7Var.W = z12;
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
