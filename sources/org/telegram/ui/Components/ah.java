package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ah implements jg.a {
    public final int f26793a;
    public final Object f26794b;

    public ah(Object obj, int i9) {
        this.f26793a = i9;
        this.f26794b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        ci ciVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        ci ciVar2;
        fh.x2 x2Var;
        switch (this.f26793a) {
            case 0:
                ki kiVar = (ki) this.f26794b;
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == 0) {
                        ciVar = kiVar.f30160u0;
                    } else {
                        ciVar = kiVar.f30163v0;
                    }
                    if (ciVar != null && ciVar.f27494c != null && ciVar.getVisibility() == 0) {
                        if (i9 == 0 && (ciVar2 = kiVar.f30163v0) != null && ciVar2.getVisibility() == 0) {
                            alpha = (1.0f - kiVar.f30163v0.getAlpha()) * ciVar.getAlpha();
                        } else {
                            alpha = ciVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        og.d.a(ciVar.f27494c, canvas2, rectF2, ciVar.d, kiVar.getContainerView(), (int) (alpha * 255.0f));
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    }
                    i9++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                return;
            case 1:
                jg.a[] aVarArr = (jg.a[]) this.f26794b;
                for (int i10 = 0; i10 < 3; i10++) {
                    jg.a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                return;
            default:
                eu0 eu0Var = (eu0) this.f26794b;
                for (xs0 xs0Var : eu0Var.f28137g0) {
                    ig.k kVar = xs0Var.f34760n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                vq0 vq0Var = eu0Var.R;
                if (vq0Var != null && (x2Var = vq0Var.N) != null) {
                    x2Var.e(canvas, rectF);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f26793a) {
            case 0:
            case 1:
            default:
                xVar.f7046b = true;
                return;
        }
    }
}
