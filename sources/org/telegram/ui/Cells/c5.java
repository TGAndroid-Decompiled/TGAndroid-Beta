package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class c5 extends org.telegram.ui.Components.g9 {
    public final org.telegram.ui.ActionBar.p6 G;
    public final e5 H;

    public c5(e5 e5Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.H = e5Var;
        this.G = p6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        e5 e5Var = this.H;
        if (e5Var.f21854r != null) {
            float L2 = org.telegram.messenger.i0.L(1.0f);
            e5Var.N.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            th.t5 t5Var = e5Var.N;
            t5Var.f49479a = false;
            t5Var.f49480b = false;
            t5Var.v = true;
            t5Var.f49490o = false;
            t5Var.J = this.G;
            TL_stories.StoryItem storyItem = e5Var.f21854r;
            t5Var.d = storyItem;
            th.w5.h(storyItem.dialogId, canvas, this.f26357a, t5Var);
            return;
        }
        super.onDraw(canvas);
    }
}
