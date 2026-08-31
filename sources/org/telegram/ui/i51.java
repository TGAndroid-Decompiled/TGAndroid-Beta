package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class i51 extends g61 {
    public final r61 B;

    public i51(r61 r61Var, Context context, boolean z4) {
        super(r61Var, context, z4);
        this.B = r61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y10;
        r61 r61Var = this.B;
        c51 c51Var = r61Var.f40788d0;
        i51 i51Var = r61Var.f40786c0;
        r51 r51Var = r61Var.R;
        if (r51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = c51Var.getX() + i51Var.getX();
            float y11 = c51Var.getY() + i51Var.getY();
            ng.w wVar = (ng.w) r51Var;
            ng.d0 d0Var = (ng.d0) wVar.f16235b;
            ng.c0 c0Var = d0Var.f16033a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            org.telegram.ui.Components.qk0 delegate = ((org.telegram.ui.Components.rk0) wVar.f16236c).getDelegate();
            float x11 = c0Var.getX() + x10;
            if (d0Var.f16054y == 1) {
                y10 = c0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y10 = c0Var.getY() + d0Var.f16035c.getY();
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
