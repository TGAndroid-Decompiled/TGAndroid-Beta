package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ea1 implements ch.a {
    public final RectF f35238a = new RectF();
    public final z8 f35239b;
    public final hb1 f35240c;

    public ea1(hb1 hb1Var, z8 z8Var) {
        this.f35240c = hb1Var;
        this.f35239b = z8Var;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f2744a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        hc hcVar;
        hc hcVar2;
        hb1 hb1Var = this.f35240c;
        hb1Var.fragmentView.getMeasuredWidth();
        hb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(hb1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = hb1Var.T;
                hcVar = hb1Var.S;
            } else if (i10 == 1 && (hcVar2 = hb1Var.f36488j0) != null) {
                lVar = hcVar2.G;
                hcVar = hcVar2;
            } else {
                qe qeVar = hb1Var.f36489k0;
                if (qeVar != null) {
                    lVar = qeVar.f39118b1;
                    hcVar = qeVar;
                } else {
                    lVar = null;
                    hcVar = null;
                }
            }
            if (lVar != null && hcVar != null) {
                z8 z8Var = this.f35239b;
                RectF rectF2 = this.f35238a;
                ih.j.c(hcVar, z8Var, rectF2);
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
