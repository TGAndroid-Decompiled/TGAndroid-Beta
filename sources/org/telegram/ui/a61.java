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
        v51 v51Var = j71Var.f38926g0;
        a61 a61Var = j71Var.f38924f0;
        j61 j61Var = j71Var.U;
        if (j61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = v51Var.getX() + a61Var.getX();
            float y10 = v51Var.getY() + a61Var.getY();
            q9.p pVar = (q9.p) j61Var;
            zg.a0 a0Var = (zg.a0) pVar.f46148b;
            zg.z zVar = a0Var.f54570a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.kl0 delegate = ((org.telegram.ui.Components.ll0) pVar.f46149c).getDelegate();
            float x11 = zVar.getX() + x10;
            if (a0Var.f54591y == 1) {
                y3 = zVar.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = zVar.getY() + a0Var.f54572c.getY();
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
