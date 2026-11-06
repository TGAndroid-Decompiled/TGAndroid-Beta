package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class lv extends v4.m0 {
    public final gy f35745a;

    public lv(gy gyVar) {
        this.f35745a = gyVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R = RecyclerView.R(view);
        gy gyVar = this.f35745a;
        v4.g0 adapter = gyVar.f34091h0.getAdapter();
        lx lxVar = gyVar.f34108n0;
        int i7 = 0;
        if (adapter == lxVar && R == lxVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            lxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        mx mxVar = gyVar.f34094i0;
        lxVar.getClass();
        if (!mxVar.E1(R)) {
            i7 = org.telegram.messenger.g0.L(2.0f);
        }
        rect.right = i7;
    }
}
