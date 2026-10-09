package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class b61 extends z61 {
    public final k71 E;

    public b61(k71 k71Var, Context context, boolean z10) {
        super(k71Var, context, z10);
        this.E = k71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        k71 k71Var = this.E;
        w51 w51Var = k71Var.f39130g0;
        b61 b61Var = k71Var.f39128f0;
        k61 k61Var = k71Var.U;
        if (k61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = w51Var.getX() + b61Var.getX();
            float y10 = w51Var.getY() + b61Var.getY();
            qg.x1 x1Var = (qg.x1) k61Var;
            zg.a0 a0Var = (zg.a0) x1Var.f46621b;
            zg.z zVar = a0Var.f54449a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.jl0 delegate = ((org.telegram.ui.Components.kl0) x1Var.f46622c).getDelegate();
            float x11 = zVar.getX() + x10;
            if (a0Var.f54470y == 1) {
                y3 = zVar.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = zVar.getY() + a0Var.f54451c.getY();
            }
            delegate.r(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
