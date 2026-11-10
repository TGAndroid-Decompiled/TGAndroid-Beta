package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.b51;
public final class u7 extends org.telegram.ui.Components.k9 {
    public final org.telegram.ui.ActionBar.h6 G;
    public final w7 H;

    public u7(w7 w7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.H = w7Var;
        this.G = h6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        w7 w7Var = this.H;
        b51 b51Var = w7Var.f30758w;
        if (b51Var != null && (b51Var.f43930a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            w7Var.f30756r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            di.o7 o7Var = w7Var.f30756r;
            o7Var.f9446a = false;
            o7Var.f9447b = false;
            o7Var.v = true;
            o7Var.f9458o = false;
            o7Var.f9468z = 1;
            o7Var.J = this.G;
            di.s7.h(0L, canvas, this.f35249a, o7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
