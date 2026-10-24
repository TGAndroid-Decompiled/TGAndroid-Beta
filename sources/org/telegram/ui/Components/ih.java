package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ih implements ch.a {
    public final int f27425a;
    public final Object f27426b;

    public ih(Object obj, int i10) {
        this.f27425a = i10;
        this.f27426b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f27425a) {
            case 0:
            case 1:
            default:
                aVar.f4360a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ji jiVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        ji jiVar2;
        ei.m7 m7Var;
        switch (this.f27425a) {
            case 0:
                ri riVar = (ri) this.f27426b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        jiVar = riVar.B0;
                    } else {
                        jiVar = riVar.C0;
                    }
                    if (jiVar != null && jiVar.f27705c != null && jiVar.getVisibility() == 0) {
                        if (i10 == 0 && (jiVar2 = riVar.C0) != null && jiVar2.getVisibility() == 0) {
                            alpha = (1.0f - riVar.C0.getAlpha()) * jiVar.getAlpha();
                        } else {
                            alpha = jiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        hh.d.b(jiVar.f27705c, canvas2, rectF2, jiVar.d, riVar.getContainerView(), (int) (alpha * 255.0f));
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
                rz rzVar = (rz) this.f27426b;
                cy cyVar = rzVar.P;
                hh.d.a(cyVar, canvas, rectF, cyVar, rzVar);
                sw swVar = rzVar.f30325h0;
                hh.d.a(swVar, canvas, rectF, swVar, rzVar);
                yw ywVar = rzVar.D0;
                hh.d.a(ywVar, canvas, rectF, ywVar, rzVar);
                return;
            default:
                wv0 wv0Var = (wv0) this.f27426b;
                for (pu0 pu0Var : wv0Var.f32386k0) {
                    bh.l lVar = pu0Var.f29676n;
                    if (lVar != null) {
                        lVar.f(canvas, rectF);
                    }
                }
                ms0 ms0Var = wv0Var.V;
                if (ms0Var != null && (m7Var = ms0Var.S) != null) {
                    m7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
