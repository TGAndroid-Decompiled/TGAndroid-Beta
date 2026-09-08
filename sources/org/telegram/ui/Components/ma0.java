package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ma0 extends s4.n0 {
    public final na0 f28457a;

    public ma0(na0 na0Var) {
        this.f28457a = na0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        oa0 oa0Var = this.f28457a.f28749b3;
        if (layoutManager == oa0Var.d && (R = RecyclerView.R(view)) != 0 && !oa0Var.f29048f.N()) {
            if (oa0Var.f29048f.I() == null && oa0Var.f29048f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ha0 ha0Var = oa0Var.d;
                ha0Var.B1();
                if (R > ha0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!oa0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
