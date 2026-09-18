package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 extends s4.n0 {
    public final gs0 f26760a;
    public final kv0 f26761b;

    public ns0(kv0 kv0Var, gs0 gs0Var) {
        this.f26761b = kv0Var;
        this.f26760a = gs0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        gs0 gs0Var = this.f26760a;
        int i10 = 0;
        if (gs0Var.h.getAdapter() == this.f26761b.O) {
            recyclerView.getClass();
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            hs0 hs0Var = gs0Var.f23688x;
            hs0Var.B1();
            if (S <= hs0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!gs0Var.f23688x.E1(S)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            gs0Var.h.getClass();
            int S2 = RecyclerView.S(t7Var);
            int i11 = gs0Var.f23688x.J;
            boolean z12 = true;
            if (S2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f21175a0 = z10;
            int i12 = S2 % i11;
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
