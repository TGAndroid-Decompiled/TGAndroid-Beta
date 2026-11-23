package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 extends org.telegram.ui.Components.q9 {
    public final org.telegram.ui.ActionBar.h6 H;
    public final b5 I;

    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.I = b5Var;
        this.H = h6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        b5 b5Var = this.I;
        if (b5Var.f30468r != null) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            b5Var.O.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            fi.e7 e7Var = b5Var.O;
            e7Var.f11934a = false;
            e7Var.f11935b = false;
            e7Var.v = true;
            e7Var.f11946o = false;
            e7Var.J = this.H;
            TL_stories.StoryItem storyItem = b5Var.f30468r;
            e7Var.d = storyItem;
            fi.i7.h(storyItem.dialogId, canvas, this.f38836a, e7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
