package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class kh implements eh.a {
    public final int f36910a;
    public final Object f36911b;

    public kh(Object obj, int i7) {
        this.f36910a = i7;
        this.f36911b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f36910a) {
            case 0:
            case 1:
            default:
                aVar.f8401a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        mi miVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        mi miVar2;
        switch (this.f36910a) {
            case 0:
                ui uiVar = (ui) this.f36911b;
                int i7 = 0;
                while (i7 < 2) {
                    if (i7 == 0) {
                        miVar = uiVar.f40440w2;
                    } else {
                        miVar = uiVar.f40444x2;
                    }
                    if (miVar != null && miVar.f37520c != null && miVar.getVisibility() == 0) {
                        if (i7 == 0 && (miVar2 = uiVar.f40444x2) != null && miVar2.getVisibility() == 0) {
                            alpha = (1.0f - uiVar.f40444x2.getAlpha()) * miVar.getAlpha();
                        } else {
                            alpha = miVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(miVar.f37520c, canvas2, rectF2, miVar.d, uiVar.f30176b, (int) (alpha * 255.0f));
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
                ty tyVar = (ty) this.f36911b;
                gx gxVar = tyVar.Q;
                ih.d.a(gxVar, canvas, rectF, gxVar, tyVar);
                yv yvVar = tyVar.f40106i0;
                ih.d.a(yvVar, canvas, rectF, yvVar, tyVar);
                dw dwVar = tyVar.E0;
                ih.d.a(dwVar, canvas, rectF, dwVar, tyVar);
                return;
            default:
                ap0 ap0Var = (ap0) this.f36911b;
                co0 co0Var = ap0Var.B1;
                ih.d.a(co0Var, canvas, rectF, co0Var, ap0Var.f30176b);
                return;
        }
    }
}
