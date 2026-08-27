package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;

public final class w4 extends org.telegram.ui.Components.n9 {
    public final org.telegram.ui.ActionBar.c6 C;
    public final y4 D;

    public w4(y4 y4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = y4Var;
        this.C = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y4 y4Var = this.D;
        if (y4Var.f25994r == null) {
            super.onDraw(canvas);
            return;
        }
        int iDp = AndroidUtilities.dp(1.0f);
        float f10 = iDp;
        y4Var.J.F.set(f10, f10, getMeasuredWidth() - iDp, getMeasuredHeight() - iDp);
        jh.h7 h7Var = y4Var.J;
        h7Var.f13391a = false;
        h7Var.f13392b = false;
        h7Var.v = true;
        h7Var.f13403o = false;
        h7Var.J = this.C;
        TL_stories.StoryItem storyItem = y4Var.f25994r;
        h7Var.d = storyItem;
        jh.l7.h(storyItem.dialogId, canvas, this.f30898a, h7Var);
    }
}
