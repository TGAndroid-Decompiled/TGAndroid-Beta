package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class mh implements bh.a {
    public final int f26287a;
    public final Object f26288b;

    public mh(Object obj, int i10) {
        this.f26287a = i10;
        this.f26288b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f26287a) {
            case 0:
            case 1:
            default:
                aVar.f417a = true;
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
        ci.w7 w7Var;
        switch (this.f26287a) {
            case 0:
                xi xiVar = (xi) this.f26288b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        piVar = xiVar.f30331y0;
                    } else {
                        piVar = xiVar.f30334z0;
                    }
                    if (piVar != null && piVar.f27363c != null && piVar.getVisibility() == 0) {
                        if (i10 == 0 && (piVar2 = xiVar.f30334z0) != null && piVar2.getVisibility() == 0) {
                            alpha = (1.0f - xiVar.f30334z0.getAlpha()) * piVar.getAlpha();
                        } else {
                            alpha = piVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(piVar.f27363c, canvas2, rectF2, piVar.d, xiVar.getContainerView(), (int) (alpha * 255.0f));
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
                nz nzVar = (nz) this.f26288b;
                zx zxVar = nzVar.P;
                gh.d.a(zxVar, canvas, rectF, zxVar, nzVar);
                pw pwVar = nzVar.f26833h0;
                gh.d.a(pwVar, canvas, rectF, pwVar, nzVar);
                vw vwVar = nzVar.D0;
                gh.d.a(vwVar, canvas, rectF, vwVar, nzVar);
                return;
            default:
                mv0 mv0Var = (mv0) this.f26288b;
                for (fu0 fu0Var : mv0Var.f26425k0) {
                    ah.n nVar = fu0Var.f24355n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                cs0 cs0Var = mv0Var.V;
                if (cs0Var != null && (w7Var = cs0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
