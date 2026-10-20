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
        if (a5Var.f21974r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ci.y7 y7Var = a5Var.N;
            y7Var.f6209a = false;
            y7Var.f6210b = false;
            y7Var.v = true;
            y7Var.f6220o = false;
            y7Var.J = this.G;
            TL_stories.StoryItem storyItem = a5Var.f21974r;
            y7Var.d = storyItem;
            ci.d8.h(storyItem.dialogId, canvas, this.f31992a, y7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
