package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class nh implements bh.a {
    public final int f29159a;
    public final Object f29160b;

    public nh(Object obj, int i10) {
        this.f29159a = i10;
        this.f29160b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f29159a) {
            case 0:
            case 1:
            default:
                aVar.f536a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        qi qiVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        qi qiVar2;
        ci.w7 w7Var;
        switch (this.f29159a) {
            case 0:
                yi yiVar = (yi) this.f29160b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        qiVar = yiVar.B0;
                    } else {
                        qiVar = yiVar.C0;
                    }
                    if (qiVar != null && qiVar.f30174c != null && qiVar.getVisibility() == 0) {
                        if (i10 == 0 && (qiVar2 = yiVar.C0) != null && qiVar2.getVisibility() == 0) {
                            alpha = (1.0f - yiVar.C0.getAlpha()) * qiVar.getAlpha();
                        } else {
                            alpha = qiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(qiVar.f30174c, canvas2, rectF2, qiVar.d, yiVar.getContainerView(), (int) (alpha * 255.0f));
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
                a00 a00Var = (a00) this.f29160b;
                my myVar = a00Var.P;
                gh.d.a(myVar, canvas, rectF, myVar, a00Var);
                cx cxVar = a00Var.f24417h0;
                gh.d.a(cxVar, canvas, rectF, cxVar, a00Var);
                ix ixVar = a00Var.D0;
                gh.d.a(ixVar, canvas, rectF, ixVar, a00Var);
                return;
            default:
                bw0 bw0Var = (bw0) this.f29160b;
                for (uu0 uu0Var : bw0Var.f25142k0) {
                    ah.n nVar = uu0Var.f31624n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                rs0 rs0Var = bw0Var.V;
                if (rs0Var != null && (w7Var = rs0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
