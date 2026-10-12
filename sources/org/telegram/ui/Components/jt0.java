package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class jt0 extends s4.o0 {
    public final dt0 f27650a;

    public jt0(dt0 dt0Var) {
        this.f27650a = dt0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.t7) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            dt0 dt0Var = this.f27650a;
            dt0Var.f24488r.getClass();
            int R = RecyclerView.R(t7Var);
            int i10 = dt0Var.f24489s.J;
            boolean z12 = true;
            if (R < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            t7Var.f22835a0 = z10;
            int i11 = R % i10;
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
