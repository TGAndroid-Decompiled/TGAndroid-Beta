package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class at0 extends s4.m0 {
    public final ts0 f23623a;
    public final xv0 f23624b;

    public at0(xv0 xv0Var, ts0 ts0Var) {
        this.f23624b = xv0Var;
        this.f23623a = ts0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        boolean z10;
        boolean z11;
        ts0 ts0Var = this.f23623a;
        int i10 = 0;
        if (ts0Var.h.getAdapter() == this.f23624b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            us0 us0Var = ts0Var.f28683x;
            us0Var.B1();
            if (R <= us0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!ts0Var.f28683x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            ts0Var.h.getClass();
            int R2 = RecyclerView.R(t7Var);
            int i11 = ts0Var.f28683x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f22098a0 = z10;
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
