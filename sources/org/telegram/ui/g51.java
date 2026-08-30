package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class g51 extends e61 {
    public final q61 B;

    public g51(q61 q61Var, Context context, boolean z4) {
        super(q61Var, context, z4);
        this.B = q61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y10;
        q61 q61Var = this.B;
        a51 a51Var = q61Var.f37603d0;
        g51 g51Var = q61Var.f37601c0;
        p51 p51Var = q61Var.R;
        if (p51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = a51Var.getX() + g51Var.getX();
            float y11 = a51Var.getY() + g51Var.getY();
            mg.w wVar = (mg.w) p51Var;
            mg.d0 d0Var = (mg.d0) wVar.f14161b;
            mg.c0 c0Var = d0Var.f13972a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ok0 delegate = ((org.telegram.ui.Components.pk0) wVar.f14162c).getDelegate();
            float x11 = c0Var.getX() + x10;
            if (d0Var.f13992y == 1) {
                y10 = c0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y10 = c0Var.getY() + d0Var.f13974c.getY();
            }
            delegate.n(canvas, rectF, 0.0f, x11, y10 + y11, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            if (this.B.R != null) {
                invalidate();
            }
        }
    }
}
