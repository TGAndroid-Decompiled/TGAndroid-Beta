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
        if (o91Var != null && (o91Var.f39715a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b8Var.f22058r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ci.y7 y7Var = b8Var.f22058r;
            y7Var.f6212a = false;
            y7Var.f6213b = false;
            y7Var.v = true;
            y7Var.f6223o = false;
            y7Var.f6233z = 1;
            y7Var.J = this.G;
            ci.d8.h(0L, canvas, this.f32040a, y7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
