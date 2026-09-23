package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class q51 extends o61 {
    public final z61 E;

    public q51(z61 z61Var, Context context, boolean z10) {
        super(z61Var, context, z10);
        this.E = z61Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        z61 z61Var = this.E;
        l51 l51Var = z61Var.f40019g0;
        q51 q51Var = z61Var.f40017f0;
        z51 z51Var = z61Var.U;
        if (z51Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = l51Var.getX() + q51Var.getX();
            float y10 = l51Var.getY() + q51Var.getY();
            tg.d dVar = (tg.d) z51Var;
            zg.c0 c0Var = (zg.c0) dVar.f43072b;
            zg.b0 b0Var = c0Var.f48927a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.fk0 delegate = ((org.telegram.ui.Components.gk0) dVar.f43073c).getDelegate();
            float x11 = b0Var.getX() + x10;
            if (c0Var.f48947y == 1) {
                y3 = b0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = b0Var.getY() + c0Var.f48929c.getY();
            }
            delegate.n(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
