package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ah implements og.a {
    public final int f23374a;
    public final Object f23375b;

    public ah(Object obj, int i10) {
        this.f23374a = i10;
        this.f23375b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        di diVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        di diVar2;
        kh.n2 n2Var;
        switch (this.f23374a) {
            case 0:
                li liVar = (li) this.f23375b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        diVar = liVar.f26744v0;
                    } else {
                        diVar = liVar.f26748w0;
                    }
                    if (diVar != null && diVar.f24283c != null && diVar.getVisibility() == 0) {
                        if (i10 == 0 && (diVar2 = liVar.f26748w0) != null && diVar2.getVisibility() == 0) {
                            alpha = (1.0f - liVar.f26748w0.getAlpha()) * diVar.getAlpha();
                        } else {
                            alpha = diVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        tg.c.a(diVar.f24283c, canvas2, rectF2, diVar.d, liVar.getContainerView(), (int) (alpha * 255.0f));
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
                og.a[] aVarArr = (og.a[]) this.f23375b;
                for (int i11 = 0; i11 < 3; i11++) {
                    og.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                return;
            default:
                yu0 yu0Var = (yu0) this.f23375b;
                for (qt0 qt0Var : yu0Var.f31131h0) {
                    ng.k kVar = qt0Var.f28260n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                or0 or0Var = yu0Var.S;
                if (or0Var != null && (n2Var = or0Var.O) != null) {
                    n2Var.e(canvas, rectF);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f23374a) {
            case 0:
            case 1:
            default:
                xVar.f6327b = true;
                return;
        }
    }
}
