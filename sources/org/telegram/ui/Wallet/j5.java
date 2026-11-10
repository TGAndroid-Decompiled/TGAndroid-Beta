package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.or;
public final class j5 extends or {
    public final ShapeDrawable G;
    public final z5 H;

    public j5(z5 z5Var, Context context) {
        super(context);
        this.H = z5Var;
        this.G = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), z5Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f55517g.f55524a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f55514c.f55524a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
