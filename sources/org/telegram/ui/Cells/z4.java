package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 extends org.telegram.ui.Components.w9 {
    public final org.telegram.ui.ActionBar.f6 G;
    public final b5 H;

    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = b5Var;
        this.G = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        b5 b5Var = this.H;
        if (b5Var.f18925r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            zh.x5 x5Var = b5Var.N;
            x5Var.f49048a = false;
            x5Var.f49049b = false;
            x5Var.v = true;
            x5Var.f49059o = false;
            x5Var.J = this.G;
            TL_stories.StoryItem storyItem = b5Var.f18925r;
            x5Var.d = storyItem;
            zh.a6.h(storyItem.dialogId, canvas, this.f28728a, x5Var);
            return;
        }
        super.onDraw(canvas);
    }
}
