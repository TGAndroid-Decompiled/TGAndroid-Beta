package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.z41;
public final class v7 extends org.telegram.ui.Components.q9 {
    public final org.telegram.ui.ActionBar.i6 H;
    public final x7 I;

    public v7(x7 x7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.I = x7Var;
        this.H = i6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        x7 x7Var = this.I;
        z41 z41Var = x7Var.f32326w;
        if (z41Var != null && (z41Var.f54388a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            x7Var.f32324r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            fi.e7 e7Var = x7Var.f32324r;
            e7Var.f11889a = false;
            e7Var.f11890b = false;
            e7Var.v = true;
            e7Var.f11901o = false;
            e7Var.f11911z = 1;
            e7Var.J = this.H;
            fi.i7.h(0L, canvas, this.f38742a, e7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
