package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.r61;
public final class y7 extends org.telegram.ui.Components.g9 {
    public final org.telegram.ui.ActionBar.p6 G;
    public final a8 H;

    public y7(a8 a8Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.H = a8Var;
        this.G = p6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        a8 a8Var = this.H;
        r61 r61Var = a8Var.f21687w;
        if (r61Var != null && (r61Var.f41149a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.i0.L(1.0f);
            a8Var.f21685r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            th.t5 t5Var = a8Var.f21685r;
            t5Var.f49465a = false;
            t5Var.f49466b = false;
            t5Var.v = true;
            t5Var.f49476o = false;
            t5Var.f49486z = 1;
            t5Var.J = this.G;
            th.w5.h(0L, canvas, this.f26292a, t5Var);
            return;
        }
        super.onDraw(canvas);
    }
}
