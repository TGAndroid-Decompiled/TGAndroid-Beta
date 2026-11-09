package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.l9 {
    public final org.telegram.ui.ActionBar.g6 G;
    public final a5 H;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.H = a5Var;
        this.G = g6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        a5 a5Var = this.H;
        if (a5Var.f28887r != null) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            a5Var.N.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            di.o7 o7Var = a5Var.N;
            o7Var.f9441a = false;
            o7Var.f9442b = false;
            o7Var.v = true;
            o7Var.f9453o = false;
            o7Var.J = this.G;
            TL_stories.StoryItem storyItem = a5Var.f28887r;
            o7Var.d = storyItem;
            di.s7.h(storyItem.dialogId, canvas, this.f35647a, o7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
