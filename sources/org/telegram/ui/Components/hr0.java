package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class hr0 extends f2.w0 {

    public final br0 f29092a;

    public hr0(br0 br0Var) {
        this.f29092a = br0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        br0 br0Var = this.f29092a;
        br0Var.f35340r.getClass();
        int iR = RecyclerView.R(o7Var);
        int i10 = br0Var.f35341s.J;
        o7Var.T = iR < i10;
        int i11 = iR % i10;
        o7Var.R = i11 == 0;
        o7Var.S = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
