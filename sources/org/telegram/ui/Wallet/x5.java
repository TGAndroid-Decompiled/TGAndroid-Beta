package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.cs;
public final class x5 extends cs {
    public final ShapeDrawable H;
    public final n6 I;

    public x5(n6 n6Var, Context context) {
        super(context);
        this.I = n6Var;
        this.H = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), n6Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f57676g.f57683a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f57673c.f57683a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
