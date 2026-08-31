package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bs0 extends f2.v0 {
    public final ur0 f25711a;
    public final zu0 f25712b;

    public bs0(zu0 zu0Var, ur0 ur0Var) {
        this.f25712b = zu0Var;
        this.f25711a = ur0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        boolean z4;
        boolean z10;
        ur0 ur0Var = this.f25711a;
        int i10 = 0;
        if (ur0Var.h.getAdapter() == this.f25712b.L) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            vr0 vr0Var = ur0Var.f30853x;
            vr0Var.B1();
            if (R <= vr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!ur0Var.f30853x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            ur0Var.h.getClass();
            int R2 = RecyclerView.R(r7Var);
            int i11 = ur0Var.f30853x.J;
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
