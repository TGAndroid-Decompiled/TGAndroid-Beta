package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class a61 extends y61 {
    public final j71 E;

    public a61(j71 j71Var, Context context, boolean z10) {
        super(j71Var, context, z10);
        this.E = j71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        j71 j71Var = this.E;
        v51 v51Var = j71Var.f37644g0;
        a61 a61Var = j71Var.f37642f0;
        j61 j61Var = j71Var.U;
        if (j61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = v51Var.getX() + a61Var.getX();
            float y10 = v51Var.getY() + a61Var.getY();
            ah.i0 i0Var = (ah.i0) j61Var;
            ah.u0 u0Var = (ah.u0) i0Var.f587b;
            ah.t0 t0Var = u0Var.f685a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ek0 delegate = ((org.telegram.ui.Components.fk0) i0Var.f588c).getDelegate();
            float x11 = t0Var.getX() + x10;
            if (u0Var.f706y == 1) {
                y3 = t0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = t0Var.getY() + u0Var.f687c.getY();
            }
            delegate.I(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
