package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class hb0 extends s4.m0 {
    public final ib0 f26879a;

    public hb0(ib0 ib0Var) {
        this.f26879a = ib0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        jb0 jb0Var = this.f26879a.f27277c3;
        if (layoutManager == jb0Var.d && (R = RecyclerView.R(view)) != 0 && !jb0Var.f27655f.N()) {
            if (jb0Var.f27655f.I() == null && jb0Var.f27655f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                cb0 cb0Var = jb0Var.d;
                cb0Var.B1();
                if (R > cb0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!jb0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
