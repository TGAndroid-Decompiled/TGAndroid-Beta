package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.pr;
public final class i5 extends pr {
    public final ShapeDrawable G;
    public final y5 H;

    public i5(y5 y5Var, Context context) {
        super(context);
        this.H = y5Var;
        this.G = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), y5Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f55413g.f55420a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f55410c.f55420a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
