package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class lh implements bh.a {
    public final int f26080a;
    public final Object f26081b;

    public lh(Object obj, int i10) {
        this.f26080a = i10;
        this.f26081b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f26080a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        oi oiVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        oi oiVar2;
        ci.w7 w7Var;
        switch (this.f26080a) {
            case 0:
                wi wiVar = (wi) this.f26081b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        oiVar = wiVar.f30081y0;
                    } else {
                        oiVar = wiVar.f30084z0;
                    }
                    if (oiVar != null && oiVar.f27044c != null && oiVar.getVisibility() == 0) {
                        if (i10 == 0 && (oiVar2 = wiVar.f30084z0) != null && oiVar2.getVisibility() == 0) {
                            alpha = (1.0f - wiVar.f30084z0.getAlpha()) * oiVar.getAlpha();
                        } else {
                            alpha = oiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(oiVar.f27044c, canvas2, rectF2, oiVar.d, wiVar.getContainerView(), (int) (alpha * 255.0f));
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                return;
            case 1:
                mz mzVar = (mz) this.f26081b;
                yx yxVar = mzVar.P;
                gh.d.a(yxVar, canvas, rectF, yxVar, mzVar);
                ow owVar = mzVar.f26563h0;
                gh.d.a(owVar, canvas, rectF, owVar, mzVar);
                uw uwVar = mzVar.D0;
                gh.d.a(uwVar, canvas, rectF, uwVar, mzVar);
                return;
            default:
                kv0 kv0Var = (kv0) this.f26081b;
                for (du0 du0Var : kv0Var.f25842k0) {
                    ah.n nVar = du0Var.f23756n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                as0 as0Var = kv0Var.V;
                if (as0Var != null && (w7Var = as0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
