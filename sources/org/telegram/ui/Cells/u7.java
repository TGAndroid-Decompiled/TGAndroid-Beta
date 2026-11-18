package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.z41;
public final class u7 extends org.telegram.ui.Components.q9 {
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
        z41 z41Var = w7Var.f32273w;
        if (z41Var != null && (z41Var.f54429a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            w7Var.f32271r.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            fi.e7 e7Var = w7Var.f32271r;
            e7Var.f11892a = false;
            e7Var.f11893b = false;
            e7Var.v = true;
            e7Var.f11904o = false;
            e7Var.f11914z = 1;
            e7Var.J = this.H;
            fi.i7.h(0L, canvas, this.f38742a, e7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
