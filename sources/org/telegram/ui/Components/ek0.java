package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ek0 extends s4.m0 implements ug.a {
    public final org.telegram.messenger.r20 f25822a;
    public final tk0 f25823b;
    public final int f25824c;
    public final boolean d;

    public ek0(tk0 tk0Var, org.telegram.messenger.r20 r20Var, int i10, boolean z10) {
        this.f25823b = tk0Var;
        this.f25822a = r20Var;
        this.f25824c = i10;
        this.d = z10;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        boolean z10;
        int L;
        if (((Boolean) this.f25822a.a(view)).booleanValue()) {
            int i10 = this.f25824c;
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
        this.f25823b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof tk0) {
            ((tk0) recyclerView).P0(canvas);
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        yVar.f7258b = true;
    }
}
