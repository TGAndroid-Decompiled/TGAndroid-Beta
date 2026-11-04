package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class rg implements fh.a {
    public final int f37719a;
    public final Object f37720b;

    public rg(Object obj, int i3) {
        this.f37719a = i3;
        this.f37720b = obj;
    }

    @Override
    public final void b(eh.a aVar, RectF rectF) {
        switch (this.f37719a) {
            case 0:
            case 1:
            default:
                aVar.f9978a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        th thVar;
        Canvas canvas2;
        RectF rectF2;
        float alpha;
        th thVar2;
        switch (this.f37719a) {
            case 0:
                bi biVar = (bi) this.f37720b;
                int i3 = 0;
                while (i3 < 2) {
                    if (i3 == 0) {
                        thVar = biVar.f32275t2;
                    } else {
                        thVar = biVar.f32279u2;
                    }
                    if (thVar != null && thVar.f38417c != null && thVar.getVisibility() == 0) {
                        if (i3 == 0 && (thVar2 = biVar.f32279u2) != null && thVar2.getVisibility() == 0) {
                            alpha = (1.0f - biVar.f32279u2.getAlpha()) * thVar.getAlpha();
                        } else {
                            alpha = thVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        jh.d.b(thVar.f38417c, canvas2, rectF2, thVar.d, biVar.f28586b, (int) (alpha * 255.0f));
                    } else {
                        canvas2 = canvas;
                        rectF2 = rectF;
                    }
                    i3++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                return;
            case 1:
                ey eyVar = (ey) this.f37720b;
                rw rwVar = eyVar.Q;
                jh.d.a(rwVar, canvas, rectF, rwVar, eyVar);
                jv jvVar = eyVar.f33545i0;
                jh.d.a(jvVar, canvas, rectF, jvVar, eyVar);
                ov ovVar = eyVar.E0;
                jh.d.a(ovVar, canvas, rectF, ovVar, eyVar);
                return;
            default:
                oo0 oo0Var = (oo0) this.f37720b;
                qn0 qn0Var = oo0Var.f36911y1;
                jh.d.a(qn0Var, canvas, rectF, qn0Var, oo0Var.f28586b);
                return;
        }
    }
}
