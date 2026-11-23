package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class oj0 extends v4.o0 implements eh.a {
    public final org.telegram.messenger.x10 f38165a;
    public final ek0 f38166b;
    public final int f38167c;
    public final boolean d;

    public oj0(ek0 ek0Var, org.telegram.messenger.x10 x10Var, int i7, boolean z10) {
        this.f38166b = ek0Var;
        this.f38165a = x10Var;
        this.f38167c = i7;
        this.d = z10;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8363a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f38166b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int b10;
        boolean z10;
        int L;
        if (((Boolean) this.f38165a.a(view)).booleanValue()) {
            int i7 = this.f38167c;
            rect.right = i7;
            rect.left = i7;
            v4.f1 T = recyclerView.T(view);
            v4.i0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                boolean z11 = false;
                if (b10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b10 == adapter.b() - 1) {
                    z11 = true;
                }
                if (z10) {
                    if (this.d) {
                        L = i7;
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.top = L;
                }
                if (z11) {
                    rect.bottom = i7;
                }
            }
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof ek0) {
            ((ek0) recyclerView).P0(canvas);
        }
    }
}
