package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class o91 implements bh.a {
    public final RectF f35718a = new RectF();
    public final w8 f35719b;
    public final ra1 f35720c;

    public o91(ra1 ra1Var, w8 w8Var) {
        this.f35720c = ra1Var;
        this.f35719b = w8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f417a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.n nVar;
        bc bcVar;
        bc bcVar2;
        ra1 ra1Var = this.f35720c;
        ra1Var.fragmentView.getMeasuredWidth();
        ra1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ra1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = ra1Var.T;
                bcVar = ra1Var.S;
            } else if (i10 == 1 && (bcVar2 = ra1Var.f36765j0) != null) {
                nVar = bcVar2.G;
                bcVar = bcVar2;
            } else {
                je jeVar = ra1Var.f36766k0;
                if (jeVar != null) {
                    nVar = jeVar.f34417b1;
                    bcVar = jeVar;
                } else {
                    nVar = null;
                    bcVar = null;
                }
            }
            if (nVar != null && bcVar != null) {
                w8 w8Var = this.f35719b;
                RectF rectF2 = this.f35718a;
                hh.k.c(bcVar, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ra1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
