package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class kh implements dh.a {
    public final int f29958a;
    public final Object f29959b;

    public kh(Object obj, int i10) {
        this.f29958a = i10;
        this.f29959b = obj;
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.f29958a) {
            case 0:
            case 1:
            default:
                aVar.f6296a = true;
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
        switch (this.f29958a) {
            case 0:
                ti tiVar = (ti) this.f29959b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        liVar = tiVar.B0;
                    } else {
                        liVar = tiVar.C0;
                    }
                    if (liVar != null && liVar.f30255c != null && liVar.getVisibility() == 0) {
                        if (i10 == 0 && (liVar2 = tiVar.C0) != null && liVar2.getVisibility() == 0) {
                            alpha = (1.0f - tiVar.C0.getAlpha()) * liVar.getAlpha();
                        } else {
                            alpha = liVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(liVar.f30255c, canvas2, rectF2, liVar.d, tiVar.getContainerView(), (int) (alpha * 255.0f));
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
                sz szVar = (sz) this.f29959b;
                dy dyVar = szVar.P;
                ih.d.a(dyVar, canvas, rectF, dyVar, szVar);
                uw uwVar = szVar.f32728h0;
                ih.d.a(uwVar, canvas, rectF, uwVar, szVar);
                zw zwVar = szVar.D0;
                ih.d.a(zwVar, canvas, rectF, zwVar, szVar);
                return;
            default:
                nr0.n((nr0) this.f29959b, canvas, rectF);
                return;
        }
    }
}
