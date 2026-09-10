package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class hl0 extends s4.n0 implements ah.a {
    public final Utilities.CallbackReturn f23685a;
    public final vl0 f23686b;
    public final int f23687c;
    public final boolean d;

    public hl0(vl0 vl0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.f23686b = vl0Var;
        this.f23685a = callbackReturn;
        this.f23687c = i10;
        this.d = z10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        boolean z10;
        int dp;
        if (((Boolean) this.f23685a.run(view)).booleanValue()) {
            int i10 = this.f23687c;
            rect.right = i10;
            rect.left = i10;
            s4.c1 T = recyclerView.T(view);
            s4.h0 adapter = recyclerView.getAdapter();
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
        if (recyclerView instanceof vl0) {
            ((vl0) recyclerView).P0(canvas);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.f23686b.P0(canvas);
        canvas.restore();
    }

    @Override
    public final void g(g.z zVar, RectF rectF) {
        zVar.f8456b = true;
    }
}
