package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.us;
public final class w4 extends us {
    public final ki.c2 G;

    public w4(n5 n5Var, Context context) {
        super(context);
        this.G = new ki.c2(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), n5Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6)), AndroidUtilities.dpf2(2.67f), AndroidUtilities.dpf2(0.67f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f17400g.f17406a);
        if (ceil > 0) {
            int width = getWidth();
            ki.c2 c2Var = this.G;
            c2Var.setBounds(0, 0, width, ceil);
            c2Var.setAlpha((int) (getMetadata().f17398c.f17406a * 255.0f));
            c2Var.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
