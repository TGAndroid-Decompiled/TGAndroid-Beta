package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.bs;
public final class y5 extends bs {
    public final ShapeDrawable H;
    public final o6 I;

    public y5(o6 o6Var, Context context) {
        super(context);
        this.I = o6Var;
        this.H = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), o6Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f57798g.f57805a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f57795c.f57805a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
