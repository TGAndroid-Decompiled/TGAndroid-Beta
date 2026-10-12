package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class e61 extends c71 {
    public final n71 E;

    public e61(n71 n71Var, Context context, boolean z10) {
        super(n71Var, context, z10);
        this.E = n71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        n71 n71Var = this.E;
        z51 z51Var = n71Var.f40273g0;
        e61 e61Var = n71Var.f40271f0;
        n61 n61Var = n71Var.U;
        if (n61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = z51Var.getX() + e61Var.getX();
            float y10 = z51Var.getY() + e61Var.getY();
            qg.x1 x1Var = (qg.x1) n61Var;
            zg.a0 a0Var = (zg.a0) x1Var.f46566b;
            zg.z zVar = a0Var.f54681a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ml0 delegate = ((org.telegram.ui.Components.nl0) x1Var.f46567c).getDelegate();
            float x11 = zVar.getX() + x10;
            if (a0Var.f54702y == 1) {
                y3 = zVar.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = zVar.getY() + a0Var.f54683c.getY();
            }
            delegate.o(canvas, rectF, 0.0f, x11, y3 + y10, 255, true);
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
