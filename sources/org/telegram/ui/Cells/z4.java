package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
public final class z4 extends org.telegram.ui.Components.o9 {
    public final org.telegram.ui.ActionBar.b6 C;
    public final b5 D;

    public z4(b5 b5Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.D = b5Var;
        this.C = b6Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        b5 b5Var = this.D;
        if (b5Var.f24136r != null) {
            float dp2 = AndroidUtilities.dp(1.0f);
            b5Var.J.F.set(dp2, dp2, getMeasuredWidth() - dp, getMeasuredHeight() - dp);
            ih.l7 l7Var = b5Var.J;
            l7Var.f11716a = false;
            l7Var.f11717b = false;
            l7Var.v = true;
            l7Var.f11728o = false;
            l7Var.J = this.C;
            TL_stories.StoryItem storyItem = b5Var.f24136r;
            l7Var.d = storyItem;
            ih.p7.h(storyItem.dialogId, canvas, this.f31328a, l7Var);
            return;
        }
        super.onDraw(canvas);
    }
}
