package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ps0 extends s4.n0 {
    public final is0 f27471a;
    public final mv0 f27472b;

    public ps0(mv0 mv0Var, is0 is0Var) {
        this.f27472b = mv0Var;
        this.f27471a = is0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        is0 is0Var = this.f27471a;
        int i10 = 0;
        if (is0Var.h.getAdapter() == this.f27472b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            js0 js0Var = is0Var.f24359x;
            js0Var.B1();
            if (R <= js0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!is0Var.f24359x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            is0Var.h.getClass();
            int R2 = RecyclerView.R(t7Var);
            int i11 = is0Var.f24359x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f21233a0 = z10;
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
