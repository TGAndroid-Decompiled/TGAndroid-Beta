package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ea1 implements ch.a {
    public final RectF f35500a = new RectF();
    public final z8 f35501b;
    public final hb1 f35502c;

    public ea1(hb1 hb1Var, z8 z8Var) {
        this.f35502c = hb1Var;
        this.f35501b = z8Var;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f2740a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        ic icVar;
        ic icVar2;
        hb1 hb1Var = this.f35502c;
        hb1Var.fragmentView.getMeasuredWidth();
        hb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(hb1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = hb1Var.T;
                icVar = hb1Var.S;
            } else if (i10 == 1 && (icVar2 = hb1Var.f36699j0) != null) {
                lVar = icVar2.G;
                icVar = icVar2;
            } else {
                qe qeVar = hb1Var.f36700k0;
                if (qeVar != null) {
                    lVar = qeVar.f39396b1;
                    icVar = qeVar;
                } else {
                    lVar = null;
                    icVar = null;
                }
            }
            if (lVar != null && icVar != null) {
                z8 z8Var = this.f35501b;
                RectF rectF2 = this.f35500a;
                ih.j.c(icVar, z8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    hb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
