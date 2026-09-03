package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class k91 implements pg.a {
    public final RectF f38235a = new RectF();
    public final lh.j4 f38236b;
    public final na1 f38237c;

    public k91(na1 na1Var, lh.j4 j4Var) {
        this.f38237c = na1Var;
        this.f38236b = j4Var;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        og.k kVar;
        ac acVar;
        ac acVar2;
        na1 na1Var = this.f38237c;
        na1Var.fragmentView.getMeasuredWidth();
        na1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(na1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = na1Var.Q;
                acVar = na1Var.P;
            } else if (i10 == 1 && (acVar2 = na1Var.f39259g0) != null) {
                kVar = acVar2.D;
                acVar = acVar2;
            } else {
                ke keVar = na1Var.f39260h0;
                if (keVar != null) {
                    kVar = keVar.Y0;
                    acVar = keVar;
                } else {
                    kVar = null;
                    acVar = null;
                }
            }
            if (kVar != null && acVar != null) {
                lh.j4 j4Var = this.f38236b;
                RectF rectF2 = this.f38235a;
                vg.i.c(acVar, j4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    na1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6800b = true;
    }
}
