package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.q91;
public final class w7 extends org.telegram.ui.Components.t9 {
    public final org.telegram.ui.ActionBar.c6 C;
    public final y7 D;

    public w7(y7 y7Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = y7Var;
        this.C = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        y7 y7Var = this.D;
        q91 q91Var = y7Var.v;
        if (q91Var != null && (q91Var.f41601a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            y7Var.f26007r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            lh.h7 h7Var = y7Var.f26007r;
            h7Var.f15665a = false;
            h7Var.f15666b = false;
            h7Var.v = true;
            h7Var.f15677o = false;
            h7Var.f15687z = 1;
            h7Var.J = this.C;
            lh.l7.h(0L, canvas, this.f32903a, h7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
