package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.r91;
public final class z7 extends org.telegram.ui.Components.w9 {
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
        r91 r91Var = b8Var.v;
        if (r91Var != null && (r91Var.f41064a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b8Var.f22149r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ci.x7 x7Var = b8Var.f22149r;
            x7Var.f6119a = false;
            x7Var.f6120b = false;
            x7Var.v = true;
            x7Var.f6130o = false;
            x7Var.f6140z = 1;
            x7Var.J = this.G;
            ci.c8.h(0L, canvas, this.f32195a, x7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
