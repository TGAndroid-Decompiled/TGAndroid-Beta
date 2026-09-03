package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class as0 extends f2.u0 {
    public final tr0 f23480a;
    public final yu0 f23481b;

    public as0(yu0 yu0Var, tr0 tr0Var) {
        this.f23481b = yu0Var;
        this.f23480a = tr0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        boolean z4;
        boolean z10;
        tr0 tr0Var = this.f23480a;
        int i10 = 0;
        if (tr0Var.h.getAdapter() == this.f23481b.L) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ur0 ur0Var = tr0Var.f28264x;
            ur0Var.B1();
            if (R <= ur0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!tr0Var.f28264x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.q7) {
            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
            tr0Var.h.getClass();
            int R2 = RecyclerView.R(q7Var);
            int i11 = tr0Var.f28264x.J;
            boolean z11 = true;
            if (R2 < i11) {
                z4 = true;
            } else {
                z4 = false;
            }
            q7Var.U = z4;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q7Var.S = z10;
            if (i12 != i11 - 1) {
                z11 = false;
            }
            q7Var.T = z11;
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
