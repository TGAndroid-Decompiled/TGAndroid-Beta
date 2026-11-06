package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ug implements eh.a {
    public final int f38622a;
    public final Object f38623b;

    public ug(Object obj, int i7) {
        this.f38622a = i7;
        this.f38623b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f38622a) {
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
        switch (this.f38622a) {
            case 0:
                di diVar = (di) this.f38623b;
                int i7 = 0;
                while (i7 < 2) {
                    if (i7 == 0) {
                        vhVar = diVar.f32955s2;
                    } else {
                        vhVar = diVar.f32959t2;
                    }
                    if (vhVar != null && vhVar.f38949c != null && vhVar.getVisibility() == 0) {
                        if (i7 == 0 && (vhVar2 = diVar.f32959t2) != null && vhVar2.getVisibility() == 0) {
                            alpha = (1.0f - diVar.f32959t2.getAlpha()) * vhVar.getAlpha();
                        } else {
                            alpha = vhVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(vhVar.f38949c, canvas2, rectF2, vhVar.d, diVar.f28615b, (int) (alpha * 255.0f));
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
                gy gyVar = (gy) this.f38623b;
                sw swVar = gyVar.P;
                ih.d.a(swVar, canvas, rectF, swVar, gyVar);
                kv kvVar = gyVar.f34039h0;
                ih.d.a(kvVar, canvas, rectF, kvVar, gyVar);
                pv pvVar = gyVar.D0;
                ih.d.a(pvVar, canvas, rectF, pvVar, gyVar);
                return;
            default:
                mo0 mo0Var = (mo0) this.f38623b;
                on0 on0Var = mo0Var.f36027x1;
                ih.d.a(on0Var, canvas, rectF, on0Var, mo0Var.f28615b);
                return;
        }
    }
}
