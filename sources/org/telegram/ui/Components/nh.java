package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class nh implements bh.a {
    public final int f29056a;
    public final Object f29057b;

    public nh(Object obj, int i10) {
        this.f29056a = i10;
        this.f29057b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f29056a) {
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
        switch (this.f29056a) {
            case 0:
                yi yiVar = (yi) this.f29057b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        qiVar = yiVar.B0;
                    } else {
                        qiVar = yiVar.C0;
                    }
                    if (qiVar != null && qiVar.f30162c != null && qiVar.getVisibility() == 0) {
                        if (i10 == 0 && (qiVar2 = yiVar.C0) != null && qiVar2.getVisibility() == 0) {
                            alpha = (1.0f - yiVar.C0.getAlpha()) * qiVar.getAlpha();
                        } else {
                            alpha = qiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(qiVar.f30162c, canvas2, rectF2, qiVar.d, yiVar.getContainerView(), (int) (alpha * 255.0f));
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
                b00 b00Var = (b00) this.f29057b;
                ny nyVar = b00Var.P;
                gh.d.a(nyVar, canvas, rectF, nyVar, b00Var);
                dx dxVar = b00Var.f24678h0;
                gh.d.a(dxVar, canvas, rectF, dxVar, b00Var);
                jx jxVar = b00Var.D0;
                gh.d.a(jxVar, canvas, rectF, jxVar, b00Var);
                return;
            default:
                dw0 dw0Var = (dw0) this.f29057b;
                for (wu0 wu0Var : dw0Var.f25711k0) {
                    ah.n nVar = wu0Var.f32743n;
                    if (nVar != null) {
                        nVar.f(canvas, rectF);
                    }
                }
                ts0 ts0Var = dw0Var.V;
                if (ts0Var != null && (w7Var = ts0Var.R) != null) {
                    w7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
