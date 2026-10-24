package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class fb0 extends s4.m0 {
    public final gb0 f26283a;

    public fb0(gb0 gb0Var) {
        this.f26283a = gb0Var;
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
        hb0 hb0Var = this.f26283a.f26617c3;
        if (layoutManager == hb0Var.d && (R = RecyclerView.R(view)) != 0 && !hb0Var.f26995f.N()) {
            if (hb0Var.f26995f.I() == null && hb0Var.f26995f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ab0 ab0Var = hb0Var.d;
                ab0Var.B1();
                if (R > ab0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!hb0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
