package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class e90 extends v4.m0 {
    public final f90 f33195a;

    public e90(f90 f90Var) {
        this.f33195a = f90Var;
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
        g90 g90Var = this.f33195a.f33508i3;
        if (layoutManager == g90Var.d && (R = RecyclerView.R(view)) != 0 && !g90Var.f33850f.N()) {
            if (g90Var.f33850f.I() == null && g90Var.f33850f.U == null) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            } else if (R != 0) {
                R--;
                z80 z80Var = g90Var.d;
                z80Var.B1();
                if (R > z80Var.U) {
                    rect.top = org.telegram.messenger.g0.L(2.0f);
                }
            } else {
                return;
            }
            if (!g90Var.d.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        }
    }
}
