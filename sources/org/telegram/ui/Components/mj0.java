package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class mj0 extends v4.o0 implements eh.a {
    public final org.telegram.messenger.y10 f37520a;
    public final ck0 f37521b;
    public final int f37522c;
    public final boolean d;

    public mj0(ck0 ck0Var, org.telegram.messenger.y10 y10Var, int i7, boolean z10) {
        this.f37521b = ck0Var;
        this.f37520a = y10Var;
        this.f37522c = i7;
        this.d = z10;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8369a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f37521b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int b10;
        boolean z10;
        int L;
        if (((Boolean) this.f37520a.a(view)).booleanValue()) {
            int i7 = this.f37522c;
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
        if (recyclerView instanceof ck0) {
            ((ck0) recyclerView).P0(canvas);
        }
    }
}
