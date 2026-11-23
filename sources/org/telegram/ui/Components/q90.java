package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class q90 extends v4.o0 {
    public final r90 f38743a;

    public q90(r90 r90Var) {
        this.f38743a = r90Var;
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
        s90 s90Var = this.f38743a.j3;
        if (layoutManager == s90Var.d && (R = RecyclerView.R(view)) != 0 && !s90Var.f39538f.N()) {
            if (s90Var.f39538f.I() == null && s90Var.f39538f.V == null) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            } else if (R != 0) {
                R--;
                l90 l90Var = s90Var.d;
                l90Var.B1();
                if (R > l90Var.U) {
                    rect.top = org.telegram.messenger.g0.L(2.0f);
                }
            } else {
                return;
            }
            if (!s90Var.d.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        }
    }
}
