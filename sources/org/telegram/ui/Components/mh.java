package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class mh implements bh.a {
    public final int f28619a;
    public final Object f28620b;

    public mh(Object obj, int i10) {
        this.f28619a = i10;
        this.f28620b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f28619a) {
            case 0:
            case 1:
            case 2:
            default:
                aVar.f450a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        pi piVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        pi piVar2;
        ci.x7 x7Var;
        switch (this.f28619a) {
            case 0:
                xi xiVar = (xi) this.f28620b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        piVar = xiVar.f32873y0;
                    } else {
                        piVar = xiVar.f32876z0;
                    }
                    if (piVar != null && piVar.f29643c != null && piVar.getVisibility() == 0) {
                        if (i10 == 0 && (piVar2 = xiVar.f32876z0) != null && piVar2.getVisibility() == 0) {
                            alpha = (1.0f - xiVar.f32876z0.getAlpha()) * piVar.getAlpha();
                        } else {
                            alpha = piVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(piVar.f29643c, canvas2, rectF2, piVar.d, xiVar.getContainerView(), (int) (alpha * 255.0f));
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
                nz nzVar = (nz) this.f28620b;
                zx zxVar = nzVar.P;
                gh.d.a(zxVar, canvas, rectF, zxVar, nzVar);
                qw qwVar = nzVar.f29107h0;
                gh.d.a(qwVar, canvas, rectF, qwVar, nzVar);
                vw vwVar = nzVar.D0;
                gh.d.a(vwVar, canvas, rectF, vwVar, nzVar);
                return;
            case 2:
                zq0.n((zq0) this.f28620b, canvas, rectF);
                return;
            default:
                pv0 pv0Var = (pv0) this.f28620b;
                for (iu0 iu0Var : pv0Var.f29776k0) {
                    ah.n nVar = iu0Var.f27500n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                fs0 fs0Var = pv0Var.V;
                if (fs0Var != null && (x7Var = fs0Var.R) != null) {
                    x7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
