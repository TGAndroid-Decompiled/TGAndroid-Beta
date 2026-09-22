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
        u41 u41Var = j71Var.f34815g0;
        a61 a61Var = j71Var.f34813f0;
        j61 j61Var = j71Var.U;
        if (j61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = u41Var.getX() + a61Var.getX();
            float y10 = u41Var.getY() + a61Var.getY();
            s5.e eVar = (s5.e) j61Var;
            zg.c0 c0Var = (zg.c0) eVar.f43172b;
            zg.b0 b0Var = c0Var.f49303a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.rk0 delegate = ((org.telegram.ui.Components.sk0) eVar.f43173c).getDelegate();
            float x11 = b0Var.getX() + x10;
            if (c0Var.f49323y == 1) {
                y3 = b0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = b0Var.getY() + c0Var.f49305c.getY();
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
