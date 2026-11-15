package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.vr;
public final class i5 extends vr {
    public final ShapeDrawable H;
    public final y5 I;

    public i5(y5 y5Var, Context context) {
        super(context);
        this.I = y5Var;
        this.H = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), y5Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f57100g.f57107a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f57097c.f57107a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
