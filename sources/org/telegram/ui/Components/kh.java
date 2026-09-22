package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class kh implements bh.a {
    public final int f25696a;
    public final Object f25697b;

    public kh(Object obj, int i10) {
        this.f25696a = i10;
        this.f25697b = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f25696a) {
            case 0:
            case 1:
            default:
                aVar.f414a = true;
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
        ci.z7 z7Var;
        switch (this.f25696a) {
            case 0:
                vi viVar = (vi) this.f25697b;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        niVar = viVar.f29157y0;
                    } else {
                        niVar = viVar.f29160z0;
                    }
                    if (niVar != null && niVar.f26787c != null && niVar.getVisibility() == 0) {
                        if (i10 == 0 && (niVar2 = viVar.f29160z0) != null && niVar2.getVisibility() == 0) {
                            alpha = (1.0f - viVar.f29160z0.getAlpha()) * niVar.getAlpha();
                        } else {
                            alpha = niVar.getAlpha();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        gh.d.b(niVar.f26787c, canvas2, rectF2, niVar.d, viVar.getContainerView(), (int) (alpha * 255.0f));
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
                kz kzVar = (kz) this.f25697b;
                wx wxVar = kzVar.P;
                gh.d.a(wxVar, canvas, rectF, wxVar, kzVar);
                nw nwVar = kzVar.f25873h0;
                gh.d.a(nwVar, canvas, rectF, nwVar, kzVar);
                tw twVar = kzVar.D0;
                gh.d.a(twVar, canvas, rectF, twVar, kzVar);
                return;
            default:
                lv0 lv0Var = (lv0) this.f25697b;
                for (eu0 eu0Var : lv0Var.f26210k0) {
                    ah.o oVar = eu0Var.f24042n;
                    if (oVar != null) {
                        oVar.f(canvas, rectF);
                    }
                }
                bs0 bs0Var = lv0Var.V;
                if (bs0Var != null && (z7Var = bs0Var.R) != null) {
                    z7Var.f(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
