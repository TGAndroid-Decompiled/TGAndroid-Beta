package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;

public final class wg implements kg.a {

    public final int f34175a;

    public final Object f34176b;

    public wg(Object obj, int i10) {
        this.f34175a = i10;
        this.f34176b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        yh yhVar;
        gh.s2 s2Var;
        switch (this.f34175a) {
            case 0:
                gi giVar = (gi) this.f34176b;
                int i10 = 0;
                while (i10 < 2) {
                    yh yhVar2 = i10 == 0 ? giVar.f28696u0 : giVar.f28699v0;
                    if (yhVar2 == null || yhVar2.f34901c == null || yhVar2.getVisibility() != 0) {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                        pg.c.a(yhVar2.f34901c, canvas2, rectF2, yhVar2.d, giVar.getContainerView(), (int) (((i10 == 0 && (yhVar = giVar.f28699v0) != null && yhVar.getVisibility() == 0) ? (1.0f - giVar.f28699v0.getAlpha()) * yhVar2.getAlpha() : yhVar2.getAlpha()) * 255.0f));
                    }
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                break;
            case 1:
                kg.a[] aVarArr = (kg.a[]) this.f34176b;
                for (int i11 = 0; i11 < 3; i11++) {
                    kg.a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVar.e(canvas, rectF);
                    }
                }
                break;
            default:
                hu0 hu0Var = (hu0) this.f34176b;
                for (zs0 zs0Var : hu0Var.f29122g0) {
                    jg.k kVar = zs0Var.f35339n;
                    if (kVar != null) {
                        kVar.e(canvas, rectF);
                    }
                }
                wq0 wq0Var = hu0Var.R;
                if (wq0Var != null && (s2Var = wq0Var.N) != null) {
                    s2Var.e(canvas, rectF);
                    break;
                }
                break;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f34175a) {
        }
        yVar.f6327b = true;
    }
}
