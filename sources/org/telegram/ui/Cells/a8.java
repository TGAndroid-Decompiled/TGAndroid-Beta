package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.oa1;
public final class a8 extends org.telegram.ui.Components.w9 {
    public final org.telegram.ui.ActionBar.e6 G;
    public final c8 H;

    public a8(c8 c8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.H = c8Var;
        this.G = e6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        c8 c8Var = this.H;
        oa1 oa1Var = c8Var.v;
        if (oa1Var != null && (oa1Var.f36172a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            c8Var.f20104r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = c8Var.f20104r;
            caVar.f659a = false;
            caVar.f660b = false;
            caVar.v = true;
            caVar.f670o = false;
            caVar.f680z = 1;
            caVar.J = this.G;
            ai.ia.h(0L, canvas, this.f29894a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
