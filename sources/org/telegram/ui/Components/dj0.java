package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class dj0 extends u4.n0 implements fh.a {
    public final org.telegram.messenger.v10 f33121a;
    public final tj0 f33122b;
    public final int f33123c;
    public final boolean d;

    public dj0(tj0 tj0Var, org.telegram.messenger.v10 v10Var, int i3, boolean z10) {
        this.f33122b = tj0Var;
        this.f33121a = v10Var;
        this.f33123c = i3;
        this.d = z10;
    }

    @Override
    public final void b(eh.a aVar, RectF rectF) {
        aVar.f9978a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f33122b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int b10;
        boolean z10;
        int L;
        if (((Boolean) this.f33121a.a(view)).booleanValue()) {
            int i3 = this.f33123c;
            rect.right = i3;
            rect.left = i3;
            u4.d1 T = recyclerView.T(view);
            u4.h0 adapter = recyclerView.getAdapter();
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
                        L = i3;
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.top = L;
                }
                if (z11) {
                    rect.bottom = i3;
                }
            }
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof tj0) {
            ((tj0) recyclerView).P0(canvas);
        }
    }
}
