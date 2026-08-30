package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class na0 extends f2.u0 {
    public final oa0 f27228a;

    public na0(oa0 oa0Var) {
        this.f27228a = oa0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.v0 layoutManager = recyclerView.getLayoutManager();
        pa0 pa0Var = this.f27228a.Y2;
        if (layoutManager == pa0Var.d && (R = RecyclerView.R(view)) != 0 && !pa0Var.f27803f.N()) {
            if (pa0Var.f27803f.I() == null && pa0Var.f27803f.R == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ia0 ia0Var = pa0Var.d;
                ia0Var.B1();
                if (R > ia0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!pa0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
