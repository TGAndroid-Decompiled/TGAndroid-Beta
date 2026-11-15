package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ej0 extends v4.n0 implements eh.a {
    public final org.telegram.messenger.a20 f34328a;
    public final uj0 f34329b;
    public final int f34330c;
    public final boolean d;

    public ej0(uj0 uj0Var, org.telegram.messenger.a20 a20Var, int i7, boolean z10) {
        this.f34329b = uj0Var;
        this.f34328a = a20Var;
        this.f34330c = i7;
        this.d = z10;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8087a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f34329b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int b10;
        boolean z10;
        int L;
        if (((Boolean) this.f34328a.a(view)).booleanValue()) {
            int i7 = this.f34330c;
            rect.right = i7;
            rect.left = i7;
            v4.e1 T = recyclerView.T(view);
            v4.h0 adapter = recyclerView.getAdapter();
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
        if (recyclerView instanceof uj0) {
            ((uj0) recyclerView).P0(canvas);
        }
    }
}
