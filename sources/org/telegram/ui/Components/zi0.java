package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class zi0 extends v4.m0 implements eh.a {
    public final org.telegram.messenger.d20 f41010a;
    public final pj0 f41011b;
    public final int f41012c;
    public final boolean d;

    public zi0(pj0 pj0Var, org.telegram.messenger.d20 d20Var, int i7, boolean z9) {
        this.f41011b = pj0Var;
        this.f41010a = d20Var;
        this.f41012c = i7;
        this.d = z9;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8703a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f41011b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int b10;
        boolean z9;
        int L;
        if (((Boolean) this.f41010a.a(view)).booleanValue()) {
            int i7 = this.f41012c;
            rect.right = i7;
            rect.left = i7;
            v4.d1 T = recyclerView.T(view);
            v4.g0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                boolean z10 = false;
                if (b10 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (b10 == adapter.b() - 1) {
                    z10 = true;
                }
                if (z9) {
                    if (this.d) {
                        L = i7;
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.top = L;
                }
                if (z10) {
                    rect.bottom = i7;
                }
            }
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof pj0) {
            ((pj0) recyclerView).P0(canvas);
        }
    }
}
