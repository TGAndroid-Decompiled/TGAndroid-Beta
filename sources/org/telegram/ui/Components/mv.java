package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class mv extends v4.m0 {
    public final hy f36149a;

    public mv(hy hyVar) {
        this.f36149a = hyVar;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R = RecyclerView.R(view);
        hy hyVar = this.f36149a;
        v4.g0 adapter = hyVar.f34430h0.getAdapter();
        mx mxVar = hyVar.f34447n0;
        int i7 = 0;
        if (adapter == mxVar && R == mxVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            mxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.g0.L(2.0f);
        nx nxVar = hyVar.f34433i0;
        mxVar.getClass();
        if (!nxVar.E1(R)) {
            i7 = org.telegram.messenger.g0.L(2.0f);
        }
        rect.right = i7;
    }
}
