package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.w41;
public final class t7 extends org.telegram.ui.Components.i9 {
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
        w41 w41Var = v7Var.f31822w;
        if (w41Var != null && (w41Var.f52433a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            v7Var.f31820r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            fi.h7 h7Var = v7Var.f31820r;
            h7Var.f11778a = false;
            h7Var.f11779b = false;
            h7Var.v = true;
            h7Var.f11790o = false;
            h7Var.f11800z = 1;
            h7Var.J = this.H;
            fi.l7.h(0L, canvas, this.f35499a, h7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
