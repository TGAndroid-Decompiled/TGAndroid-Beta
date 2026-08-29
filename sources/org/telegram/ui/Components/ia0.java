package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ia0 extends f2.v0 {
    public final ja0 f29362a;

    public ia0(ja0 ja0Var) {
        this.f29362a = ja0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.w0 layoutManager = recyclerView.getLayoutManager();
        ka0 ka0Var = this.f29362a.X2;
        if (layoutManager == ka0Var.d && (R = RecyclerView.R(view)) != 0 && !ka0Var.f29999f.N()) {
            if (ka0Var.f29999f.I() == null && ka0Var.f29999f.Q == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                da0 da0Var = ka0Var.d;
                da0Var.B1();
                if (R > da0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!ka0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
