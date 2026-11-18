package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class wv extends v4.o0 {
    public final ry f41799a;

    public wv(ry ryVar) {
        this.f41799a = ryVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R = RecyclerView.R(view);
        ry ryVar = this.f41799a;
        v4.i0 adapter = ryVar.f39360i0.getAdapter();
        vx vxVar = ryVar.f39376o0;
        int i7 = 0;
        if (adapter == vxVar && R == vxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            vxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        wx wxVar = ryVar.f39363j0;
        vxVar.getClass();
        if (!wxVar.E1(R)) {
            i7 = org.telegram.messenger.g0.L(2.0f);
        }
        rect.right = i7;
    }
}
