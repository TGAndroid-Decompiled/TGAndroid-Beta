package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.p91;
public final class y7 extends org.telegram.ui.Components.o9 {
    public final org.telegram.ui.ActionBar.b6 C;
    public final a8 D;

    public y7(a8 a8Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.D = a8Var;
        this.C = b6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        a8 a8Var = this.D;
        p91 p91Var = a8Var.v;
        if (p91Var != null && (p91Var.f41380a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a8Var.f24063r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ih.l7 l7Var = a8Var.f24063r;
            l7Var.f11716a = false;
            l7Var.f11717b = false;
            l7Var.v = true;
            l7Var.f11728o = false;
            l7Var.f11738z = 1;
            l7Var.J = this.C;
            ih.p7.h(0L, canvas, this.f31328a, l7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
