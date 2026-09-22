package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 extends org.telegram.ui.Components.u9 {
    public final org.telegram.ui.ActionBar.e6 G;
    public final b5 H;

    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.H = b5Var;
        this.G = e6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        b5 b5Var = this.H;
        if (b5Var.f19822r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = b5Var.N;
            caVar.f647a = false;
            caVar.f648b = false;
            caVar.v = true;
            caVar.f658o = false;
            caVar.J = this.G;
            TL_stories.StoryItem storyItem = b5Var.f19822r;
            caVar.d = storyItem;
            ai.ia.h(storyItem.dialogId, canvas, this.f28311a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
