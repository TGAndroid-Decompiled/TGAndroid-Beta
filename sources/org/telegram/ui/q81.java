package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class q81 implements mg.a {
    public final RectF f41596a = new RectF();
    public final ih.j4 f41597b;
    public final t91 f41598c;

    public q81(t91 t91Var, ih.j4 j4Var) {
        this.f41598c = t91Var;
        this.f41597b = j4Var;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        lg.k kVar;
        wb wbVar;
        wb wbVar2;
        t91 t91Var = this.f41598c;
        t91Var.fragmentView.getMeasuredWidth();
        t91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(t91Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = t91Var.P;
                wbVar = t91Var.O;
            } else if (i10 == 1 && (wbVar2 = t91Var.f42598f0) != null) {
                kVar = wbVar2.C;
                wbVar = wbVar2;
            } else {
                de deVar = t91Var.f42599g0;
                if (deVar != null) {
                    kVar = deVar.X0;
                    wbVar = deVar;
                } else {
                    kVar = null;
                    wbVar = null;
                }
            }
            if (kVar != null && wbVar != null) {
                ih.j4 j4Var = this.f41597b;
                RectF rectF2 = this.f41596a;
                sg.i.c(wbVar, j4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    t91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6956b = true;
    }
}
