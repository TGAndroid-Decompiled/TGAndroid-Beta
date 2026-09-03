package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ka1;
public final class y7 extends org.telegram.ui.Components.p9 {
    public final org.telegram.ui.ActionBar.g6 D;
    public final a8 E;

    public y7(a8 a8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = a8Var;
        this.D = g6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        a8 a8Var = this.E;
        ka1 ka1Var = a8Var.v;
        if (ka1Var != null && (ka1Var.f38241a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a8Var.f22556r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            oh.i7 i7Var = a8Var.f22556r;
            i7Var.f17225a = false;
            i7Var.f17226b = false;
            i7Var.v = true;
            i7Var.f17237o = false;
            i7Var.f17247z = 1;
            i7Var.J = this.D;
            oh.m7.h(0L, canvas, this.f30011a, i7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
