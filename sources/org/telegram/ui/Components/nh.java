package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class nh implements bh.a {
    public final int f29164a;
    public final Object f29165b;

    public nh(Object obj, int i10) {
        this.f29164a = i10;
        this.f29165b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f29164a) {
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
        switch (this.f29164a) {
            case 0:
                yi yiVar = (yi) this.f29165b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        qiVar = yiVar.B0;
                    } else {
                        qiVar = yiVar.C0;
                    }
                    if (qiVar != null && qiVar.f30246c != null && qiVar.getVisibility() == 0) {
                        if (i10 == 0 && (qiVar2 = yiVar.C0) != null && qiVar2.getVisibility() == 0) {
                            alpha = (1.0f - yiVar.C0.getAlpha()) * qiVar.getAlpha();
                        } else {
                            alpha = qiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(qiVar.f30246c, canvas2, rectF2, qiVar.d, yiVar.getContainerView(), (int) (alpha * 255.0f));
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
                b00 b00Var = (b00) this.f29165b;
                ny nyVar = b00Var.P;
                gh.d.a(nyVar, canvas, rectF, nyVar, b00Var);
                dx dxVar = b00Var.f24747h0;
                gh.d.a(dxVar, canvas, rectF, dxVar, b00Var);
                jx jxVar = b00Var.D0;
                gh.d.a(jxVar, canvas, rectF, jxVar, b00Var);
                return;
            default:
                cw0 cw0Var = (cw0) this.f29165b;
                for (vu0 vu0Var : cw0Var.f25512k0) {
                    ah.n nVar = vu0Var.f32555n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                ss0 ss0Var = cw0Var.V;
                if (ss0Var != null && (w7Var = ss0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
