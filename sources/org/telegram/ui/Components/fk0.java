package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class fk0 extends s4.m0 implements ug.a {
    public final org.telegram.messenger.s20 f26182a;
    public final uk0 f26183b;
    public final int f26184c;
    public final boolean d;

    public fk0(uk0 uk0Var, org.telegram.messenger.s20 s20Var, int i10, boolean z10) {
        this.f26183b = uk0Var;
        this.f26182a = s20Var;
        this.f26184c = i10;
        this.d = z10;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        boolean z10;
        int L;
        if (((Boolean) this.f26182a.a(view)).booleanValue()) {
            int i10 = this.f26184c;
            rect.right = i10;
            rect.left = i10;
            s4.c1 T = recyclerView.T(view);
            s4.g0 adapter = recyclerView.getAdapter();
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
                        L = i10;
                    } else {
                        L = org.telegram.messenger.i0.L(4.0f);
                    }
                    rect.top = L;
                }
                if (z11) {
                    rect.bottom = i10;
                }
            }
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f26183b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof uk0) {
            ((uk0) recyclerView).P0(canvas);
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        yVar.f7259b = true;
    }
}
