package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ta0 extends s4.n0 {
    public final ua0 f28354a;

    public ta0(ua0 ua0Var) {
        this.f28354a = ua0Var;
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
        va0 va0Var = this.f28354a.f28638b3;
        if (layoutManager == va0Var.d && (S = RecyclerView.S(view)) != 0 && !va0Var.f29048f.N()) {
            if (va0Var.f29048f.I() == null && va0Var.f29048f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (S != 0) {
                S--;
                oa0 oa0Var = va0Var.d;
                oa0Var.B1();
                if (S > oa0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!va0Var.d.E1(S)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
