package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bt;
public final class k4 extends bt {
    public final ii.d2 G;

    public k4(c5 c5Var, Context context) {
        super(context);
        this.G = new ii.d2(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), c5Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6)), AndroidUtilities.dpf2(2.67f), AndroidUtilities.dpf2(0.67f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f16422g.f16429a);
        if (ceil > 0) {
            int width = getWidth();
            ii.d2 d2Var = this.G;
            d2Var.setBounds(0, 0, width, ceil);
            d2Var.setAlpha((int) (getMetadata().f16419c.f16429a * 255.0f));
            d2Var.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
