package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class p91 implements bh.a {
    public final RectF f36449a = new RectF();
    public final w8 f36450b;
    public final sa1 f36451c;

    public p91(sa1 sa1Var, w8 w8Var) {
        this.f36451c = sa1Var;
        this.f36450b = w8Var;
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
        sa1 sa1Var = this.f36451c;
        sa1Var.fragmentView.getMeasuredWidth();
        sa1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(sa1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                nVar = sa1Var.T;
                bcVar = sa1Var.S;
            } else if (i10 == 1 && (bcVar2 = sa1Var.f37681j0) != null) {
                nVar = bcVar2.G;
                bcVar = bcVar2;
            } else {
                je jeVar = sa1Var.f37682k0;
                if (jeVar != null) {
                    nVar = jeVar.f34754b1;
                    bcVar = jeVar;
                } else {
                    nVar = null;
                    bcVar = null;
                }
            }
            if (nVar != null && bcVar != null) {
                w8 w8Var = this.f36450b;
                RectF rectF2 = this.f36449a;
                hh.k.c(bcVar, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    sa1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                nVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
