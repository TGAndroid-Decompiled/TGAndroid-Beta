package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class n51 extends l61 {
    public final x61 B;

    public n51(x61 x61Var, Context context, boolean z4) {
        super(x61Var, context, z4);
        this.B = x61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y10;
        x61 x61Var = this.B;
        h51 h51Var = x61Var.f39860d0;
        n51 n51Var = x61Var.f39858c0;
        w51 w51Var = x61Var.R;
        if (w51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = h51Var.getX() + n51Var.getX();
            float y11 = h51Var.getY() + n51Var.getY();
            mg.w wVar = (mg.w) w51Var;
            mg.d0 d0Var = (mg.d0) wVar.f14149b;
            mg.c0 c0Var = d0Var.f13960a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ok0 delegate = ((org.telegram.ui.Components.pk0) wVar.f14150c).getDelegate();
            float x11 = c0Var.getX() + x10;
            if (d0Var.f13980y == 1) {
                y10 = c0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y10 = c0Var.getY() + d0Var.f13962c.getY();
            }
            delegate.l(canvas, rectF, 0.0f, x11, y10 + y11, 255, true);
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
