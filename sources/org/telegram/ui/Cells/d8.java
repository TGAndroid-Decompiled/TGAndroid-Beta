package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.t91;
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
        t91 t91Var = f8Var.v;
        if (t91Var != null && (t91Var.f43705a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            f8Var.f24083r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            di.w7 w7Var = f8Var.f24083r;
            w7Var.f9312a = false;
            w7Var.f9313b = false;
            w7Var.v = true;
            w7Var.f9323o = false;
            w7Var.f9333z = 1;
            w7Var.J = this.G;
            di.a8.h(0L, canvas, this.f34984a, w7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
