package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class f90 extends v4.m0 {
    public final g90 f33609a;

    public f90(g90 g90Var) {
        this.f33609a = g90Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R;
        int i7 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.n0 layoutManager = recyclerView.getLayoutManager();
        h90 h90Var = this.f33609a.f33913i3;
        if (layoutManager == h90Var.d && (R = RecyclerView.R(view)) != 0 && !h90Var.f34250f.N()) {
            if (h90Var.f34250f.I() == null && h90Var.f34250f.U == null) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            } else if (R != 0) {
                R--;
                a90 a90Var = h90Var.d;
                a90Var.B1();
                if (R > a90Var.U) {
                    rect.top = org.telegram.messenger.g0.L(2.0f);
                }
            } else {
                return;
            }
            if (!h90Var.d.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        }
    }
}
