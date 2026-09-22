package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class os0 extends s4.n0 {
    public final hs0 f27179a;
    public final lv0 f27180b;

    public os0(lv0 lv0Var, hs0 hs0Var) {
        this.f27180b = lv0Var;
        this.f27179a = hs0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        hs0 hs0Var = this.f27179a;
        int i10 = 0;
        if (hs0Var.h.getAdapter() == this.f27180b.O) {
            recyclerView.getClass();
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            is0 is0Var = hs0Var.f24046x;
            is0Var.B1();
            if (S <= is0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!hs0Var.f24046x.E1(S)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            hs0Var.h.getClass();
            int S2 = RecyclerView.S(u7Var);
            int i11 = hs0Var.f24046x.J;
            boolean z12 = true;
            if (S2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            u7Var.f21635a0 = z10;
            int i12 = S2 % i11;
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
