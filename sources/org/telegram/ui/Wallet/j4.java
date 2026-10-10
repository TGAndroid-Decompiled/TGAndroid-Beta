package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bt;
public final class j4 extends bt {
    public final ii.d2 G;

    public j4(b5 b5Var, Context context) {
        super(context);
        this.G = new ii.d2(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(22.0f), b5Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6)), AndroidUtilities.dpf2(2.67f), AndroidUtilities.dpf2(0.67f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f16362g.f16369a);
        if (ceil > 0) {
            int width = getWidth();
            ii.d2 d2Var = this.G;
            d2Var.setBounds(0, 0, width, ceil);
            d2Var.setAlpha((int) (getMetadata().f16359c.f16369a * 255.0f));
            d2Var.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
