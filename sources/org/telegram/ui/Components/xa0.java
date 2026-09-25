package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class xa0 extends s4.n0 {
    public final ya0 f30312a;

    public xa0(ya0 ya0Var) {
        this.f30312a = ya0Var;
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
        za0 za0Var = this.f30312a.f30581b3;
        if (layoutManager == za0Var.d && (R = RecyclerView.R(view)) != 0 && !za0Var.f30827f.N()) {
            if (za0Var.f30827f.I() == null && za0Var.f30827f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                sa0 sa0Var = za0Var.d;
                sa0Var.B1();
                if (R > sa0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!za0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
