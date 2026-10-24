package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.q91;
public final class z7 extends org.telegram.ui.Components.u9 {
    public final org.telegram.ui.ActionBar.g6 G;
    public final b8 H;

    public z7(b8 b8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = b8Var;
        this.G = g6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        b8 b8Var = this.H;
        q91 q91Var = b8Var.v;
        if (q91Var != null && (q91Var.f40750a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b8Var.f22150r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ci.x7 x7Var = b8Var.f22150r;
            x7Var.f6119a = false;
            x7Var.f6120b = false;
            x7Var.v = true;
            x7Var.f6130o = false;
            x7Var.f6140z = 1;
            x7Var.J = this.G;
            ci.c8.h(0L, canvas, this.f31064a, x7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
