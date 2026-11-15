package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.i9 {
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
        if (a5Var.f30001r != null) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            a5Var.O.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            fi.h7 h7Var = a5Var.O;
            h7Var.f11778a = false;
            h7Var.f11779b = false;
            h7Var.v = true;
            h7Var.f11790o = false;
            h7Var.J = this.H;
            TL_stories.StoryItem storyItem = a5Var.f30001r;
            h7Var.d = storyItem;
            fi.l7.h(storyItem.dialogId, canvas, this.f35508a, h7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
