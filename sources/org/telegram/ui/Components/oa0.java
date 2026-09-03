package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class oa0 extends f2.u0 {
    public final pa0 f27507a;

    public oa0(pa0 pa0Var) {
        this.f27507a = pa0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.v0 layoutManager = recyclerView.getLayoutManager();
        qa0 qa0Var = this.f27507a.Y2;
        if (layoutManager == qa0Var.d && (R = RecyclerView.R(view)) != 0 && !qa0Var.f28129f.N()) {
            if (qa0Var.f28129f.I() == null && qa0Var.f28129f.R == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ja0 ja0Var = qa0Var.d;
                ja0Var.B1();
                if (R > ja0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!qa0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
