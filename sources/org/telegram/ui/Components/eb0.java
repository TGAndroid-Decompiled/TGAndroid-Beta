package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class eb0 extends s4.n0 {
    public final fb0 f27799a;

    public eb0(fb0 fb0Var) {
        this.f27799a = fb0Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        gb0 gb0Var = this.f27799a.f28144j3;
        if (layoutManager == gb0Var.d && (R = RecyclerView.R(view)) != 0 && !gb0Var.f28522f.N()) {
            if (gb0Var.f28522f.I() == null && gb0Var.f28522f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                za0 za0Var = gb0Var.d;
                za0Var.C1();
                if (R > za0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!gb0Var.d.F1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
