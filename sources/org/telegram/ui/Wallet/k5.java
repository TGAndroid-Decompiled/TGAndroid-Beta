package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.zr;
public final class k5 extends zr {
    public final ShapeDrawable G;
    public final b6 H;

    public k5(b6 b6Var, Context context) {
        super(context);
        this.H = b6Var;
        this.G = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), b6Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().f7043g.f7049a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().f7041c.f7049a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
