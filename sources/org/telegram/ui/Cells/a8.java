package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.xa1;
public final class a8 extends org.telegram.ui.Components.u9 {
    public final org.telegram.ui.ActionBar.f6 G;
    public final c8 H;

    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = c8Var;
        this.G = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        c8 c8Var = this.H;
        xa1 xa1Var = c8Var.v;
        if (xa1Var != null && (xa1Var.f39510a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            c8Var.f19887r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = c8Var.f19887r;
            caVar.f650a = false;
            caVar.f651b = false;
            caVar.v = true;
            caVar.f661o = false;
            caVar.f671z = 1;
            caVar.J = this.G;
            ai.ia.h(0L, canvas, this.f28304a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
