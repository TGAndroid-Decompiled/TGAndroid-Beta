package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class a5 extends org.telegram.ui.Components.v9 {
    public final org.telegram.ui.ActionBar.f6 G;
    public final c5 H;

    public a5(c5 c5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = c5Var;
        this.G = f6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        c5 c5Var = this.H;
        if (c5Var.f20091r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            c5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = c5Var.N;
            caVar.f650a = false;
            caVar.f651b = false;
            caVar.v = true;
            caVar.f661o = false;
            caVar.J = this.G;
            TL_stories.StoryItem storyItem = c5Var.f20091r;
            caVar.d = storyItem;
            ai.ia.h(storyItem.dialogId, canvas, this.f29029a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
