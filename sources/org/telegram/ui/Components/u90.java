package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class u90 extends f2.y0 {
    public final v90 f32967a;

    public u90(v90 v90Var) {
        this.f32967a = v90Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        int R;
        int i9 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.z0 layoutManager = recyclerView.getLayoutManager();
        w90 w90Var = this.f32967a.X2;
        if (layoutManager == w90Var.d && (R = RecyclerView.R(view)) != 0 && !w90Var.f34159f.N()) {
            if (w90Var.f34159f.I() == null && w90Var.f34159f.Q == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                p90 p90Var = w90Var.d;
                p90Var.B1();
                if (R > p90Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!w90Var.d.E1(R)) {
                i9 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i9;
        }
    }
}
