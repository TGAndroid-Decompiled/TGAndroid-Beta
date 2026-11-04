package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class kv extends u4.n0 {
    public final ey f35492a;

    public kv(ey eyVar) {
        this.f35492a = eyVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int R = RecyclerView.R(view);
        ey eyVar = this.f35492a;
        u4.h0 adapter = eyVar.f33545i0.getAdapter();
        jx jxVar = eyVar.f33561o0;
        int i3 = 0;
        if (adapter == jxVar && R == jxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            jxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        kx kxVar = eyVar.f33548j0;
        jxVar.getClass();
        if (!kxVar.E1(R)) {
            i3 = org.telegram.messenger.g0.L(2.0f);
        }
        rect.right = i3;
    }
}
