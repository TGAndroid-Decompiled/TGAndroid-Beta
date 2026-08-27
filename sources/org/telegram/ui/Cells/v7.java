package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.n91;

public final class v7 extends org.telegram.ui.Components.n9 {
    public final org.telegram.ui.ActionBar.c6 C;
    public final x7 D;

    public v7(x7 x7Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = x7Var;
        this.C = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x7 x7Var = this.D;
        n91 n91Var = x7Var.v;
        if (n91Var == null || !(n91Var.f40698a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        int iDp = AndroidUtilities.dp(1.0f);
        float f10 = iDp;
        x7Var.f25944r.F.set(f10, f10, getMeasuredWidth() - iDp, getMeasuredHeight() - iDp);
        jh.h7 h7Var = x7Var.f25944r;
        h7Var.f13391a = false;
        h7Var.f13392b = false;
        h7Var.v = true;
        h7Var.f13403o = false;
        h7Var.f13413z = 1;
        h7Var.J = this.C;
        jh.l7.h(0L, canvas, this.f30898a, h7Var);
    }
}
