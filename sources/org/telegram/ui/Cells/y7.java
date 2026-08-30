package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.da1;
public final class y7 extends org.telegram.ui.Components.p9 {
    public final org.telegram.ui.ActionBar.f6 D;
    public final a8 E;

    public y7(a8 a8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = a8Var;
        this.D = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        a8 a8Var = this.E;
        da1 da1Var = a8Var.v;
        if (da1Var != null && (da1Var.f33568a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a8Var.f20831r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            nh.i7 i7Var = a8Var.f20831r;
            i7Var.f15420a = false;
            i7Var.f15421b = false;
            i7Var.v = true;
            i7Var.f15431o = false;
            i7Var.f15441z = 1;
            i7Var.J = this.D;
            nh.m7.h(0L, canvas, this.f27785a, i7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
