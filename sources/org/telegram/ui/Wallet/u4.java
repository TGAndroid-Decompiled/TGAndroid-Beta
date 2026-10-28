package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ws;
public final class u4 extends ws {
    public final ShapeDrawable G;
    public final m5 H;

    public u4(m5 m5Var, Context context) {
        super(context);
        this.H = m5Var;
        this.G = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), m5Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f19344g.f19350a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f19342c.f19350a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
