package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.p61;
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
        p61 p61Var = a8Var.f21688w;
        if (p61Var != null && (p61Var.f40378a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.i0.L(1.0f);
            a8Var.f21686r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            th.t5 t5Var = a8Var.f21686r;
            t5Var.f49479a = false;
            t5Var.f49480b = false;
            t5Var.v = true;
            t5Var.f49490o = false;
            t5Var.f49500z = 1;
            t5Var.J = this.G;
            th.w5.h(0L, canvas, this.f26357a, t5Var);
            return;
        }
        super.onDraw(canvas);
    }
}
