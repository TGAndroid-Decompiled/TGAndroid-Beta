package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.v91;
public final class d8 extends org.telegram.ui.Components.y9 {
    public final org.telegram.ui.ActionBar.u6 G;
    public final f8 H;

    public d8(f8 f8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.H = f8Var;
        this.G = u6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        f8 f8Var = this.H;
        v91 v91Var = f8Var.v;
        if (v91Var != null && (v91Var.f44216a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            f8Var.f24085r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            di.w7 w7Var = f8Var.f24085r;
            w7Var.f9311a = false;
            w7Var.f9312b = false;
            w7Var.v = true;
            w7Var.f9322o = false;
            w7Var.f9332z = 1;
            w7Var.J = this.G;
            di.a8.h(0L, canvas, this.f35004a, w7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
