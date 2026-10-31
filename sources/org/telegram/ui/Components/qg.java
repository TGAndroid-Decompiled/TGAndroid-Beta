package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class qg implements ug.a {
    public final int f29647a;
    public final Object f29648b;

    public qg(Object obj, int i10) {
        this.f29647a = i10;
        this.f29648b = obj;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        uh uhVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        uh uhVar2;
        switch (this.f29647a) {
            case 0:
                bi biVar = (bi) this.f29648b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        uhVar = biVar.f24721s2;
                    } else {
                        uhVar = biVar.f24725t2;
                    }
                    if (uhVar != null && uhVar.f30948c != null && uhVar.getVisibility() == 0) {
                        if (i10 == 0 && (uhVar2 = biVar.f24725t2) != null && uhVar2.getVisibility() == 0) {
                            alpha = (1.0f - biVar.f24725t2.getAlpha()) * uhVar.getAlpha();
                        } else {
                            alpha = uhVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        yg.d.b(uhVar.f30948c, canvas2, rectF2, uhVar.d, biVar.f21586b, (int) (alpha * 255.0f));
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
                vy vyVar = (vy) this.f29648b;
                hx hxVar = vyVar.P;
                yg.d.a(hxVar, canvas, rectF, hxVar, vyVar);
                wv wvVar = vyVar.f31880h0;
                yg.d.a(wvVar, canvas, rectF, wvVar, vyVar);
                bw bwVar = vyVar.D0;
                yg.d.a(bwVar, canvas, rectF, bwVar, vyVar);
                return;
            default:
                op0 op0Var = (op0) this.f29648b;
                oo0 oo0Var = op0Var.f29149x1;
                yg.d.a(oo0Var, canvas, rectF, oo0Var, op0Var.f21586b);
                return;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f29647a) {
            case 0:
            case 1:
            default:
                yVar.f7258b = true;
                return;
        }
    }
}
