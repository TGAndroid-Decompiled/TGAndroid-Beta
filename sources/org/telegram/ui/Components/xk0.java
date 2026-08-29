package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class xk0 extends f2.v0 implements mg.a {
    public final Utilities.CallbackReturn f34771a;
    public final jl0 f34772b;
    public final int f34773c;
    public final boolean d;

    public xk0(jl0 jl0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.f34772b = jl0Var;
        this.f34771a = callbackReturn;
        this.f34773c = i10;
        this.d = z10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        int b10;
        boolean z10;
        int dp;
        if (((Boolean) this.f34771a.run(view)).booleanValue()) {
            int i10 = this.f34773c;
            rect.right = i10;
            rect.left = i10;
            f2.n1 T = recyclerView.T(view);
            f2.p0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                boolean z11 = false;
                if (b10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b10 == adapter.h() - 1) {
                    z11 = true;
                }
                if (z10) {
                    if (this.d) {
                        dp = i10;
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    rect.top = dp;
                }
                if (z11) {
                    rect.bottom = i10;
                }
            }
        }
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof jl0) {
            ((jl0) recyclerView).Q0(canvas);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f34772b.Q0(canvas);
        canvas.restore();
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6956b = true;
    }
}
