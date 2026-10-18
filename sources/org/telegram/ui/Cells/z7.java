package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.o91;
public final class z7 extends org.telegram.ui.Components.w9 {
    public final org.telegram.ui.ActionBar.d6 G;
    public final b8 H;

    public z7(b8 b8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = b8Var;
        this.G = d6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        b8 b8Var = this.H;
        o91 o91Var = b8Var.v;
        if (o91Var != null && (o91Var.f39707a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b8Var.f22051r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ci.x7 x7Var = b8Var.f22051r;
            x7Var.f6112a = false;
            x7Var.f6113b = false;
            x7Var.v = true;
            x7Var.f6123o = false;
            x7Var.f6133z = 1;
            x7Var.J = this.G;
            ci.c8.h(0L, canvas, this.f32033a, x7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
