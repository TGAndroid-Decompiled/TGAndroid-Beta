package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 extends org.telegram.ui.Components.w9 {
    public final org.telegram.ui.ActionBar.d6 G;
    public final b5 H;

    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = b5Var;
        this.G = d6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        b5 b5Var = this.H;
        if (b5Var.f20054r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b5Var.N.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ai.ca caVar = b5Var.N;
            caVar.f656a = false;
            caVar.f657b = false;
            caVar.v = true;
            caVar.f667o = false;
            caVar.J = this.G;
            TL_stories.StoryItem storyItem = b5Var.f20054r;
            caVar.d = storyItem;
            ai.ia.h(storyItem.dialogId, canvas, this.f29942a, caVar);
            return;
        }
        super.onDraw(canvas);
    }
}
