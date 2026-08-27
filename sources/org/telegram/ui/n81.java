package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

public final class n81 implements kg.a {

    public final RectF f40687a = new RectF();

    public final gh.q4 f40688b;

    public final q91 f40689c;

    public n81(q91 q91Var, gh.q4 q4Var) {
        this.f40689c = q91Var;
        this.f40688b = q4Var;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        fe feVar;
        jg.k kVar;
        View view;
        yb ybVar;
        r81 r81Var;
        q91 q91Var = this.f40689c;
        q91Var.fragmentView.getMeasuredWidth();
        q91Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(q91Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                kVar = q91Var.P;
                r81Var = q91Var.O;
            } else if (i10 != 1 || (ybVar = q91Var.f41559f0) == null) {
                feVar = q91Var.f41560g0;
                if (feVar != null) {
                    kVar = feVar.X0;
                } else {
                    kVar = null;
                    view = null;
                }
            } else {
                kVar = ybVar.C;
            }
            if (kVar == null) {
                view = feVar;
                view = ybVar;
                view = r81Var;
            } else if (view != null) {
                gh.q4 q4Var = this.f40688b;
                RectF rectF2 = this.f40687a;
                qg.j.c(view, q4Var, rectF2);
                if (rectF2.right > 0.0f) {
                    q91Var.fragmentView.getMeasuredWidth();
                }
                canvas.save();
                kVar.e(canvas, rectF);
                canvas.restore();
            }
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        yVar.f6327b = true;
    }
}
