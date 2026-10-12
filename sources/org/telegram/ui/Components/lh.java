package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class lh implements ch.a {
    public final int f27042a;
    public final Object f27043b;

    public lh(Object obj, int i10) {
        this.f27042a = i10;
        this.f27043b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f27042a) {
            case 0:
            case 1:
            default:
                aVar.f2740a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        ni niVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        ni niVar2;
        di.v7 v7Var;
        switch (this.f27042a) {
            case 0:
                vi viVar = (vi) this.f27043b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        niVar = viVar.B0;
                    } else {
                        niVar = viVar.C0;
                    }
                    if (niVar != null && niVar.f27672c != null && niVar.getVisibility() == 0) {
                        if (i10 == 0 && (niVar2 = viVar.C0) != null && niVar2.getVisibility() == 0) {
                            alpha = (1.0f - viVar.C0.getAlpha()) * niVar.getAlpha();
                        } else {
                            alpha = niVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        hh.d.b(niVar.f27672c, canvas2, rectF2, niVar.d, viVar.getContainerView(), (int) (alpha * 255.0f));
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
                wz wzVar = (wz) this.f27043b;
                iy iyVar = wzVar.P;
                hh.d.a(iyVar, canvas, rectF, iyVar, wzVar);
                yw ywVar = wzVar.f31029h0;
                hh.d.a(ywVar, canvas, rectF, ywVar, wzVar);
                ex exVar = wzVar.D0;
                hh.d.a(exVar, canvas, rectF, exVar, wzVar);
                return;
            default:
                xv0 xv0Var = (xv0) this.f27043b;
                for (qu0 qu0Var : xv0Var.f31364k0) {
                    bh.l lVar = qu0Var.f28679n;
                    if (lVar != null) {
                        lVar.f(canvas, rectF);
                    }
                }
                ns0 ns0Var = xv0Var.V;
                if (ns0Var != null && (v7Var = ns0Var.R) != null) {
                    v7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
