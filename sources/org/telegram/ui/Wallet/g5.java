package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.pr;
public final class g5 extends pr {
    public final ShapeDrawable H;
    public final w5 I;

    public g5(w5 w5Var, Context context) {
        super(context);
        this.I = w5Var;
        this.H = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), w5Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f53859g.f53866a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f53856c.f53866a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
