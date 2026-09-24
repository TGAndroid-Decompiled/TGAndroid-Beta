package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class lh implements bh.a {
    public final int f26086a;
    public final Object f26087b;

    public lh(Object obj, int i10) {
        this.f26086a = i10;
        this.f26087b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f26086a) {
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
        switch (this.f26086a) {
            case 0:
                wi wiVar = (wi) this.f26087b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        oiVar = wiVar.f30046y0;
                    } else {
                        oiVar = wiVar.f30049z0;
                    }
                    if (oiVar != null && oiVar.f27084c != null && oiVar.getVisibility() == 0) {
                        if (i10 == 0 && (oiVar2 = wiVar.f30049z0) != null && oiVar2.getVisibility() == 0) {
                            alpha = (1.0f - wiVar.f30049z0.getAlpha()) * oiVar.getAlpha();
                        } else {
                            alpha = oiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(oiVar.f27084c, canvas2, rectF2, oiVar.d, wiVar.getContainerView(), (int) (alpha * 255.0f));
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
                lz lzVar = (lz) this.f26087b;
                xx xxVar = lzVar.P;
                gh.d.a(xxVar, canvas, rectF, xxVar, lzVar);
                ow owVar = lzVar.f26244h0;
                gh.d.a(owVar, canvas, rectF, owVar, lzVar);
                uw uwVar = lzVar.D0;
                gh.d.a(uwVar, canvas, rectF, uwVar, lzVar);
                return;
            default:
                jv0 jv0Var = (jv0) this.f26087b;
                for (cu0 cu0Var : jv0Var.f25519k0) {
                    ah.n nVar = cu0Var.f23388n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                zr0 zr0Var = jv0Var.V;
                if (zr0Var != null && (w7Var = zr0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
