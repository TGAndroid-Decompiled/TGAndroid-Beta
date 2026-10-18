package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class q41 extends o51 {
    public final z51 E;

    public q41(z51 z51Var, Context context, boolean z10) {
        super(z51Var, context, z10);
        this.E = z51Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        z51 z51Var = this.E;
        l41 l41Var = z51Var.f43620g0;
        q41 q41Var = z51Var.f43618f0;
        z41 z41Var = z51Var.U;
        if (z41Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = l41Var.getX() + q41Var.getX();
            float y10 = l41Var.getY() + q41Var.getY();
            ah.h0 h0Var = (ah.h0) z41Var;
            ah.t0 t0Var = (ah.t0) h0Var.f774b;
            ah.s0 s0Var = t0Var.f870a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.bl0 delegate = ((org.telegram.ui.Components.cl0) h0Var.f775c).getDelegate();
            float x11 = s0Var.getX() + x10;
            if (t0Var.f890y == 1) {
                y3 = s0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = s0Var.getY() + t0Var.f872c.getY();
            }
            delegate.m(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.E.U != null) {
                invalidate();
            }
        }
    }
}
