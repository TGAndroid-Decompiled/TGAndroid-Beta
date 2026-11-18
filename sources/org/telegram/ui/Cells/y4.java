package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.q9 {
    public final org.telegram.ui.ActionBar.i6 H;
    public final a5 I;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.I = a5Var;
        this.H = i6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        a5 a5Var = this.I;
        if (a5Var.f30378r != null) {
            float L2 = org.telegram.messenger.g0.L(1.0f);
            a5Var.O.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            fi.e7 e7Var = a5Var.O;
            e7Var.f11892a = false;
            e7Var.f11893b = false;
            e7Var.v = true;
            e7Var.f11904o = false;
            e7Var.J = this.H;
            TL_stories.StoryItem storyItem = a5Var.f30378r;
            e7Var.d = storyItem;
            fi.i7.h(storyItem.dialogId, canvas, this.f38742a, e7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
