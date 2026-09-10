package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class va0 extends s4.n0 {
    public final wa0 f27906a;

    public va0(wa0 wa0Var) {
        this.f27906a = wa0Var;
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
        xa0 xa0Var = this.f27906a.f28745b3;
        if (layoutManager == xa0Var.d && (R = RecyclerView.R(view)) != 0 && !xa0Var.f28992f.N()) {
            if (xa0Var.f28992f.I() == null && xa0Var.f28992f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                qa0 qa0Var = xa0Var.d;
                qa0Var.B1();
                if (R > qa0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!xa0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
