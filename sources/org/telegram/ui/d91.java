package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class d91 implements og.a {
    public final RectF f33560a = new RectF();
    public final kh.j4 f33561b;
    public final ga1 f33562c;

    public d91(ga1 ga1Var, kh.j4 j4Var) {
        this.f33562c = ga1Var;
        this.f33561b = j4Var;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        ng.k kVar;
        bc bcVar;
        bc bcVar2;
        ga1 ga1Var = this.f33562c;
        ga1Var.fragmentView.getMeasuredWidth();
        ga1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ga1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = ga1Var.Q;
                bcVar = ga1Var.P;
            } else if (i10 == 1 && (bcVar2 = ga1Var.f34537g0) != null) {
                kVar = bcVar2.D;
                bcVar = bcVar2;
            } else {
                ke keVar = ga1Var.f34538h0;
                if (keVar != null) {
                    kVar = keVar.Y0;
                    bcVar = keVar;
                } else {
                    kVar = null;
                    bcVar = null;
                }
            }
            if (kVar != null && bcVar != null) {
                kh.j4 j4Var = this.f33561b;
                RectF rectF2 = this.f33560a;
                ug.i.c(bcVar, j4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    ga1Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6327b = true;
    }
}
