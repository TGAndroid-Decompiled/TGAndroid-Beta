package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class mh implements bh.a {
    public final int f28704a;
    public final Object f28705b;

    public mh(Object obj, int i10) {
        this.f28704a = i10;
        this.f28705b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f28704a) {
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
        switch (this.f28704a) {
            case 0:
                xi xiVar = (xi) this.f28705b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        piVar = xiVar.f32971y0;
                    } else {
                        piVar = xiVar.f32974z0;
                    }
                    if (piVar != null && piVar.f29742c != null && piVar.getVisibility() == 0) {
                        if (i10 == 0 && (piVar2 = xiVar.f32974z0) != null && piVar2.getVisibility() == 0) {
                            alpha = (1.0f - xiVar.f32974z0.getAlpha()) * piVar.getAlpha();
                        } else {
                            alpha = piVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(piVar.f29742c, canvas2, rectF2, piVar.d, xiVar.getContainerView(), (int) (alpha * 255.0f));
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
                nz nzVar = (nz) this.f28705b;
                zx zxVar = nzVar.P;
                gh.d.a(zxVar, canvas, rectF, zxVar, nzVar);
                qw qwVar = nzVar.f29210h0;
                gh.d.a(qwVar, canvas, rectF, qwVar, nzVar);
                vw vwVar = nzVar.D0;
                gh.d.a(vwVar, canvas, rectF, vwVar, nzVar);
                return;
            case 2:
                br0.n((br0) this.f28705b, canvas, rectF);
                return;
            default:
                qv0 qv0Var = (qv0) this.f28705b;
                for (ju0 ju0Var : qv0Var.f30239k0) {
                    ah.n nVar = ju0Var.f27976n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                gs0 gs0Var = qv0Var.V;
                if (gs0Var != null && (x7Var = gs0Var.R) != null) {
                    x7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
