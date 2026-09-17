package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class cs0 extends s4.n0 {
    public final vr0 f23127a;
    public final zu0 f23128b;

    public cs0(zu0 zu0Var, vr0 vr0Var) {
        this.f23128b = zu0Var;
        this.f23127a = vr0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        vr0 vr0Var = this.f23127a;
        int i10 = 0;
        if (vr0Var.h.getAdapter() == this.f23128b.O) {
            recyclerView.getClass();
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            wr0 wr0Var = vr0Var.f27925x;
            wr0Var.B1();
            if (S <= wr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!vr0Var.f27925x.E1(S)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            vr0Var.h.getClass();
            int S2 = RecyclerView.S(t7Var);
            int i11 = vr0Var.f27925x.J;
            boolean z12 = true;
            if (S2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f21382a0 = z10;
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
