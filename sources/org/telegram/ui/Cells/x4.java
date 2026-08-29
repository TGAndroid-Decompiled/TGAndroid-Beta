package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class x4 extends org.telegram.ui.Components.t9 {
    public final org.telegram.ui.ActionBar.c6 C;
    public final z4 D;

    public x4(z4 z4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = z4Var;
        this.C = c6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        z4 z4Var = this.D;
        if (z4Var.f26047r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            z4Var.J.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            lh.h7 h7Var = z4Var.J;
            h7Var.f15665a = false;
            h7Var.f15666b = false;
            h7Var.v = true;
            h7Var.f15677o = false;
            h7Var.J = this.C;
            TL_stories.StoryItem storyItem = z4Var.f26047r;
            h7Var.d = storyItem;
            lh.l7.h(storyItem.dialogId, canvas, this.f32903a, h7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
