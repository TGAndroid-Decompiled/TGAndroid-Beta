package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class kh implements bh.a {
    public final int f25600a;
    public final Object f25601b;

    public kh(Object obj, int i10) {
        this.f25600a = i10;
        this.f25601b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f25600a) {
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
        switch (this.f25600a) {
            case 0:
                wi wiVar = (wi) this.f25601b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        oiVar = wiVar.f29726y0;
                    } else {
                        oiVar = wiVar.f29729z0;
                    }
                    if (oiVar != null && oiVar.f26745c != null && oiVar.getVisibility() == 0) {
                        if (i10 == 0 && (oiVar2 = wiVar.f29729z0) != null && oiVar2.getVisibility() == 0) {
                            alpha = (1.0f - wiVar.f29729z0.getAlpha()) * oiVar.getAlpha();
                        } else {
                            alpha = oiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(oiVar.f26745c, canvas2, rectF2, oiVar.d, wiVar.getContainerView(), (int) (alpha * 255.0f));
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
                lz lzVar = (lz) this.f25601b;
                wx wxVar = lzVar.P;
                gh.d.a(wxVar, canvas, rectF, wxVar, lzVar);
                nw nwVar = lzVar.f25983h0;
                gh.d.a(nwVar, canvas, rectF, nwVar, lzVar);
                tw twVar = lzVar.D0;
                gh.d.a(twVar, canvas, rectF, twVar, lzVar);
                return;
            default:
                yu0 yu0Var = (yu0) this.f25601b;
                for (rt0 rt0Var : yu0Var.f30426k0) {
                    ah.n nVar = rt0Var.f27727n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                nr0 nr0Var = yu0Var.V;
                if (nr0Var != null && (w7Var = nr0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
