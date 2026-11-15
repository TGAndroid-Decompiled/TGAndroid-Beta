package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rv extends v4.n0 {
    public final ly f39069a;

    public rv(ly lyVar) {
        this.f39069a = lyVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int R = RecyclerView.R(view);
        ly lyVar = this.f39069a;
        v4.h0 adapter = lyVar.f36956i0.getAdapter();
        qx qxVar = lyVar.f36972o0;
        int i7 = 0;
        if (adapter == qxVar && R == qxVar.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            qxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        rx rxVar = lyVar.f36959j0;
        qxVar.getClass();
        if (!rxVar.E1(R)) {
            i7 = org.telegram.messenger.g0.L(2.0f);
        }
        rect.right = i7;
    }
}
