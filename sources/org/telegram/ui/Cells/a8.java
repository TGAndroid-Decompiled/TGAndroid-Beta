package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.xa1;
public final class a8 extends org.telegram.ui.Components.y9 {
    public final org.telegram.ui.ActionBar.d6 G;
    public final c8 H;

    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = c8Var;
        this.G = d6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        c8 c8Var = this.H;
        xa1 xa1Var = c8Var.v;
        if (xa1Var != null && (xa1Var.f44031a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            c8Var.f21919r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.da daVar = c8Var.f21919r;
            daVar.f838a = false;
            daVar.f839b = false;
            daVar.v = true;
            daVar.f850o = false;
            daVar.f860z = 1;
            daVar.J = this.G;
            ai.ja.h(0L, canvas, this.f33130a, daVar);
            return;
        }
        super.onDraw(canvas);
    }
}
