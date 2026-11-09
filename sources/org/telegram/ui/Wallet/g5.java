package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.pr;
public final class g5 extends pr {
    public final ShapeDrawable G;
    public final w5 H;

    public g5(w5 w5Var, Context context) {
        super(context);
        this.H = w5Var;
        this.G = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(22.0f), w5Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f55518g.f55525a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f55515c.f55525a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
