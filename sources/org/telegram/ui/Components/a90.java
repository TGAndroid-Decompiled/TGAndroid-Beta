package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class a90 extends u4.n0 {
    public final b90 f31773a;

    public a90(b90 b90Var) {
        this.f31773a = b90Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int R;
        int i3 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        u4.o0 layoutManager = recyclerView.getLayoutManager();
        c90 c90Var = this.f31773a.f32123j3;
        if (layoutManager == c90Var.d && (R = RecyclerView.R(view)) != 0 && !c90Var.f32614f.N()) {
            if (c90Var.f32614f.I() == null && c90Var.f32614f.V == null) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            } else if (R != 0) {
                R--;
                v80 v80Var = c90Var.d;
                v80Var.B1();
                if (R > v80Var.U) {
                    rect.top = org.telegram.messenger.g0.L(2.0f);
                }
            } else {
                return;
            }
            if (!c90Var.d.E1(R)) {
                i3 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i3;
        }
    }
}
