package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class aa1 implements bh.a {
    public final RectF f35745a = new RectF();
    public final y8 f35746b;
    public final db1 f35747c;

    public aa1(db1 db1Var, y8 y8Var) {
        this.f35747c = db1Var;
        this.f35746b = y8Var;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f538a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ah.n nVar;
        fc fcVar;
        fc fcVar2;
        db1 db1Var = this.f35747c;
        db1Var.fragmentView.getMeasuredWidth();
        db1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(db1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20560d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = db1Var.T;
                fcVar = db1Var.S;
            } else if (i10 == 1 && (fcVar2 = db1Var.f36738j0) != null) {
                nVar = fcVar2.G;
                fcVar = fcVar2;
            } else {
                oe oeVar = db1Var.f36739k0;
                if (oeVar != null) {
                    nVar = oeVar.f40659b1;
                    fcVar = oeVar;
                } else {
                    nVar = null;
                    fcVar = null;
                }
            }
            if (nVar != null && fcVar != null) {
                y8 y8Var = this.f35746b;
                RectF rectF2 = this.f35745a;
                hh.j.c(fcVar, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    db1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
