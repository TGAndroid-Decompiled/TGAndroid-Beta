package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.pa1;
public final class a8 extends org.telegram.ui.Components.w9 {
    public final org.telegram.ui.ActionBar.d6 G;
    public final c8 H;

    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = c8Var;
        this.G = d6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        c8 c8Var = this.H;
        pa1 pa1Var = c8Var.v;
        if (pa1Var != null && (pa1Var.f36484a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            c8Var.f20102r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = c8Var.f20102r;
            caVar.f656a = false;
            caVar.f657b = false;
            caVar.v = true;
            caVar.f667o = false;
            caVar.f677z = 1;
            caVar.J = this.G;
            ai.ia.h(0L, canvas, this.f29958a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
