package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nb0 extends s4.o0 {
    public final ob0 f29138a;

    public nb0(ob0 ob0Var) {
        this.f29138a = ob0Var;
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
        pb0 pb0Var = this.f29138a.Z2;
        if (layoutManager == pb0Var.d && (R = RecyclerView.R(view)) != 0 && !pb0Var.f29830f.N()) {
            if (pb0Var.f29830f.I() == null && pb0Var.f29830f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ib0 ib0Var = pb0Var.d;
                ib0Var.B1();
                if (R > ib0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!pb0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
