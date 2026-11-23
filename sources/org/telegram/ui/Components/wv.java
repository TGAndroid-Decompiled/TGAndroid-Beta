package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class wv extends v4.o0 {
    public final qy f41739a;

    public wv(qy qyVar) {
        this.f41739a = qyVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R = RecyclerView.R(view);
        qy qyVar = this.f41739a;
        v4.i0 adapter = qyVar.f39062i0.getAdapter();
        ux uxVar = qyVar.f39078o0;
        int i7 = 0;
        if (adapter == uxVar && R == uxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            uxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        vx vxVar = qyVar.f39065j0;
        uxVar.getClass();
        if (!vxVar.E1(R)) {
            i7 = org.telegram.messenger.g0.L(2.0f);
        }
        rect.right = i7;
    }
}
