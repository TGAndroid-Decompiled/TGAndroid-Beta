package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.l9 {
    public final org.telegram.ui.ActionBar.f6 G;
    public final a5 H;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = a5Var;
        this.G = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        a5 a5Var = this.H;
        if (a5Var.f28883r != null) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            a5Var.N.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            di.n7 n7Var = a5Var.N;
            n7Var.f9408a = false;
            n7Var.f9409b = false;
            n7Var.v = true;
            n7Var.f9420o = false;
            n7Var.J = this.G;
            TL_stories.StoryItem storyItem = a5Var.f28883r;
            n7Var.d = storyItem;
            di.r7.h(storyItem.dialogId, canvas, this.f35600a, n7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
