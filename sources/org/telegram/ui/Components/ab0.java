package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ab0 extends s4.n0 {
    public final bb0 f22608a;

    public ab0(bb0 bb0Var) {
        this.f22608a = bb0Var;
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
        cb0 cb0Var = this.f22608a.f22916i3;
        if (layoutManager == cb0Var.d && (R = RecyclerView.R(view)) != 0 && !cb0Var.f23250f.N()) {
            if (cb0Var.f23250f.I() == null && cb0Var.f23250f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                va0 va0Var = cb0Var.d;
                va0Var.B1();
                if (R > va0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!cb0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
