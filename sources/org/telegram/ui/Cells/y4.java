package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.x9 {
    public final org.telegram.ui.ActionBar.f6 G;
    public final a5 H;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = a5Var;
        this.G = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        a5 a5Var = this.H;
        if (a5Var.f21635r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            bi.j9 j9Var = a5Var.N;
            j9Var.f3174a = false;
            j9Var.f3175b = false;
            j9Var.v = true;
            j9Var.f3186o = false;
            j9Var.J = this.G;
            TL_stories.StoryItem storyItem = a5Var.f21635r;
            j9Var.d = storyItem;
            bi.p9.h(storyItem.dialogId, canvas, this.f32503a, j9Var);
            return;
        }
        super.onDraw(canvas);
    }
}
