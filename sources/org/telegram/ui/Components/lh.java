package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class lh implements bh.a {
    public final int f26047a;
    public final Object f26048b;

    public lh(Object obj, int i10) {
        this.f26047a = i10;
        this.f26048b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f26047a) {
            case 0:
            case 1:
            case 2:
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
        ci.x7 x7Var;
        switch (this.f26047a) {
            case 0:
                wi wiVar = (wi) this.f26048b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        oiVar = wiVar.f30023y0;
                    } else {
                        oiVar = wiVar.f30026z0;
                    }
                    if (oiVar != null && oiVar.f27105c != null && oiVar.getVisibility() == 0) {
                        if (i10 == 0 && (oiVar2 = wiVar.f30026z0) != null && oiVar2.getVisibility() == 0) {
                            alpha = (1.0f - wiVar.f30026z0.getAlpha()) * oiVar.getAlpha();
                        } else {
                            alpha = oiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(oiVar.f27105c, canvas2, rectF2, oiVar.d, wiVar.getContainerView(), (int) (alpha * 255.0f));
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
                mz mzVar = (mz) this.f26048b;
                xx xxVar = mzVar.P;
                gh.d.a(xxVar, canvas, rectF, xxVar, mzVar);
                pw pwVar = mzVar.f26589h0;
                gh.d.a(pwVar, canvas, rectF, pwVar, mzVar);
                uw uwVar = mzVar.D0;
                gh.d.a(uwVar, canvas, rectF, uwVar, mzVar);
                return;
            case 2:
                vq0.n((vq0) this.f26048b, canvas, rectF);
                return;
            default:
                lv0 lv0Var = (lv0) this.f26048b;
                for (eu0 eu0Var : lv0Var.f26188k0) {
                    ah.n nVar = eu0Var.f24128n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                bs0 bs0Var = lv0Var.V;
                if (bs0Var != null && (x7Var = bs0Var.R) != null) {
                    x7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
