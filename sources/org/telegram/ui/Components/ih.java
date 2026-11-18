package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ih implements eh.a {
    public final int f36126a;
    public final Object f36127b;

    public ih(Object obj, int i7) {
        this.f36126a = i7;
        this.f36127b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f36126a) {
            case 0:
            case 1:
            default:
                aVar.f8369a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        ki kiVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        ki kiVar2;
        switch (this.f36126a) {
            case 0:
                si siVar = (si) this.f36127b;
                int i7 = 0;
                while (i7 < 2) {
                    if (i7 == 0) {
                        kiVar = siVar.f39732w2;
                    } else {
                        kiVar = siVar.f39736x2;
                    }
                    if (kiVar != null && kiVar.f36767c != null && kiVar.getVisibility() == 0) {
                        if (i7 == 0 && (kiVar2 = siVar.f39736x2) != null && kiVar2.getVisibility() == 0) {
                            alpha = (1.0f - siVar.f39736x2.getAlpha()) * kiVar.getAlpha();
                        } else {
                            alpha = kiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(kiVar.f36767c, canvas2, rectF2, kiVar.d, siVar.f30190b, (int) (alpha * 255.0f));
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    }
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                return;
            case 1:
                ry ryVar = (ry) this.f36127b;
                ex exVar = ryVar.Q;
                ih.d.a(exVar, canvas, rectF, exVar, ryVar);
                vv vvVar = ryVar.f39360i0;
                ih.d.a(vvVar, canvas, rectF, vvVar, ryVar);
                aw awVar = ryVar.E0;
                ih.d.a(awVar, canvas, rectF, awVar, ryVar);
                return;
            default:
                yo0 yo0Var = (yo0) this.f36127b;
                ao0 ao0Var = yo0Var.B1;
                ih.d.a(ao0Var, canvas, rectF, ao0Var, yo0Var.f30190b);
                return;
        }
    }
}
