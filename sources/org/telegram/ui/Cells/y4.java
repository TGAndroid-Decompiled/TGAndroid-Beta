package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.w9 {
    public final org.telegram.ui.ActionBar.d6 G;
    public final a5 H;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = a5Var;
        this.G = d6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        a5 a5Var = this.H;
        if (a5Var.f21970r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ci.x7 x7Var = a5Var.N;
            x7Var.f6112a = false;
            x7Var.f6113b = false;
            x7Var.v = true;
            x7Var.f6123o = false;
            x7Var.J = this.G;
            TL_stories.StoryItem storyItem = a5Var.f21970r;
            x7Var.d = storyItem;
            ci.c8.h(storyItem.dialogId, canvas, this.f32033a, x7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
