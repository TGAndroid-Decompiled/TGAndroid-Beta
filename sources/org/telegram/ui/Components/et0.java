package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class et0 extends s4.o0 {
    public final xs0 f26166a;
    public final bw0 f26167b;

    public et0(bw0 bw0Var, xs0 xs0Var) {
        this.f26167b = bw0Var;
        this.f26166a = xs0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        boolean z10;
        boolean z11;
        xs0 xs0Var = this.f26166a;
        int i10 = 0;
        if (xs0Var.h.getAdapter() == this.f26167b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ys0 ys0Var = xs0Var.f31628x;
            ys0Var.B1();
            if (R <= ys0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!xs0Var.f31628x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            xs0Var.h.getClass();
            int R2 = RecyclerView.R(t7Var);
            int i11 = xs0Var.f31628x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f23062a0 = z10;
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
