package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class w90 extends s4.m0 {
    public final x90 f32126a;

    public w90(x90 x90Var) {
        this.f32126a = x90Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        y90 y90Var = this.f32126a.f32451i3;
        if (layoutManager == y90Var.d && (R = RecyclerView.R(view)) != 0 && !y90Var.f32667f.N()) {
            if (y90Var.f32667f.I() == null && y90Var.f32667f.U == null) {
                rect.top = org.telegram.messenger.i0.L(2.0f);
            } else if (R != 0) {
                R--;
                r90 r90Var = y90Var.d;
                r90Var.B1();
                if (R > r90Var.U) {
                    rect.top = org.telegram.messenger.i0.L(2.0f);
                }
            } else {
                return;
            }
            if (!y90Var.d.E1(R)) {
                i10 = org.telegram.messenger.i0.L(2.0f);
            }
            rect.right = i10;
        }
    }
}
