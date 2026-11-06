package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.z41;
public final class u7 extends org.telegram.ui.Components.l9 {
    public final org.telegram.ui.ActionBar.f6 G;
    public final w7 H;

    public u7(w7 w7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = w7Var;
        this.G = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        w7 w7Var = this.H;
        z41 z41Var = w7Var.f30738w;
        if (z41Var != null && (z41Var.f52473a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            w7Var.f30736r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            di.n7 n7Var = w7Var.f30736r;
            n7Var.f9408a = false;
            n7Var.f9409b = false;
            n7Var.v = true;
            n7Var.f9420o = false;
            n7Var.f9430z = 1;
            n7Var.J = this.G;
            di.r7.h(0L, canvas, this.f35562a, n7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
