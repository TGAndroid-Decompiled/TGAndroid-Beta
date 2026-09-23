package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.oa1;
public final class b8 extends org.telegram.ui.Components.w9 {
    public final org.telegram.ui.ActionBar.d6 G;
    public final d8 H;

    public b8(d8 d8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = d8Var;
        this.G = d6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        d8 d8Var = this.H;
        oa1 oa1Var = d8Var.v;
        if (oa1Var != null && (oa1Var.f35754a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            d8Var.f19876r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = d8Var.f19876r;
            caVar.f656a = false;
            caVar.f657b = false;
            caVar.v = true;
            caVar.f667o = false;
            caVar.f677z = 1;
            caVar.J = this.G;
            ai.ia.h(0L, canvas, this.f29579a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
