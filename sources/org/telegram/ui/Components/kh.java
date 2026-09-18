package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class kh implements bh.a {
    public final int f25723a;
    public final Object f25724b;

    public kh(Object obj, int i10) {
        this.f25723a = i10;
        this.f25724b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f25723a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ni niVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        ni niVar2;
        ci.z7 z7Var;
        switch (this.f25723a) {
            case 0:
                vi viVar = (vi) this.f25724b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        niVar = viVar.f29082y0;
                    } else {
                        niVar = viVar.f29085z0;
                    }
                    if (niVar != null && niVar.f26689c != null && niVar.getVisibility() == 0) {
                        if (i10 == 0 && (niVar2 = viVar.f29085z0) != null && niVar2.getVisibility() == 0) {
                            alpha = (1.0f - viVar.f29085z0.getAlpha()) * niVar.getAlpha();
                        } else {
                            alpha = niVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(niVar.f26689c, canvas2, rectF2, niVar.d, viVar.getContainerView(), (int) (alpha * 255.0f));
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
                kz kzVar = (kz) this.f25724b;
                wx wxVar = kzVar.P;
                gh.d.a(wxVar, canvas, rectF, wxVar, kzVar);
                mw mwVar = kzVar.f25907h0;
                gh.d.a(mwVar, canvas, rectF, mwVar, kzVar);
                sw swVar = kzVar.D0;
                gh.d.a(swVar, canvas, rectF, swVar, kzVar);
                return;
            default:
                kv0 kv0Var = (kv0) this.f25724b;
                for (du0 du0Var : kv0Var.f25824k0) {
                    ah.o oVar = du0Var.f23684n;
                    if (oVar != null) {
                        oVar.f(canvas, rectF);
                    }
                }
                zr0 zr0Var = kv0Var.V;
                if (zr0Var != null && (z7Var = zr0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
