package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ug implements eh.a {
    public final int f38717a;
    public final Object f38718b;

    public ug(Object obj, int i7) {
        this.f38717a = i7;
        this.f38718b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f38717a) {
            case 0:
            case 1:
            default:
                aVar.f8698a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        vh vhVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        vh vhVar2;
        switch (this.f38717a) {
            case 0:
                di diVar = (di) this.f38718b;
                int i7 = 0;
                while (i7 < 2) {
                    if (i7 == 0) {
                        vhVar = diVar.f33047s2;
                    } else {
                        vhVar = diVar.f33051t2;
                    }
                    if (vhVar != null && vhVar.f39072c != null && vhVar.getVisibility() == 0) {
                        if (i7 == 0 && (vhVar2 = diVar.f33051t2) != null && vhVar2.getVisibility() == 0) {
                            alpha = (1.0f - diVar.f33051t2.getAlpha()) * vhVar.getAlpha();
                        } else {
                            alpha = vhVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(vhVar.f39072c, canvas2, rectF2, vhVar.d, diVar.f28624b, (int) (alpha * 255.0f));
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
                hy hyVar = (hy) this.f38718b;
                tw twVar = hyVar.P;
                ih.d.a(twVar, canvas, rectF, twVar, hyVar);
                lv lvVar = hyVar.f34430h0;
                ih.d.a(lvVar, canvas, rectF, lvVar, hyVar);
                qv qvVar = hyVar.D0;
                ih.d.a(qvVar, canvas, rectF, qvVar, hyVar);
                return;
            default:
                no0 no0Var = (no0) this.f38718b;
                pn0 pn0Var = no0Var.f36465x1;
                ih.d.a(pn0Var, canvas, rectF, pn0Var, no0Var.f28624b);
                return;
        }
    }
}
