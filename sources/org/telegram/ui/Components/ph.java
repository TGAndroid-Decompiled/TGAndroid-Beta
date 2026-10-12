package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ph implements bh.a {
    public final int f29501a;
    public final Object f29502b;

    public ph(Object obj, int i10) {
        this.f29501a = i10;
        this.f29502b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f29501a) {
            case 0:
            case 1:
            default:
                aVar.f538a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        si siVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        si siVar2;
        ci.w7 w7Var;
        switch (this.f29501a) {
            case 0:
                aj ajVar = (aj) this.f29502b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        siVar = ajVar.B0;
                    } else {
                        siVar = ajVar.C0;
                    }
                    if (siVar != null && siVar.f30575c != null && siVar.getVisibility() == 0) {
                        if (i10 == 0 && (siVar2 = ajVar.C0) != null && siVar2.getVisibility() == 0) {
                            alpha = (1.0f - ajVar.C0.getAlpha()) * siVar.getAlpha();
                        } else {
                            alpha = siVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(siVar.f30575c, canvas2, rectF2, siVar.d, ajVar.getContainerView(), (int) (alpha * 255.0f));
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
                d00 d00Var = (d00) this.f29502b;
                py pyVar = d00Var.P;
                gh.d.a(pyVar, canvas, rectF, pyVar, d00Var);
                fx fxVar = d00Var.f25096h0;
                gh.d.a(fxVar, canvas, rectF, fxVar, d00Var);
                lx lxVar = d00Var.D0;
                gh.d.a(lxVar, canvas, rectF, lxVar, d00Var);
                return;
            default:
                hw0 hw0Var = (hw0) this.f29502b;
                for (av0 av0Var : hw0Var.f26948k0) {
                    ah.n nVar = av0Var.f24499n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                xs0 xs0Var = hw0Var.V;
                if (xs0Var != null && (w7Var = xs0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
