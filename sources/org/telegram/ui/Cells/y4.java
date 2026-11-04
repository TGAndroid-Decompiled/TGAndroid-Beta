package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.k9 {
    public final org.telegram.ui.ActionBar.e6 H;
    public final a5 I;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.I = a5Var;
        this.H = e6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        a5 a5Var = this.I;
        if (a5Var.f28942r != null) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            a5Var.O.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            ei.o7 o7Var = a5Var.O;
            o7Var.f10696a = false;
            o7Var.f10697b = false;
            o7Var.v = true;
            o7Var.f10708o = false;
            o7Var.J = this.H;
            TL_stories.StoryItem storyItem = a5Var.f28942r;
            o7Var.d = storyItem;
            ei.s7.h(storyItem.dialogId, canvas, this.f35342a, o7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
