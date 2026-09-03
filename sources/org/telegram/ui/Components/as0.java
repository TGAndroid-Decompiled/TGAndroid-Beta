package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class as0 extends f2.v0 {
    public final tr0 f25360a;
    public final yu0 f25361b;

    public as0(yu0 yu0Var, tr0 tr0Var) {
        this.f25361b = yu0Var;
        this.f25360a = tr0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        boolean z4;
        boolean z10;
        tr0 tr0Var = this.f25360a;
        int i10 = 0;
        if (tr0Var.h.getAdapter() == this.f25361b.L) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ur0 ur0Var = tr0Var.f30525x;
            ur0Var.B1();
            if (R <= ur0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!tr0Var.f30525x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            tr0Var.h.getClass();
            int R2 = RecyclerView.R(r7Var);
            int i11 = tr0Var.f30525x.J;
            boolean z11 = true;
            if (R2 < i11) {
                z4 = true;
            } else {
                z4 = false;
            }
            r7Var.U = z4;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r7Var.S = z10;
            if (i12 != i11 - 1) {
                z11 = false;
            }
            r7Var.T = z11;
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
