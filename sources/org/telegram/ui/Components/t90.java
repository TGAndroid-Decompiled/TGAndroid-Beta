package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class t90 extends v4.n0 {
    public final u90 f39760a;

    public t90(u90 u90Var) {
        this.f39760a = u90Var;
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
        v90 v90Var = this.f39760a.j3;
        if (layoutManager == v90Var.d && (R = RecyclerView.R(view)) != 0 && !v90Var.f40698f.N()) {
            if (v90Var.f40698f.I() == null && v90Var.f40698f.V == null) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            } else if (R != 0) {
                R--;
                o90 o90Var = v90Var.d;
                o90Var.B1();
                if (R > o90Var.U) {
                    rect.top = org.telegram.messenger.g0.L(2.0f);
                }
            } else {
                return;
            }
            if (!v90Var.d.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        }
    }
}
