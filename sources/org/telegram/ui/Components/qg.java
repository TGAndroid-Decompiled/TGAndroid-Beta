package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class qg implements ug.a {
    public final int f29728a;
    public final Object f29729b;

    public qg(Object obj, int i10) {
        this.f29728a = i10;
        this.f29729b = obj;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        uh uhVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        uh uhVar2;
        switch (this.f29728a) {
            case 0:
                bi biVar = (bi) this.f29729b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        uhVar = biVar.f24812s2;
                    } else {
                        uhVar = biVar.f24816t2;
                    }
                    if (uhVar != null && uhVar.f30965c != null && uhVar.getVisibility() == 0) {
                        if (i10 == 0 && (uhVar2 = biVar.f24816t2) != null && uhVar2.getVisibility() == 0) {
                            alpha = (1.0f - biVar.f24816t2.getAlpha()) * uhVar.getAlpha();
                        } else {
                            alpha = uhVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        yg.d.b(uhVar.f30965c, canvas2, rectF2, uhVar.d, biVar.f21587b, (int) (alpha * 255.0f));
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
                vy vyVar = (vy) this.f29729b;
                hx hxVar = vyVar.P;
                yg.d.a(hxVar, canvas, rectF, hxVar, vyVar);
                wv wvVar = vyVar.f31958h0;
                yg.d.a(wvVar, canvas, rectF, wvVar, vyVar);
                bw bwVar = vyVar.D0;
                yg.d.a(bwVar, canvas, rectF, bwVar, vyVar);
                return;
            default:
                pp0 pp0Var = (pp0) this.f29729b;
                po0 po0Var = pp0Var.f29504x1;
                yg.d.a(po0Var, canvas, rectF, po0Var, pp0Var.f21587b);
                return;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f29728a) {
            case 0:
            case 1:
            default:
                yVar.f7259b = true;
                return;
        }
    }
}
