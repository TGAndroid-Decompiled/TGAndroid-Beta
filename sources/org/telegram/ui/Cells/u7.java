package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.a51;
public final class u7 extends org.telegram.ui.Components.l9 {
    public final org.telegram.ui.ActionBar.g6 G;
    public final w7 H;

    public u7(w7 w7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = w7Var;
        this.G = g6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        w7 w7Var = this.H;
        a51 a51Var = w7Var.f30747w;
        if (a51Var != null && (a51Var.f43588a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            w7Var.f30745r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            di.o7 o7Var = w7Var.f30745r;
            o7Var.f9441a = false;
            o7Var.f9442b = false;
            o7Var.v = true;
            o7Var.f9453o = false;
            o7Var.f9463z = 1;
            o7Var.J = this.G;
            di.s7.h(0L, canvas, this.f35647a, o7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
