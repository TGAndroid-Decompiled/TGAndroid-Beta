package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ug implements eh.a {
    public final int f38633a;
    public final Object f38634b;

    public ug(Object obj, int i7) {
        this.f38633a = i7;
        this.f38634b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f38633a) {
            case 0:
            case 1:
            default:
                aVar.f8700a = true;
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
        switch (this.f38633a) {
            case 0:
                di diVar = (di) this.f38634b;
                int i7 = 0;
                while (i7 < 2) {
                    if (i7 == 0) {
                        vhVar = diVar.f32992s2;
                    } else {
                        vhVar = diVar.f32996t2;
                    }
                    if (vhVar != null && vhVar.f39005c != null && vhVar.getVisibility() == 0) {
                        if (i7 == 0 && (vhVar2 = diVar.f32996t2) != null && vhVar2.getVisibility() == 0) {
                            alpha = (1.0f - diVar.f32996t2.getAlpha()) * vhVar.getAlpha();
                        } else {
                            alpha = vhVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(vhVar.f39005c, canvas2, rectF2, vhVar.d, diVar.f28619b, (int) (alpha * 255.0f));
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
                hy hyVar = (hy) this.f38634b;
                tw twVar = hyVar.P;
                ih.d.a(twVar, canvas, rectF, twVar, hyVar);
                lv lvVar = hyVar.f34415h0;
                ih.d.a(lvVar, canvas, rectF, lvVar, hyVar);
                qv qvVar = hyVar.D0;
                ih.d.a(qvVar, canvas, rectF, qvVar, hyVar);
                return;
            default:
                mo0 mo0Var = (mo0) this.f38634b;
                on0 on0Var = mo0Var.f36071x1;
                ih.d.a(on0Var, canvas, rectF, on0Var, mo0Var.f28619b);
                return;
        }
    }
}
