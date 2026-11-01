package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xv extends s4.m0 {
    public final vy f32639a;

    public xv(vy vyVar) {
        this.f32639a = vyVar;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R = RecyclerView.R(view);
        vy vyVar = this.f32639a;
        s4.g0 adapter = vyVar.f31958h0.getAdapter();
        zx zxVar = vyVar.f31975n0;
        int i10 = 0;
        if (adapter == zxVar && R == zxVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            zxVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = org.telegram.messenger.i0.L(2.0f);
        ay ayVar = vyVar.f31961i0;
        zxVar.getClass();
        if (!ayVar.E1(R)) {
            i10 = org.telegram.messenger.i0.L(2.0f);
        }
        rect.right = i10;
    }
}
