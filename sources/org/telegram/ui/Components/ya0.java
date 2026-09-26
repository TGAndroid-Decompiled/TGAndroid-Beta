package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ya0 extends s4.n0 {
    public final za0 f30614a;

    public ya0(za0 za0Var) {
        this.f30614a = za0Var;
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
        ab0 ab0Var = this.f30614a.f30860b3;
        if (layoutManager == ab0Var.d && (R = RecyclerView.R(view)) != 0 && !ab0Var.f22593f.N()) {
            if (ab0Var.f22593f.I() == null && ab0Var.f22593f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                ta0 ta0Var = ab0Var.d;
                ta0Var.B1();
                if (R > ta0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!ab0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
