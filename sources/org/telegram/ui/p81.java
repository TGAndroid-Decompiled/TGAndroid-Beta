package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class p81 implements jg.a {
    public final RectF f41368a = new RectF();
    public final fh.x4 f41369b;
    public final s91 f41370c;

    public p81(s91 s91Var, fh.x4 x4Var) {
        this.f41370c = s91Var;
        this.f41369b = x4Var;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        ig.k kVar;
        xb xbVar;
        xb xbVar2;
        s91 s91Var = this.f41370c;
        s91Var.fragmentView.getMeasuredWidth();
        s91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(s91Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        for (int i9 = 0; i9 < 3; i9++) {
            if (i9 == 0) {
                kVar = s91Var.P;
                xbVar = s91Var.O;
            } else if (i9 == 1 && (xbVar2 = s91Var.f42616f0) != null) {
                kVar = xbVar2.C;
                xbVar = xbVar2;
            } else {
                fe feVar = s91Var.f42617g0;
                if (feVar != null) {
                    kVar = feVar.X0;
                    xbVar = feVar;
                } else {
                    kVar = null;
                    xbVar = null;
                }
            }
            if (kVar != null && xbVar != null) {
                fh.x4 x4Var = this.f41369b;
                RectF rectF2 = this.f41368a;
                pg.i.c(xbVar, x4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    s91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f7046b = true;
    }
}
