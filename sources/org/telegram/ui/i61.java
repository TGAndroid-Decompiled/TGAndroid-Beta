package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class i61 extends g71 {
    public final r71 E;

    public i61(r71 r71Var, Context context, boolean z10) {
        super(r71Var, context, z10);
        this.E = r71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        r71 r71Var = this.E;
        d61 d61Var = r71Var.f39635g0;
        i61 i61Var = r71Var.f39633f0;
        r61 r61Var = r71Var.U;
        if (r61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = d61Var.getX() + i61Var.getX();
            float y10 = d61Var.getY() + i61Var.getY();
            ah.h0 h0Var = (ah.h0) r61Var;
            ah.t0 t0Var = (ah.t0) h0Var.f768b;
            ah.s0 s0Var = t0Var.f864a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.fl0 delegate = ((org.telegram.ui.Components.gl0) h0Var.f769c).getDelegate();
            float x11 = s0Var.getX() + x10;
            if (t0Var.f884y == 1) {
                y3 = s0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = s0Var.getY() + t0Var.f866c.getY();
            }
            delegate.w(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
