package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ab1;
public final class a8 extends org.telegram.ui.Components.y9 {
    public final org.telegram.ui.ActionBar.c6 G;
    public final c8 H;

    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.H = c8Var;
        this.G = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        c8 c8Var = this.H;
        ab1 ab1Var = c8Var.v;
        if (ab1Var != null && (ab1Var.f35752a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            c8Var.f21689r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.da daVar = c8Var.f21689r;
            daVar.f836a = false;
            daVar.f837b = false;
            daVar.v = true;
            daVar.f848o = false;
            daVar.f858z = 1;
            daVar.J = this.G;
            ai.ja.h(0L, canvas, this.f33001a, daVar);
            return;
        }
        super.onDraw(canvas);
    }
}
