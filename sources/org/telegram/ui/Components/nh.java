package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class nh implements ah.a {
    public final int f25512a;
    public final Object f25513b;

    public nh(Object obj, int i10) {
        this.f25512a = i10;
        this.f25513b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        qi qiVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        qi qiVar2;
        bi.a9 a9Var;
        switch (this.f25512a) {
            case 0:
                yi yiVar = (yi) this.f25513b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        qiVar = yiVar.f29427y0;
                    } else {
                        qiVar = yiVar.f29430z0;
                    }
                    if (qiVar != null && qiVar.f26423c != null && qiVar.getVisibility() == 0) {
                        if (i10 == 0 && (qiVar2 = yiVar.f29430z0) != null && qiVar2.getVisibility() == 0) {
                            alpha = (1.0f - yiVar.f29430z0.getAlpha()) * qiVar.getAlpha();
                        } else {
                            alpha = qiVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        fh.d.a(qiVar.f26423c, canvas2, rectF2, qiVar.d, yiVar.getContainerView(), (int) (alpha * 255.0f));
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
                ah.a[] aVarArr = (ah.a[]) this.f25513b;
                for (int i11 = 0; i11 < 3; i11++) {
                    ah.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                return;
            default:
                iv0 iv0Var = (iv0) this.f25513b;
                for (au0 au0Var : iv0Var.f24107k0) {
                    zg.k kVar = au0Var.f21594n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                wr0 wr0Var = iv0Var.V;
                if (wr0Var != null && (a9Var = wr0Var.R) != null) {
                    a9Var.e(canvas, rectF);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.z zVar, RectF rectF) {
        switch (this.f25512a) {
            case 0:
            case 1:
            default:
                zVar.f8456b = true;
                return;
        }
    }
}
