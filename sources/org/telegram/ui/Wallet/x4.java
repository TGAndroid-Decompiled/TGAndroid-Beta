package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.us;
public final class x4 extends us {
    public final ShapeDrawable G;

    public x4(o5 o5Var, Context context) {
        super(context);
        this.G = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), o5Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20989d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f17403g.f17409a);
        if (ceil > 0) {
            int width = getWidth();
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.setBounds(0, 0, width, ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f17401c.f17409a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
