package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class e91 implements pg.a {
    public final RectF f36450a = new RectF();
    public final lh.j4 f36451b;
    public final ha1 f36452c;

    public e91(ha1 ha1Var, lh.j4 j4Var) {
        this.f36452c = ha1Var;
        this.f36451b = j4Var;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        og.k kVar;
        ac acVar;
        ac acVar2;
        ha1 ha1Var = this.f36452c;
        ha1Var.fragmentView.getMeasuredWidth();
        ha1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ha1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = ha1Var.Q;
                acVar = ha1Var.P;
            } else if (i10 == 1 && (acVar2 = ha1Var.f37427g0) != null) {
                kVar = acVar2.D;
                acVar = acVar2;
            } else {
                ke keVar = ha1Var.f37428h0;
                if (keVar != null) {
                    kVar = keVar.Y0;
                    acVar = keVar;
                } else {
                    kVar = null;
                    acVar = null;
                }
            }
            if (kVar != null && acVar != null) {
                lh.j4 j4Var = this.f36451b;
                RectF rectF2 = this.f36450a;
                vg.i.c(acVar, j4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ha1Var.fragmentView.getMeasuredWidth();
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
