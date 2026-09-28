package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class za0 extends s4.n0 {
    public final ab0 f30864a;

    public za0(ab0 ab0Var) {
        this.f30864a = ab0Var;
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
        bb0 bb0Var = this.f30864a.f22631b3;
        if (layoutManager == bb0Var.d && (R = RecyclerView.R(view)) != 0 && !bb0Var.f22936f.N()) {
            if (bb0Var.f22936f.I() == null && bb0Var.f22936f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ua0 ua0Var = bb0Var.d;
                ua0Var.B1();
                if (R > ua0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!bb0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
