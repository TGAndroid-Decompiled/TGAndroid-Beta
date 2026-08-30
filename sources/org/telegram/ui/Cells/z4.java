package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 extends org.telegram.ui.Components.p9 {
    public final org.telegram.ui.ActionBar.f6 D;
    public final b5 E;

    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = b5Var;
        this.D = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        b5 b5Var = this.E;
        if (b5Var.f20873r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b5Var.K.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            nh.i7 i7Var = b5Var.K;
            i7Var.f15420a = false;
            i7Var.f15421b = false;
            i7Var.v = true;
            i7Var.f15431o = false;
            i7Var.J = this.D;
            TL_stories.StoryItem storyItem = b5Var.f20873r;
            i7Var.d = storyItem;
            nh.m7.h(storyItem.dialogId, canvas, this.f27785a, i7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
