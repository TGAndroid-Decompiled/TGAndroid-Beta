package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class c61 extends a71 {
    public final l71 E;

    public c61(l71 l71Var, Context context, boolean z10) {
        super(l71Var, context, z10);
        this.E = l71Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y3;
        l71 l71Var = this.E;
        bi.l4 l4Var = l71Var.f34568g0;
        c61 c61Var = l71Var.f34566f0;
        l61 l61Var = l71Var.U;
        if (l61Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = l4Var.getX() + c61Var.getX();
            float y10 = l4Var.getY() + c61Var.getY();
            sg.f0 f0Var = (sg.f0) l61Var;
            yg.c0 c0Var = (yg.c0) f0Var.f41922c;
            yg.b0 b0Var = c0Var.f46950a;
            RectF rectF = AndroidUtilities.rectTmp;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            org.telegram.ui.Components.ok0 delegate = ((org.telegram.ui.Components.pk0) f0Var.f41921b).getDelegate();
            float x11 = b0Var.getX() + x10;
            if (c0Var.f46970y == 1) {
                y3 = b0Var.getY() - AndroidUtilities.statusBarHeight;
            } else {
                y3 = b0Var.getY() + c0Var.f46952c.getY();
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
