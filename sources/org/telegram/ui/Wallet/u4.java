package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.us;
public final class u4 extends us {
    public final ki.c2 G;

    public u4(l5 l5Var, Context context) {
        super(context);
        this.G = new ki.c2(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), l5Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6)), AndroidUtilities.dpf2(2.67f), AndroidUtilities.dpf2(0.67f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f17397g.f17403a);
        if (ceil > 0) {
            int width = getWidth();
            ki.c2 c2Var = this.G;
            c2Var.setBounds(0, 0, width, ceil);
            c2Var.setAlpha((int) (getMetadata().f17395c.f17403a * 255.0f));
            c2Var.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
