package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.la1;
public final class x7 extends org.telegram.ui.Components.p9 {
    public final org.telegram.ui.ActionBar.f6 D;
    public final z7 E;

    public x7(z7 z7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = z7Var;
        this.D = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        z7 z7Var = this.E;
        la1 la1Var = z7Var.v;
        if (la1Var != null && (la1Var.f35726a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float dp2 = AndroidUtilities.dp(1.0f);
            z7Var.f22665r.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            nh.i7 i7Var = z7Var.f22665r;
            i7Var.f15400a = false;
            i7Var.f15401b = false;
            i7Var.v = true;
            i7Var.f15411o = false;
            i7Var.f15421z = 1;
            i7Var.J = this.D;
            nh.m7.h(0L, canvas, this.f27801a, i7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
