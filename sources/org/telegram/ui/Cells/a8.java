package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.eb1;
public final class a8 extends org.telegram.ui.Components.z9 {
    public final org.telegram.ui.ActionBar.c6 G;
    public final c8 H;

    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.H = c8Var;
        this.G = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        c8 c8Var = this.H;
        eb1 eb1Var = c8Var.v;
        if (eb1Var != null && (eb1Var.f35507a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            c8Var.f21030r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            bi.m9 m9Var = c8Var.f21030r;
            m9Var.f3324a = false;
            m9Var.f3325b = false;
            m9Var.v = true;
            m9Var.f3335o = false;
            m9Var.f3345z = 1;
            m9Var.J = this.G;
            bi.s9.h(0L, canvas, this.f31813a, m9Var);
            return;
        }
        super.onDraw(canvas);
    }
}
