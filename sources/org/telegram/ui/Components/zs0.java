package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 extends s4.m0 {
    public final ss0 f33351a;
    public final wv0 f33352b;

    public zs0(wv0 wv0Var, ss0 ss0Var) {
        this.f33352b = wv0Var;
        this.f33351a = ss0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        boolean z10;
        boolean z11;
        ss0 ss0Var = this.f33351a;
        int i10 = 0;
        if (ss0Var.h.getAdapter() == this.f33352b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ts0 ts0Var = ss0Var.f29680x;
            ts0Var.B1();
            if (R <= ts0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!ss0Var.f29680x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            ss0Var.h.getClass();
            int R2 = RecyclerView.R(s7Var);
            int i11 = ss0Var.f29680x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            s7Var.f23261a0 = z10;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            s7Var.V = z11;
            if (i12 != i11 - 1) {
                z12 = false;
            }
            s7Var.W = z12;
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
