package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class q81 implements ch.a {
    public final RectF f40737a = new RectF();
    public final y8 f40738b;
    public final t91 f40739c;

    public q81(t91 t91Var, y8 y8Var) {
        this.f40739c = t91Var;
        this.f40738b = y8Var;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f4360a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        cc ccVar;
        cc ccVar2;
        t91 t91Var = this.f40739c;
        t91Var.fragmentView.getMeasuredWidth();
        t91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(t91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = t91Var.T;
                ccVar = t91Var.S;
            } else if (i10 == 1 && (ccVar2 = t91Var.f41954j0) != null) {
                lVar = ccVar2.G;
                ccVar = ccVar2;
            } else {
                ie ieVar = t91Var.f41955k0;
                if (ieVar != null) {
                    lVar = ieVar.f38240b1;
                    ccVar = ieVar;
                } else {
                    lVar = null;
                    ccVar = null;
                }
            }
            if (lVar != null && ccVar != null) {
                y8 y8Var = this.f40738b;
                RectF rectF2 = this.f40737a;
                ih.k.c(ccVar, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    t91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
