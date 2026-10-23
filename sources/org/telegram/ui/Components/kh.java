package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class kh implements ch.a {
    public final int f27879a;
    public final Object f27880b;

    public kh(Object obj, int i10) {
        this.f27879a = i10;
        this.f27880b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f27879a) {
            case 0:
            case 1:
            default:
                aVar.f4353a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        li liVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        li liVar2;
        ei.m7 m7Var;
        switch (this.f27879a) {
            case 0:
                ti tiVar = (ti) this.f27880b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        liVar = tiVar.B0;
                    } else {
                        liVar = tiVar.C0;
                    }
                    if (liVar != null && liVar.f28178c != null && liVar.getVisibility() == 0) {
                        if (i10 == 0 && (liVar2 = tiVar.C0) != null && liVar2.getVisibility() == 0) {
                            alpha = (1.0f - tiVar.C0.getAlpha()) * liVar.getAlpha();
                        } else {
                            alpha = liVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        hh.d.b(liVar.f28178c, canvas2, rectF2, liVar.d, tiVar.getContainerView(), (int) (alpha * 255.0f));
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
                tz tzVar = (tz) this.f27880b;
                ey eyVar = tzVar.P;
                hh.d.a(eyVar, canvas, rectF, eyVar, tzVar);
                uw uwVar = tzVar.f30742h0;
                hh.d.a(uwVar, canvas, rectF, uwVar, tzVar);
                ax axVar = tzVar.D0;
                hh.d.a(axVar, canvas, rectF, axVar, tzVar);
                return;
            default:
                uv0 uv0Var = (uv0) this.f27880b;
                for (nu0 nu0Var : uv0Var.f31051k0) {
                    bh.l lVar = nu0Var.f28884n;
                    if (lVar != null) {
                        lVar.f(canvas, rectF);
                    }
                }
                ks0 ks0Var = uv0Var.V;
                if (ks0Var != null && (m7Var = ks0Var.R) != null) {
                    m7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
