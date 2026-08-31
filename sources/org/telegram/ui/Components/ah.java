package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ah implements pg.a {
    public final int f25262a;
    public final Object f25263b;

    public ah(Object obj, int i10) {
        this.f25262a = i10;
        this.f25263b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        ei eiVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        ei eiVar2;
        lh.n2 n2Var;
        switch (this.f25262a) {
            case 0:
                mi miVar = (mi) this.f25263b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        eiVar = miVar.f29100v0;
                    } else {
                        eiVar = miVar.f29104w0;
                    }
                    if (eiVar != null && eiVar.f26547c != null && eiVar.getVisibility() == 0) {
                        if (i10 == 0 && (eiVar2 = miVar.f29104w0) != null && eiVar2.getVisibility() == 0) {
                            alpha = (1.0f - miVar.f29104w0.getAlpha()) * eiVar.getAlpha();
                        } else {
                            alpha = eiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ug.c.a(eiVar.f26547c, canvas2, rectF2, eiVar.d, miVar.getContainerView(), (int) (alpha * 255.0f));
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
                pg.a[] aVarArr = (pg.a[]) this.f25263b;
                for (int i11 = 0; i11 < 3; i11++) {
                    pg.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                return;
            default:
                zu0 zu0Var = (zu0) this.f25263b;
                for (rt0 rt0Var : zu0Var.f33980h0) {
                    og.k kVar = rt0Var.f30849n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                pr0 pr0Var = zu0Var.S;
                if (pr0Var != null && (n2Var = pr0Var.O) != null) {
                    n2Var.e(canvas, rectF);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f25262a) {
            case 0:
            case 1:
            default:
                xVar.f6800b = true;
                return;
        }
    }
}
