package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.p9 {
    public final org.telegram.ui.ActionBar.f6 D;
    public final a5 E;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = a5Var;
        this.D = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        a5 a5Var = this.E;
        if (a5Var.f20804r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a5Var.K.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            nh.i7 i7Var = a5Var.K;
            i7Var.f15400a = false;
            i7Var.f15401b = false;
            i7Var.v = true;
            i7Var.f15411o = false;
            i7Var.J = this.D;
            TL_stories.StoryItem storyItem = a5Var.f20804r;
            i7Var.d = storyItem;
            nh.m7.h(storyItem.dialogId, canvas, this.f27801a, i7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
