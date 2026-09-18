package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class bs0 extends s4.n0 {
    public final vr0 f22799a;

    public bs0(vr0 vr0Var) {
        this.f22799a = vr0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            vr0 vr0Var = this.f22799a;
            vr0Var.f27925r.getClass();
            int S = RecyclerView.S(t7Var);
            int i10 = vr0Var.f27926s.J;
            boolean z12 = true;
            if (S < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f21383a0 = z10;
            int i11 = S % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            t7Var.V = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            t7Var.W = z12;
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
