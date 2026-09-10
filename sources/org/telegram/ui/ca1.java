package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ca1 implements ah.a {
    public final RectF f31593a = new RectF();
    public final w8 f31594b;
    public final fb1 f31595c;

    public ca1(fb1 fb1Var, w8 w8Var) {
        this.f31595c = fb1Var;
        this.f31594b = w8Var;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        zg.k kVar;
        ec ecVar;
        ec ecVar2;
        fb1 fb1Var = this.f31595c;
        fb1Var.fragmentView.getMeasuredWidth();
        fb1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(fb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = fb1Var.T;
                ecVar = fb1Var.S;
            } else if (i10 == 1 && (ecVar2 = fb1Var.f32753j0) != null) {
                kVar = ecVar2.G;
                ecVar = ecVar2;
            } else {
                le leVar = fb1Var.f32754k0;
                if (leVar != null) {
                    kVar = leVar.f34663b1;
                    ecVar = leVar;
                } else {
                    kVar = null;
                    ecVar = null;
                }
            }
            if (kVar != null && ecVar != null) {
                w8 w8Var = this.f31594b;
                RectF rectF2 = this.f31593a;
                gh.k.c(ecVar, w8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    fb1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override
    public final void g(g.z zVar, RectF rectF) {
        zVar.f8456b = true;
    }
}
