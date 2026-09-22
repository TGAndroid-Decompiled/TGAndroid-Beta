package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ya1;
public final class b8 extends org.telegram.ui.Components.v9 {
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
        ya1 ya1Var = d8Var.v;
        if (ya1Var != null && (ya1Var.f39895a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            d8Var.f20151r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = d8Var.f20151r;
            caVar.f647a = false;
            caVar.f648b = false;
            caVar.v = true;
            caVar.f658o = false;
            caVar.f668z = 1;
            caVar.J = this.G;
            ai.ia.h(0L, canvas, this.f29034a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
