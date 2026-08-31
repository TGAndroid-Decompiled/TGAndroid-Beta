package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class hl0 extends f2.v0 implements pg.a {
    public final Utilities.CallbackReturn f27511a;
    public final tl0 f27512b;
    public final int f27513c;
    public final boolean d;

    public hl0(tl0 tl0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z4) {
        this.f27512b = tl0Var;
        this.f27511a = callbackReturn;
        this.f27513c = i10;
        this.d = z4;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        int b10;
        boolean z4;
        int dp;
        if (((Boolean) this.f27511a.run(view)).booleanValue()) {
            int i10 = this.f27513c;
            rect.right = i10;
            rect.left = i10;
            f2.m1 T = recyclerView.T(view);
            f2.p0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                boolean z10 = false;
                if (b10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (b10 == adapter.h() - 1) {
                    z10 = true;
                }
                if (z4) {
                    if (this.d) {
                        dp = i10;
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    rect.top = dp;
                }
                if (z10) {
                    rect.bottom = i10;
                }
            }
        }
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof tl0) {
            ((tl0) recyclerView).Q0(canvas);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f27512b.Q0(canvas);
        canvas.restore();
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6800b = true;
    }
}
