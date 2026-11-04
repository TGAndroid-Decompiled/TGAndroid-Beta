package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.o41;
public final class t7 extends org.telegram.ui.Components.k9 {
    public final org.telegram.ui.ActionBar.e6 H;
    public final v7 I;

    public t7(v7 v7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.I = v7Var;
        this.H = e6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        v7 v7Var = this.I;
        o41 o41Var = v7Var.f30746w;
        if (o41Var != null && (o41Var.f48185a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            v7Var.f30744r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            ei.o7 o7Var = v7Var.f30744r;
            o7Var.f10696a = false;
            o7Var.f10697b = false;
            o7Var.v = true;
            o7Var.f10708o = false;
            o7Var.f10718z = 1;
            o7Var.J = this.H;
            ei.s7.h(0L, canvas, this.f35342a, o7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
