package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class wa0 extends s4.n0 {
    public final xa0 f29991a;

    public wa0(xa0 xa0Var) {
        this.f29991a = xa0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int S;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        ya0 ya0Var = this.f29991a.f30297b3;
        if (layoutManager == ya0Var.d && (S = RecyclerView.S(view)) != 0 && !ya0Var.f30618f.N()) {
            if (ya0Var.f30618f.I() == null && ya0Var.f30618f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (S != 0) {
                S--;
                ra0 ra0Var = ya0Var.d;
                ra0Var.B1();
                if (S > ra0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!ya0Var.d.E1(S)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
