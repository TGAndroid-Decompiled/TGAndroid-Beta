package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class o41 extends m51 {
    public final x51 E;

    public o41(x51 x51Var, Context context, boolean z10) {
        super(x51Var, context, z10);
        this.E = x51Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        x51 x51Var = this.E;
        j41 j41Var = x51Var.f43062g0;
        o41 o41Var = x51Var.f43060f0;
        x41 x41Var = x51Var.U;
        if (x41Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = j41Var.getX() + o41Var.getX();
            float y10 = j41Var.getY() + o41Var.getY();
            ah.h0 h0Var = (ah.h0) x41Var;
            ah.t0 t0Var = (ah.t0) h0Var.f772b;
            ah.s0 s0Var = t0Var.f868a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.cl0 delegate = ((org.telegram.ui.Components.dl0) h0Var.f773c).getDelegate();
            float x11 = s0Var.getX() + x10;
            if (t0Var.f888y == 1) {
                y3 = s0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = s0Var.getY() + t0Var.f870c.getY();
            }
            delegate.q(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
