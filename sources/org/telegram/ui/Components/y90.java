package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class y90 extends f2.w0 {

    public final z90 f34871a;

    public y90(z90 z90Var) {
        this.f34871a = z90Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        int iR;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.x0 layoutManager = recyclerView.getLayoutManager();
        aa0 aa0Var = this.f34871a.X2;
        if (layoutManager != aa0Var.d || (iR = RecyclerView.R(view)) == 0 || aa0Var.f26703f.N()) {
            return;
        }
        if (aa0Var.f26703f.I() == null && aa0Var.f26703f.Q == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (iR == 0) {
                return;
            }
            iR--;
            t90 t90Var = aa0Var.d;
            t90Var.B1();
            if (iR > t90Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = aa0Var.d.E1(iR) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
