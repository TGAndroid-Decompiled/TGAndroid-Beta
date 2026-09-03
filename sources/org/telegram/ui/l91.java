package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class l91 implements og.a {
    public final RectF f35717a = new RectF();
    public final kh.i4 f35718b;
    public final oa1 f35719c;

    public l91(oa1 oa1Var, kh.i4 i4Var) {
        this.f35719c = oa1Var;
        this.f35718b = i4Var;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        ng.k kVar;
        cc ccVar;
        cc ccVar2;
        oa1 oa1Var = this.f35719c;
        oa1Var.fragmentView.getMeasuredWidth();
        oa1Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(oa1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = oa1Var.Q;
                ccVar = oa1Var.P;
            } else if (i10 == 1 && (ccVar2 = oa1Var.f36721g0) != null) {
                kVar = ccVar2.D;
                ccVar = ccVar2;
            } else {
                me meVar = oa1Var.f36722h0;
                if (meVar != null) {
                    kVar = meVar.Y0;
                    ccVar = meVar;
                } else {
                    kVar = null;
                    ccVar = null;
                }
            }
            if (kVar != null && ccVar != null) {
                kh.i4 i4Var = this.f35718b;
                RectF rectF2 = this.f35717a;
                ug.i.c(ccVar, i4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    oa1Var.fragmentView.getMeasuredWidth();
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
