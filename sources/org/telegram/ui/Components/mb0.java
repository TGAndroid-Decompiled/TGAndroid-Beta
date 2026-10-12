package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class mb0 extends s4.m0 {
    public final nb0 f27352a;

    public mb0(nb0 nb0Var) {
        this.f27352a = nb0Var;
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
        ob0 ob0Var = this.f27352a.Z2;
        if (layoutManager == ob0Var.d && (R = RecyclerView.R(view)) != 0 && !ob0Var.f27929f.N()) {
            if (ob0Var.f27929f.I() == null && ob0Var.f27929f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                hb0 hb0Var = ob0Var.d;
                hb0Var.B1();
                if (R > hb0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!ob0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
