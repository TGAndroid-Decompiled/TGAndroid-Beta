package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.u9 {
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
        if (a5Var.f19802r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = a5Var.N;
            caVar.f650a = false;
            caVar.f651b = false;
            caVar.v = true;
            caVar.f661o = false;
            caVar.J = this.G;
            TL_stories.StoryItem storyItem = a5Var.f19802r;
            caVar.d = storyItem;
            ai.ia.h(storyItem.dialogId, canvas, this.f28301a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
