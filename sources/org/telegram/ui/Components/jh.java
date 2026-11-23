package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class jh implements eh.a {
    public final int f36411a;
    public final Object f36412b;

    public jh(Object obj, int i7) {
        this.f36411a = i7;
        this.f36412b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f36411a) {
            case 0:
            case 1:
            default:
                aVar.f8363a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        li liVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        li liVar2;
        switch (this.f36411a) {
            case 0:
                ti tiVar = (ti) this.f36412b;
                int i7 = 0;
                while (i7 < 2) {
                    if (i7 == 0) {
                        liVar = tiVar.f40029w2;
                    } else {
                        liVar = tiVar.f40033x2;
                    }
                    if (liVar != null && liVar.f37136c != null && liVar.getVisibility() == 0) {
                        if (i7 == 0 && (liVar2 = tiVar.f40033x2) != null && liVar2.getVisibility() == 0) {
                            alpha = (1.0f - tiVar.f40033x2.getAlpha()) * liVar.getAlpha();
                        } else {
                            alpha = liVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(liVar.f37136c, canvas2, rectF2, liVar.d, tiVar.f30226b, (int) (alpha * 255.0f));
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    }
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                return;
            case 1:
                qy qyVar = (qy) this.f36412b;
                dx dxVar = qyVar.Q;
                ih.d.a(dxVar, canvas, rectF, dxVar, qyVar);
                vv vvVar = qyVar.f39062i0;
                ih.d.a(vvVar, canvas, rectF, vvVar, qyVar);
                aw awVar = qyVar.E0;
                ih.d.a(awVar, canvas, rectF, awVar, qyVar);
                return;
            default:
                zo0 zo0Var = (zo0) this.f36412b;
                bo0 bo0Var = zo0Var.B1;
                ih.d.a(bo0Var, canvas, rectF, bo0Var, zo0Var.f30226b);
                return;
        }
    }
}
