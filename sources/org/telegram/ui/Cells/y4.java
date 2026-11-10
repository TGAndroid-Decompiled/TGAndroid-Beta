package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.k9 {
    public final org.telegram.ui.ActionBar.h6 G;
    public final a5 H;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.H = a5Var;
        this.G = h6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        a5 a5Var = this.H;
        if (a5Var.f28898r != null) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            a5Var.N.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            di.o7 o7Var = a5Var.N;
            o7Var.f9446a = false;
            o7Var.f9447b = false;
            o7Var.v = true;
            o7Var.f9458o = false;
            o7Var.J = this.G;
            TL_stories.StoryItem storyItem = a5Var.f28898r;
            o7Var.d = storyItem;
            di.s7.h(storyItem.dialogId, canvas, this.f35249a, o7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
