package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ms0 extends s4.n0 {
    public final fs0 f26491a;
    public final jv0 f26492b;

    public ms0(jv0 jv0Var, fs0 fs0Var) {
        this.f26492b = jv0Var;
        this.f26491a = fs0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        fs0 fs0Var = this.f26491a;
        int i10 = 0;
        if (fs0Var.h.getAdapter() == this.f26492b.O) {
            recyclerView.getClass();
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            gs0 gs0Var = fs0Var.f23410x;
            gs0Var.B1();
            if (S <= gs0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!fs0Var.f23410x.E1(S)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            fs0Var.h.getClass();
            int S2 = RecyclerView.S(u7Var);
            int i11 = fs0Var.f23410x.J;
            boolean z12 = true;
            if (S2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            u7Var.f21620a0 = z10;
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
