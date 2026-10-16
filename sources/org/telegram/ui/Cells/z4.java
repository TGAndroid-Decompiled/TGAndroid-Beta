package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 extends org.telegram.ui.Components.z9 {
    public final org.telegram.ui.ActionBar.c6 G;
    public final b5 H;

    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.H = b5Var;
        this.G = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        b5 b5Var = this.H;
        if (b5Var.f20647r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            bi.m9 m9Var = b5Var.N;
            m9Var.f3328a = false;
            m9Var.f3329b = false;
            m9Var.v = true;
            m9Var.f3339o = false;
            m9Var.J = this.G;
            TL_stories.StoryItem storyItem = b5Var.f20647r;
            m9Var.d = storyItem;
            bi.s9.h(storyItem.dialogId, canvas, this.f31507a, m9Var);
            return;
        }
        super.onDraw(canvas);
    }
}
