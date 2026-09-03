package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class n51 extends l61 {
    public final w61 B;

    public n51(w61 w61Var, Context context, boolean z4) {
        super(w61Var, context, z4);
        this.B = w61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y10;
        w61 w61Var = this.B;
        h51 h51Var = w61Var.f42311d0;
        n51 n51Var = w61Var.f42309c0;
        w51 w51Var = w61Var.R;
        if (w51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = h51Var.getX() + n51Var.getX();
            float y11 = h51Var.getY() + n51Var.getY();
            ng.w wVar = (ng.w) w51Var;
            ng.d0 d0Var = (ng.d0) wVar.f16237b;
            ng.c0 c0Var = d0Var.f16035a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.pk0 delegate = ((org.telegram.ui.Components.qk0) wVar.f16238c).getDelegate();
            float x11 = c0Var.getX() + x10;
            if (d0Var.f16056y == 1) {
                y10 = c0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y10 = c0Var.getY() + d0Var.f16037c.getY();
            }
            delegate.j(canvas, rectF, 0.0f, x11, y10 + y11, 255, true);
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
