package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class lh implements bh.a {
    public final int f25998a;
    public final Object f25999b;

    public lh(Object obj, int i10) {
        this.f25998a = i10;
        this.f25999b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f25998a) {
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
        switch (this.f25998a) {
            case 0:
                wi wiVar = (wi) this.f25999b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        oiVar = wiVar.f30004y0;
                    } else {
                        oiVar = wiVar.f30007z0;
                    }
                    if (oiVar != null && oiVar.f27078c != null && oiVar.getVisibility() == 0) {
                        if (i10 == 0 && (oiVar2 = wiVar.f30007z0) != null && oiVar2.getVisibility() == 0) {
                            alpha = (1.0f - wiVar.f30007z0.getAlpha()) * oiVar.getAlpha();
                        } else {
                            alpha = oiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(oiVar.f27078c, canvas2, rectF2, oiVar.d, wiVar.getContainerView(), (int) (alpha * 255.0f));
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
                mz mzVar = (mz) this.f25999b;
                yx yxVar = mzVar.P;
                gh.d.a(yxVar, canvas, rectF, yxVar, mzVar);
                ow owVar = mzVar.f26548h0;
                gh.d.a(owVar, canvas, rectF, owVar, mzVar);
                uw uwVar = mzVar.D0;
                gh.d.a(uwVar, canvas, rectF, uwVar, mzVar);
                return;
            default:
                lv0 lv0Var = (lv0) this.f25999b;
                for (eu0 eu0Var : lv0Var.f26136k0) {
                    ah.n nVar = eu0Var.f24069n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                bs0 bs0Var = lv0Var.V;
                if (bs0Var != null && (w7Var = bs0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
