package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class zv extends v4.o0 {
    public final ty f42995a;

    public zv(ty tyVar) {
        this.f42995a = tyVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int R = RecyclerView.R(view);
        ty tyVar = this.f42995a;
        v4.i0 adapter = tyVar.f40107i0.getAdapter();
        xx xxVar = tyVar.f40123o0;
        int i7 = 0;
        if (adapter == xxVar && R == xxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            xxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        yx yxVar = tyVar.f40110j0;
        xxVar.getClass();
        if (!yxVar.E1(R)) {
            i7 = org.telegram.messenger.g0.L(2.0f);
        }
        rect.right = i7;
    }
}
