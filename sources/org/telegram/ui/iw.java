package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class iw implements bh.a {
    public final int f37496a;
    public final org.telegram.ui.ActionBar.n2 f37497b;
    public final FrameLayout f37498c;
    public final Object d;

    public iw(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.f37496a = i10;
        this.f37497b = n2Var;
        this.f37498c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f37496a) {
            case 0:
            default:
                aVar.f450a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        int i10;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f37496a) {
            case 0:
                uy uyVar = (uy) this.f37497b;
                ny nyVar = (ny) this.f37498c;
                PointF pointF = (PointF) this.d;
                dy dyVar = uyVar.C0;
                if (dyVar != null) {
                    i10 = (int) (dyVar.getAlpha() * 255.0f);
                } else {
                    i10 = 0;
                }
                ty[] tyVarArr = uyVar.f41435e0;
                int length = tyVarArr.length;
                int i11 = 0;
                while (i11 < length) {
                    ty tyVar = tyVarArr[i11];
                    if (tyVar != null && tyVar.getVisibility() == 0 && tyVar.getAlpha() > 0.0f) {
                        float e42 = uyVar.e4();
                        if (tyVar.F != null && e42 > 0.0f) {
                            if (hh.k.b(tyVar.f41046a, nyVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                tyVar.f41046a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            qy qyVar = tyVar.f41046a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            gh.d.b(qyVar, canvas2, rectF2, qyVar, nyVar, 255 - i10);
                            i11++;
                            canvas = canvas2;
                            rectF = rectF2;
                        }
                    }
                    canvas2 = canvas;
                    rectF2 = rectF;
                    i11++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                Canvas canvas3 = canvas;
                RectF rectF3 = rectF;
                dy dyVar2 = uyVar.C0;
                if (dyVar2 != null && dyVar2.getVisibility() == 0 && uyVar.C0.getAlpha() > 0.0f) {
                    dy dyVar3 = uyVar.C0;
                    gh.d.b(dyVar3, canvas3, rectF3, dyVar3, nyVar, i10);
                    return;
                }
                return;
            default:
                ta1 ta1Var = (ta1) this.f37497b;
                d6 d6Var = (d6) this.d;
                s91 s91Var = ta1Var.S;
                FrameLayout frameLayout = this.f37498c;
                if (s91Var != null) {
                    gh.d.a(s91Var, canvas, rectF, s91Var, frameLayout);
                }
                dc dcVar = ta1Var.f40815i0;
                if (dcVar != null) {
                    org.telegram.ui.Components.zl0 zl0Var = dcVar.F;
                    gh.d.a(zl0Var, canvas, rectF, zl0Var, frameLayout);
                }
                me meVar = ta1Var.f40816j0;
                if (meVar != null && meVar.getParent() == ta1Var.f40814h0 && ta1Var.f40816j0.getVisibility() == 0) {
                    ta1Var.f40816j0.d(canvas, rectF, d6Var);
                    return;
                }
                return;
        }
    }
}
