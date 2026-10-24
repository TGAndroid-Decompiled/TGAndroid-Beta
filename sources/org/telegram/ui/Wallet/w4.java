package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ss;
public final class w4 extends ss {
    public final ShapeDrawable G;
    public final o5 H;

    public w4(o5 o5Var, Context context) {
        super(context);
        this.H = o5Var;
        this.G = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), o5Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f17464g.f17470a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f17462c.f17470a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
