package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class kk0 extends f2.y0 implements jg.a {
    public final Utilities.CallbackReturn f30190a;
    public final wk0 f30191b;
    public final int f30192c;
    public final boolean d;

    public kk0(wk0 wk0Var, Utilities.CallbackReturn callbackReturn, int i9, boolean z10) {
        this.f30191b = wk0Var;
        this.f30190a = callbackReturn;
        this.f30192c = i9;
        this.d = z10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        int b10;
        boolean z10;
        int dp;
        if (((Boolean) this.f30190a.run(view)).booleanValue()) {
            int i9 = this.f30192c;
            rect.right = i9;
            rect.left = i9;
            f2.q1 T = recyclerView.T(view);
            f2.r0 adapter = recyclerView.getAdapter();
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
                        dp = i9;
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    rect.top = dp;
                }
                if (z11) {
                    rect.bottom = i9;
                }
            }
        }
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof wk0) {
            ((wk0) recyclerView).Q0(canvas);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f30191b.Q0(canvas);
        canvas.restore();
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f7046b = true;
    }
}
