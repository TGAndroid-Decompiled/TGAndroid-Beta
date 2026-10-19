package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class m81 implements ch.a {
    public final RectF f39169a = new RectF();
    public final y8 f39170b;
    public final p91 f39171c;

    public m81(p91 p91Var, y8 y8Var) {
        this.f39171c = p91Var;
        this.f39170b = y8Var;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f4355a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        bh.l lVar;
        cc ccVar;
        cc ccVar2;
        p91 p91Var = this.f39171c;
        p91Var.fragmentView.getMeasuredWidth();
        p91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(p91Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20989d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                lVar = p91Var.T;
                ccVar = p91Var.S;
            } else if (i10 == 1 && (ccVar2 = p91Var.f40143j0) != null) {
                lVar = ccVar2.G;
                ccVar = ccVar2;
            } else {
                ie ieVar = p91Var.f40144k0;
                if (ieVar != null) {
                    lVar = ieVar.f37954b1;
                    ccVar = ieVar;
                } else {
                    lVar = null;
                    ccVar = null;
                }
            }
            if (lVar != null && ccVar != null) {
                y8 y8Var = this.f39170b;
                RectF rectF2 = this.f39169a;
                ih.j.c(ccVar, y8Var, rectF2);
                if (rectF2.right > 0.0f) {
                    p91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                lVar.f(canvas, rectF);
                canvas.restore();
            }
        }
    }
}
