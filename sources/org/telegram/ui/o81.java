package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class o81 implements ch.a {
    public final RectF f39708a = new RectF();
    public final y8 f39709b;
    public final r91 f39710c;

    public o81(r91 r91Var, y8 y8Var) {
        this.f39710c = r91Var;
        this.f39709b = y8Var;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f4357a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        ec ecVar;
        ec ecVar2;
        r91 r91Var = this.f39710c;
        r91Var.fragmentView.getMeasuredWidth();
        r91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(r91Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = r91Var.T;
                ecVar = r91Var.S;
            } else if (i10 == 1 && (ecVar2 = r91Var.f40675j0) != null) {
                lVar = ecVar2.G;
                ecVar = ecVar2;
            } else {
                ke keVar = r91Var.f40676k0;
                if (keVar != null) {
                    lVar = keVar.f38488b1;
                    ecVar = keVar;
                } else {
                    lVar = null;
                    ecVar = null;
                }
            }
            if (lVar != null && ecVar != null) {
                y8 y8Var = this.f39709b;
                RectF rectF2 = this.f39708a;
                ih.j.c(ecVar, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    r91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
