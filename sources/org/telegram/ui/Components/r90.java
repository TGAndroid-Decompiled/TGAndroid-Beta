package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class r90 extends v4.o0 {
    public final s90 f39074a;

    public r90(s90 s90Var) {
        this.f39074a = s90Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R;
        int i7 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.p0 layoutManager = recyclerView.getLayoutManager();
        t90 t90Var = this.f39074a.j3;
        if (layoutManager == t90Var.d && (R = RecyclerView.R(view)) != 0 && !t90Var.f39949f.N()) {
            if (t90Var.f39949f.I() == null && t90Var.f39949f.V == null) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            } else if (R != 0) {
                R--;
                m90 m90Var = t90Var.d;
                m90Var.B1();
                if (R > m90Var.U) {
                    rect.top = org.telegram.messenger.g0.L(2.0f);
                }
            } else {
                return;
            }
            if (!t90Var.d.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        }
    }
}
