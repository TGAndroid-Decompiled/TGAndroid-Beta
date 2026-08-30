package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gl0 extends f2.u0 implements og.a {
    public final Utilities.CallbackReturn f25190a;
    public final sl0 f25191b;
    public final int f25192c;
    public final boolean d;

    public gl0(sl0 sl0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z4) {
        this.f25191b = sl0Var;
        this.f25190a = callbackReturn;
        this.f25192c = i10;
        this.d = z4;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int b10;
        boolean z4;
        int dp;
        if (((Boolean) this.f25190a.run(view)).booleanValue()) {
            int i10 = this.f25192c;
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
        if (recyclerView instanceof sl0) {
            ((sl0) recyclerView).Q0(canvas);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f25191b.Q0(canvas);
        canvas.restore();
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6327b = true;
    }
}
