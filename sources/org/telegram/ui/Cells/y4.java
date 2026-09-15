package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 extends org.telegram.ui.Components.u9 {
    public final org.telegram.ui.ActionBar.e6 G;
    public final a5 H;

    public y4(a5 a5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.H = a5Var;
        this.G = e6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        a5 a5Var = this.H;
        if (a5Var.f19792r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            a5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = a5Var.N;
            caVar.f645a = false;
            caVar.f646b = false;
            caVar.v = true;
            caVar.f656o = false;
            caVar.J = this.G;
            TL_stories.StoryItem storyItem = a5Var.f19792r;
            caVar.d = storyItem;
            ai.ia.h(storyItem.dialogId, canvas, this.f28314a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
