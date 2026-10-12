package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rb0 extends s4.o0 {
    public final sb0 f30138a;

    public rb0(sb0 sb0Var) {
        this.f30138a = sb0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        tb0 tb0Var = this.f30138a.Z2;
        if (layoutManager == tb0Var.d && (R = RecyclerView.R(view)) != 0 && !tb0Var.f30845f.N()) {
            if (tb0Var.f30845f.I() == null && tb0Var.f30845f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                mb0 mb0Var = tb0Var.d;
                mb0Var.B1();
                if (R > mb0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!tb0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
