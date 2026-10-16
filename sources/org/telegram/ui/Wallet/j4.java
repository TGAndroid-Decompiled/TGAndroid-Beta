package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xs;
public final class j4 extends xs {
    public final ji.c2 G;

    public j4(a5 a5Var, Context context) {
        super(context);
        this.G = new ji.c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), a5Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6)), AndroidUtilities.dpf2(2.67f), AndroidUtilities.dpf2(0.67f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f16021g.f16027a);
        if (ceil > 0) {
            int width = getWidth();
            ji.c2 c2Var = this.G;
            c2Var.setBounds(0, 0, width, ceil);
            c2Var.setAlpha((int) (getMetadata().f16019c.f16027a * 255.0f));
            c2Var.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
