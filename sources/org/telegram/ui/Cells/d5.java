package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class d5 extends org.telegram.ui.Components.y9 {
    public final org.telegram.ui.ActionBar.u6 G;
    public final f5 H;

    public d5(f5 f5Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.H = f5Var;
        this.G = u6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        f5 f5Var = this.H;
        if (f5Var.f24068r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            f5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            di.w7 w7Var = f5Var.N;
            w7Var.f9312a = false;
            w7Var.f9313b = false;
            w7Var.v = true;
            w7Var.f9323o = false;
            w7Var.J = this.G;
            TL_stories.StoryItem storyItem = f5Var.f24068r;
            w7Var.d = storyItem;
            di.a8.h(storyItem.dialogId, canvas, this.f34984a, w7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
