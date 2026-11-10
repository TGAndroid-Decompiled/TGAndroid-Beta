package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class tg implements eh.a {
    public final int f38305a;
    public final Object f38306b;

    public tg(Object obj, int i7) {
        this.f38305a = i7;
        this.f38306b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f38305a) {
            case 0:
            case 1:
            default:
                aVar.f8703a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        uh uhVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        uh uhVar2;
        switch (this.f38305a) {
            case 0:
                ci ciVar = (ci) this.f38306b;
                int i7 = 0;
                while (i7 < 2) {
                    if (i7 == 0) {
                        uhVar = ciVar.f32660v2;
                    } else {
                        uhVar = ciVar.f32664w2;
                    }
                    if (uhVar != null && uhVar.f38657c != null && uhVar.getVisibility() == 0) {
                        if (i7 == 0 && (uhVar2 = ciVar.f32664w2) != null && uhVar2.getVisibility() == 0) {
                            alpha = (1.0f - ciVar.f32664w2.getAlpha()) * uhVar.getAlpha();
                        } else {
                            alpha = uhVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(uhVar.f38657c, canvas2, rectF2, uhVar.d, ciVar.f28672b, (int) (alpha * 255.0f));
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
                gy gyVar = (gy) this.f38306b;
                sw swVar = gyVar.P;
                ih.d.a(swVar, canvas, rectF, swVar, gyVar);
                kv kvVar = gyVar.f34031h0;
                ih.d.a(kvVar, canvas, rectF, kvVar, gyVar);
                pv pvVar = gyVar.D0;
                ih.d.a(pvVar, canvas, rectF, pvVar, gyVar);
                return;
            default:
                mo0 mo0Var = (mo0) this.f38306b;
                on0 on0Var = mo0Var.A1;
                ih.d.a(on0Var, canvas, rectF, on0Var, mo0Var.f28672b);
                return;
        }
    }
}
