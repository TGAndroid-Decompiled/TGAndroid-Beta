package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qq0 extends v4.o0 {
    public final kq0 f38977a;

    public qq0(kq0 kq0Var) {
        this.f38977a = kq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        boolean z10;
        boolean z11;
        if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            kq0 kq0Var = this.f38977a;
            kq0Var.f34561n.getClass();
            int R = RecyclerView.R(p7Var);
            int i7 = kq0Var.f34562r.J;
            boolean z12 = true;
            if (R < i7) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7Var.f31256b0 = z10;
            int i10 = R % i7;
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            p7Var.W = z11;
            if (i10 != i7 - 1) {
                z12 = false;
            }
            p7Var.f31254a0 = z12;
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
