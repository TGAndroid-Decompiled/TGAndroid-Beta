package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.pr;
public final class h5 extends pr {
    public final ShapeDrawable G;
    public final x5 H;

    public h5(x5 x5Var, Context context) {
        super(context);
        this.H = x5Var;
        this.G = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), x5Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f55505g.f55512a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f55502c.f55512a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
