package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class os0 extends s4.n0 {
    public final hs0 f27185a;
    public final lv0 f27186b;

    public os0(lv0 lv0Var, hs0 hs0Var) {
        this.f27186b = lv0Var;
        this.f27185a = hs0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        hs0 hs0Var = this.f27185a;
        int i10 = 0;
        if (hs0Var.h.getAdapter() == this.f27186b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            is0 is0Var = hs0Var.f24072x;
            is0Var.B1();
            if (R <= is0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!hs0Var.f24072x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            hs0Var.h.getClass();
            int R2 = RecyclerView.R(t7Var);
            int i11 = hs0Var.f24072x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f21211a0 = z10;
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
