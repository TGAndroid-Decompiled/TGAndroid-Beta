package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class jh implements bh.a {
    public final int f25272a;
    public final Object f25273b;

    public jh(Object obj, int i10) {
        this.f25272a = i10;
        this.f25273b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f25272a) {
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
        switch (this.f25272a) {
            case 0:
                vi viVar = (vi) this.f25273b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        niVar = viVar.f28803y0;
                    } else {
                        niVar = viVar.f28806z0;
                    }
                    if (niVar != null && niVar.f26461c != null && niVar.getVisibility() == 0) {
                        if (i10 == 0 && (niVar2 = viVar.f28806z0) != null && niVar2.getVisibility() == 0) {
                            alpha = (1.0f - viVar.f28806z0.getAlpha()) * niVar.getAlpha();
                        } else {
                            alpha = niVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(niVar.f26461c, canvas2, rectF2, niVar.d, viVar.getContainerView(), (int) (alpha * 255.0f));
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
                kz kzVar = (kz) this.f25273b;
                vx vxVar = kzVar.P;
                gh.d.a(vxVar, canvas, rectF, vxVar, kzVar);
                mw mwVar = kzVar.f25728h0;
                gh.d.a(mwVar, canvas, rectF, mwVar, kzVar);
                sw swVar = kzVar.D0;
                gh.d.a(swVar, canvas, rectF, swVar, kzVar);
                return;
            default:
                zu0 zu0Var = (zu0) this.f25273b;
                for (st0 st0Var : zu0Var.f30632k0) {
                    ah.o oVar = st0Var.f27921n;
                    if (oVar != null) {
                        oVar.f(canvas, rectF);
                    }
                }
                or0 or0Var = zu0Var.V;
                if (or0Var != null && (z7Var = or0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
