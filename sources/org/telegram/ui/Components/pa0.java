package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class pa0 extends f2.v0 {
    public final qa0 f30027a;

    public pa0(qa0 qa0Var) {
        this.f30027a = qa0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.w0 layoutManager = recyclerView.getLayoutManager();
        ra0 ra0Var = this.f30027a.Y2;
        if (layoutManager == ra0Var.d && (R = RecyclerView.R(view)) != 0 && !ra0Var.f30710f.N()) {
            if (ra0Var.f30710f.I() == null && ra0Var.f30710f.R == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ka0 ka0Var = ra0Var.d;
                ka0Var.B1();
                if (R > ka0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!ra0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
