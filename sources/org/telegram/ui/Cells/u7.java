package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.y41;
public final class u7 extends org.telegram.ui.Components.p9 {
    public final org.telegram.ui.ActionBar.i6 H;
    public final w7 I;

    public u7(w7 w7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.I = w7Var;
        this.H = i6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        w7 w7Var = this.I;
        y41 y41Var = w7Var.f32350w;
        if (y41Var != null && (y41Var.f54222a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            w7Var.f32348r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            fi.e7 e7Var = w7Var.f32348r;
            e7Var.f11896a = false;
            e7Var.f11897b = false;
            e7Var.v = true;
            e7Var.f11908o = false;
            e7Var.f11918z = 1;
            e7Var.J = this.H;
            fi.i7.h(0L, canvas, this.f38429a, e7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
