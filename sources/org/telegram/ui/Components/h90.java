package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class h90 extends v4.n0 {
    public final i90 f35201a;

    public h90(i90 i90Var) {
        this.f35201a = i90Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int R;
        int i7 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.o0 layoutManager = recyclerView.getLayoutManager();
        j90 j90Var = this.f35201a.j3;
        if (layoutManager == j90Var.d && (R = RecyclerView.R(view)) != 0 && !j90Var.f35923f.N()) {
            if (j90Var.f35923f.I() == null && j90Var.f35923f.V == null) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            } else if (R != 0) {
                R--;
                c90 c90Var = j90Var.d;
                c90Var.B1();
                if (R > c90Var.U) {
                    rect.top = org.telegram.messenger.g0.L(2.0f);
                }
            } else {
                return;
            }
            if (!j90Var.d.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        }
    }
}
