package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class lh implements bh.a {
    public final int f25997a;
    public final Object f25998b;

    public lh(Object obj, int i10) {
        this.f25997a = i10;
        this.f25998b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f25997a) {
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
        switch (this.f25997a) {
            case 0:
                wi wiVar = (wi) this.f25998b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        oiVar = wiVar.f30003y0;
                    } else {
                        oiVar = wiVar.f30006z0;
                    }
                    if (oiVar != null && oiVar.f27077c != null && oiVar.getVisibility() == 0) {
                        if (i10 == 0 && (oiVar2 = wiVar.f30006z0) != null && oiVar2.getVisibility() == 0) {
                            alpha = (1.0f - wiVar.f30006z0.getAlpha()) * oiVar.getAlpha();
                        } else {
                            alpha = oiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(oiVar.f27077c, canvas2, rectF2, oiVar.d, wiVar.getContainerView(), (int) (alpha * 255.0f));
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
                mz mzVar = (mz) this.f25998b;
                yx yxVar = mzVar.P;
                gh.d.a(yxVar, canvas, rectF, yxVar, mzVar);
                ow owVar = mzVar.f26547h0;
                gh.d.a(owVar, canvas, rectF, owVar, mzVar);
                uw uwVar = mzVar.D0;
                gh.d.a(uwVar, canvas, rectF, uwVar, mzVar);
                return;
            default:
                lv0 lv0Var = (lv0) this.f25998b;
                for (eu0 eu0Var : lv0Var.f26135k0) {
                    ah.n nVar = eu0Var.f24068n;
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
