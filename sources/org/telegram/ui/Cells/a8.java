package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ya1;
public final class a8 extends org.telegram.ui.Components.x9 {
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
        ya1 ya1Var = c8Var.v;
        if (ya1Var != null && (ya1Var.f43066a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            c8Var.f21700r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            bi.j9 j9Var = c8Var.f21700r;
            j9Var.f3147a = false;
            j9Var.f3148b = false;
            j9Var.v = true;
            j9Var.f3159o = false;
            j9Var.f3169z = 1;
            j9Var.J = this.G;
            bi.p9.h(0L, canvas, this.f32476a, j9Var);
            return;
        }
        super.onDraw(canvas);
    }
}
