package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class kh implements ch.a {
    public final int f27851a;
    public final Object f27852b;

    public kh(Object obj, int i10) {
        this.f27851a = i10;
        this.f27852b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f27851a) {
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
        switch (this.f27851a) {
            case 0:
                ti tiVar = (ti) this.f27852b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        liVar = tiVar.B0;
                    } else {
                        liVar = tiVar.C0;
                    }
                    if (liVar != null && liVar.f28224c != null && liVar.getVisibility() == 0) {
                        if (i10 == 0 && (liVar2 = tiVar.C0) != null && liVar2.getVisibility() == 0) {
                            alpha = (1.0f - tiVar.C0.getAlpha()) * liVar.getAlpha();
                        } else {
                            alpha = liVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        hh.d.b(liVar.f28224c, canvas2, rectF2, liVar.d, tiVar.getContainerView(), (int) (alpha * 255.0f));
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
                tz tzVar = (tz) this.f27852b;
                ey eyVar = tzVar.P;
                hh.d.a(eyVar, canvas, rectF, eyVar, tzVar);
                uw uwVar = tzVar.f30783h0;
                hh.d.a(uwVar, canvas, rectF, uwVar, tzVar);
                ax axVar = tzVar.D0;
                hh.d.a(axVar, canvas, rectF, axVar, tzVar);
                return;
            default:
                tv0 tv0Var = (tv0) this.f27852b;
                for (mu0 mu0Var : tv0Var.f30708k0) {
                    bh.l lVar = mu0Var.f28608n;
                    if (lVar != null) {
                        lVar.f(canvas, rectF);
                    }
                }
                js0 js0Var = tv0Var.V;
                if (js0Var != null && (m7Var = js0Var.R) != null) {
                    m7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
