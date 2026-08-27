package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class ir0 extends f2.w0 {

    public final br0 f29476a;

    public final hu0 f29477b;

    public ir0(hu0 hu0Var, br0 br0Var) {
        this.f29477b = hu0Var;
        this.f29476a = br0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        br0 br0Var = this.f29476a;
        if (br0Var.h.getAdapter() == this.f29477b.K) {
            recyclerView.getClass();
            int iR = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            cr0 cr0Var = br0Var.f35343x;
            cr0Var.B1();
            if (iR <= cr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = br0Var.f35343x.E1(iR) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        br0Var.h.getClass();
        int iR2 = RecyclerView.R(o7Var);
        int i10 = br0Var.f35343x.J;
        o7Var.T = iR2 < i10;
        int i11 = iR2 % i10;
        o7Var.R = i11 == 0;
        o7Var.S = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
