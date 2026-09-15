package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class la0 extends s4.n0 {
    public final ma0 f25900a;

    public la0(ma0 ma0Var) {
        this.f25900a = ma0Var;
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
        na0 na0Var = this.f25900a.f26136b3;
        if (layoutManager == na0Var.d && (R = RecyclerView.R(view)) != 0 && !na0Var.f26425f.N()) {
            if (na0Var.f26425f.I() == null && na0Var.f26425f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ga0 ga0Var = na0Var.d;
                ga0Var.B1();
                if (R > ga0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!na0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
