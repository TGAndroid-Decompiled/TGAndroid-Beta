package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class jh implements bh.a {
    public final int f25347a;
    public final Object f25348b;

    public jh(Object obj, int i10) {
        this.f25347a = i10;
        this.f25348b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f25347a) {
            case 0:
            case 1:
            default:
                aVar.f415a = true;
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
        switch (this.f25347a) {
            case 0:
                vi viVar = (vi) this.f25348b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        niVar = viVar.f28811y0;
                    } else {
                        niVar = viVar.f28814z0;
                    }
                    if (niVar != null && niVar.f26463c != null && niVar.getVisibility() == 0) {
                        if (i10 == 0 && (niVar2 = viVar.f28814z0) != null && niVar2.getVisibility() == 0) {
                            alpha = (1.0f - viVar.f28814z0.getAlpha()) * niVar.getAlpha();
                        } else {
                            alpha = niVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(niVar.f26463c, canvas2, rectF2, niVar.d, viVar.getContainerView(), (int) (alpha * 255.0f));
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
                kz kzVar = (kz) this.f25348b;
                vx vxVar = kzVar.P;
                gh.d.a(vxVar, canvas, rectF, vxVar, kzVar);
                mw mwVar = kzVar.f25718h0;
                gh.d.a(mwVar, canvas, rectF, mwVar, kzVar);
                sw swVar = kzVar.D0;
                gh.d.a(swVar, canvas, rectF, swVar, kzVar);
                return;
            default:
                yu0 yu0Var = (yu0) this.f25348b;
                for (rt0 rt0Var : yu0Var.f30368k0) {
                    ah.n nVar = rt0Var.f27687n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                nr0 nr0Var = yu0Var.V;
                if (nr0Var != null && (z7Var = nr0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
