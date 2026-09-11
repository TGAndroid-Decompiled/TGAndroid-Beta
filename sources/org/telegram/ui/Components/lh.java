package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class lh implements ch.a {
    public final int f28173a;
    public final Object f28174b;

    public lh(Object obj, int i10) {
        this.f28173a = i10;
        this.f28174b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f28173a) {
            case 0:
            case 1:
            default:
                aVar.f2648a = true;
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
        di.z7 z7Var;
        switch (this.f28173a) {
            case 0:
                vi viVar = (vi) this.f28174b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        niVar = viVar.f31340y0;
                    } else {
                        niVar = viVar.f31343z0;
                    }
                    if (niVar != null && niVar.f28754c != null && niVar.getVisibility() == 0) {
                        if (i10 == 0 && (niVar2 = viVar.f31343z0) != null && niVar2.getVisibility() == 0) {
                            alpha = (1.0f - viVar.f31343z0.getAlpha()) * niVar.getAlpha();
                        } else {
                            alpha = niVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        hh.d.a(niVar.f28754c, canvas2, rectF2, niVar.d, viVar.getContainerView(), (int) (alpha * 255.0f));
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
                ch.a[] aVarArr = (ch.a[]) this.f28174b;
                for (int i11 = 0; i11 < 3; i11++) {
                    ch.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.f(canvas, rectF);
                    }
                }
                return;
            default:
                xu0 xu0Var = (xu0) this.f28174b;
                for (qt0 qt0Var : xu0Var.f32702k0) {
                    bh.l lVar = qt0Var.f29820n;
                    if (lVar != null) {
                        lVar.f(canvas, rectF);
                    }
                }
                nr0 nr0Var = xu0Var.V;
                if (nr0Var != null && (z7Var = nr0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
