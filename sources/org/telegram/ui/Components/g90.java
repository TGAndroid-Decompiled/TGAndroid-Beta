package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g90 extends v4.n0 {
    public final h90 f34873a;

    public g90(h90 h90Var) {
        this.f34873a = h90Var;
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
        i90 i90Var = this.f34873a.j3;
        if (layoutManager == i90Var.d && (R = RecyclerView.R(view)) != 0 && !i90Var.f35523f.N()) {
            if (i90Var.f35523f.I() == null && i90Var.f35523f.V == null) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            } else if (R != 0) {
                R--;
                b90 b90Var = i90Var.d;
                b90Var.B1();
                if (R > b90Var.U) {
                    rect.top = org.telegram.messenger.g0.L(2.0f);
                }
            } else {
                return;
            }
            if (!i90Var.d.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        }
    }
}
