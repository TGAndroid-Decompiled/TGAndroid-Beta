package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class kh implements bh.a {
    public final int f25777a;
    public final Object f25778b;

    public kh(Object obj, int i10) {
        this.f25777a = i10;
        this.f25778b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f25777a) {
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
        switch (this.f25777a) {
            case 0:
                vi viVar = (vi) this.f25778b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        niVar = viVar.f29159y0;
                    } else {
                        niVar = viVar.f29162z0;
                    }
                    if (niVar != null && niVar.f26656c != null && niVar.getVisibility() == 0) {
                        if (i10 == 0 && (niVar2 = viVar.f29162z0) != null && niVar2.getVisibility() == 0) {
                            alpha = (1.0f - viVar.f29162z0.getAlpha()) * niVar.getAlpha();
                        } else {
                            alpha = niVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(niVar.f26656c, canvas2, rectF2, niVar.d, viVar.getContainerView(), (int) (alpha * 255.0f));
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
                kz kzVar = (kz) this.f25778b;
                wx wxVar = kzVar.P;
                gh.d.a(wxVar, canvas, rectF, wxVar, kzVar);
                nw nwVar = kzVar.f25913h0;
                gh.d.a(nwVar, canvas, rectF, nwVar, kzVar);
                tw twVar = kzVar.D0;
                gh.d.a(twVar, canvas, rectF, twVar, kzVar);
                return;
            default:
                jv0 jv0Var = (jv0) this.f25778b;
                for (cu0 cu0Var : jv0Var.f25504k0) {
                    ah.o oVar = cu0Var.f23406n;
                    if (oVar != null) {
                        oVar.f(canvas, rectF);
                    }
                }
                yr0 yr0Var = jv0Var.V;
                if (yr0Var != null && (z7Var = yr0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
