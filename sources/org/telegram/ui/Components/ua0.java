package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ua0 extends s4.n0 {
    public final va0 f28672a;

    public ua0(va0 va0Var) {
        this.f28672a = va0Var;
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
        wa0 wa0Var = this.f28672a.f28973b3;
        if (layoutManager == wa0Var.d && (S = RecyclerView.S(view)) != 0 && !wa0Var.f30006f.N()) {
            if (wa0Var.f30006f.I() == null && wa0Var.f30006f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (S != 0) {
                S--;
                pa0 pa0Var = wa0Var.d;
                pa0Var.B1();
                if (S > pa0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!wa0Var.d.E1(S)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
