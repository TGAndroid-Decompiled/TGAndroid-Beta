package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class zg implements eh.a {
    public final int f42358a;
    public final Object f42359b;

    public zg(Object obj, int i7) {
        this.f42358a = i7;
        this.f42359b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f42358a) {
            case 0:
            case 1:
            default:
                aVar.f8087a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        ci ciVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        ci ciVar2;
        switch (this.f42358a) {
            case 0:
                ki kiVar = (ki) this.f42359b;
                int i7 = 0;
                while (i7 < 2) {
                    if (i7 == 0) {
                        ciVar = kiVar.f36509w2;
                    } else {
                        ciVar = kiVar.f36513x2;
                    }
                    if (ciVar != null && ciVar.f33608c != null && ciVar.getVisibility() == 0) {
                        if (i7 == 0 && (ciVar2 = kiVar.f36513x2) != null && ciVar2.getVisibility() == 0) {
                            alpha = (1.0f - kiVar.f36513x2.getAlpha()) * ciVar.getAlpha();
                        } else {
                            alpha = ciVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ih.d.b(ciVar.f33608c, canvas2, rectF2, ciVar.d, kiVar.f29682b, (int) (alpha * 255.0f));
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
                ly lyVar = (ly) this.f42359b;
                yw ywVar = lyVar.Q;
                ih.d.a(ywVar, canvas, rectF, ywVar, lyVar);
                qv qvVar = lyVar.f36956i0;
                ih.d.a(qvVar, canvas, rectF, qvVar, lyVar);
                vv vvVar = lyVar.E0;
                ih.d.a(vvVar, canvas, rectF, vvVar, lyVar);
                return;
            default:
                po0 po0Var = (po0) this.f42359b;
                rn0 rn0Var = po0Var.B1;
                ih.d.a(rn0Var, canvas, rectF, rn0Var, po0Var.f29682b);
                return;
        }
    }
}
