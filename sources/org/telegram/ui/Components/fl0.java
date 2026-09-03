package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fl0 extends f2.u0 implements og.a {
    public final Utilities.CallbackReturn f24911a;
    public final rl0 f24912b;
    public final int f24913c;
    public final boolean d;

    public fl0(rl0 rl0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z4) {
        this.f24912b = rl0Var;
        this.f24911a = callbackReturn;
        this.f24913c = i10;
        this.d = z4;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int b10;
        boolean z4;
        int dp;
        if (((Boolean) this.f24911a.run(view)).booleanValue()) {
            int i10 = this.f24913c;
            rect.right = i10;
            rect.left = i10;
            f2.l1 T = recyclerView.T(view);
            f2.o0 adapter = recyclerView.getAdapter();
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
        if (recyclerView instanceof rl0) {
            ((rl0) recyclerView).P0(canvas);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f24912b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6327b = true;
    }
}
