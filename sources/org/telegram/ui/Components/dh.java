package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class dh implements mg.a {
    public final int f27765a;
    public final Object f27766b;

    public dh(Object obj, int i10) {
        this.f27765a = i10;
        this.f27766b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        fi fiVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        fi fiVar2;
        ih.o2 o2Var;
        switch (this.f27765a) {
            case 0:
                ni niVar = (ni) this.f27766b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        fiVar = niVar.f31051u0;
                    } else {
                        fiVar = niVar.f31054v0;
                    }
                    if (fiVar != null && fiVar.f28404c != null && fiVar.getVisibility() == 0) {
                        if (i10 == 0 && (fiVar2 = niVar.f31054v0) != null && fiVar2.getVisibility() == 0) {
                            alpha = (1.0f - niVar.f31054v0.getAlpha()) * fiVar.getAlpha();
                        } else {
                            alpha = fiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        rg.c.a(fiVar.f28404c, canvas2, rectF2, fiVar.d, niVar.getContainerView(), (int) (alpha * 255.0f));
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
                mg.a[] aVarArr = (mg.a[]) this.f27766b;
                for (int i11 = 0; i11 < 3; i11++) {
                    mg.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                return;
            default:
                qu0 qu0Var = (qu0) this.f27766b;
                for (it0 it0Var : qu0Var.f32070g0) {
                    lg.k kVar = it0Var.f29468n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                gr0 gr0Var = qu0Var.R;
                if (gr0Var != null && (o2Var = gr0Var.N) != null) {
                    o2Var.e(canvas, rectF);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f27765a) {
            case 0:
            case 1:
            default:
                xVar.f6956b = true;
                return;
        }
    }
}
