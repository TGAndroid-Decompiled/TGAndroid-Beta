package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.cb1;
public final class b8 extends org.telegram.ui.Components.w9 {
    public final org.telegram.ui.ActionBar.f6 G;
    public final d8 H;

    public b8(d8 d8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = d8Var;
        this.G = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        d8 d8Var = this.H;
        cb1 cb1Var = d8Var.v;
        if (cb1Var != null && (cb1Var.f31602a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            d8Var.f19007r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            zh.x5 x5Var = d8Var.f19007r;
            x5Var.f49048a = false;
            x5Var.f49049b = false;
            x5Var.v = true;
            x5Var.f49059o = false;
            x5Var.f49069z = 1;
            x5Var.J = this.G;
            zh.a6.h(0L, canvas, this.f28728a, x5Var);
            return;
        }
        super.onDraw(canvas);
    }
}
