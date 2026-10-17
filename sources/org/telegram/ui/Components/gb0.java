package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class gb0 extends s4.m0 {
    public final hb0 f26538a;

    public gb0(hb0 hb0Var) {
        this.f26538a = hb0Var;
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
        ib0 ib0Var = this.f26538a.Z2;
        if (layoutManager == ib0Var.d && (R = RecyclerView.R(view)) != 0 && !ib0Var.f27171f.N()) {
            if (ib0Var.f27171f.I() == null && ib0Var.f27171f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                bb0 bb0Var = ib0Var.d;
                bb0Var.B1();
                if (R > bb0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!ib0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
