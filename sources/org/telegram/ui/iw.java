package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class iw implements bh.a {
    public final int f37509a;
    public final org.telegram.ui.ActionBar.n2 f37510b;
    public final FrameLayout f37511c;
    public final Object d;

    public iw(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.f37509a = i10;
        this.f37510b = n2Var;
        this.f37511c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f37509a) {
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
        switch (this.f37509a) {
            case 0:
                uy uyVar = (uy) this.f37510b;
                ny nyVar = (ny) this.f37511c;
                PointF pointF = (PointF) this.d;
                dy dyVar = uyVar.C0;
                if (dyVar != null) {
                    i10 = (int) (dyVar.getAlpha() * 255.0f);
                } else {
                    i10 = 0;
                }
                ty[] tyVarArr = uyVar.f41400e0;
                int length = tyVarArr.length;
                int i11 = 0;
                while (i11 < length) {
                    ty tyVar = tyVarArr[i11];
                    if (tyVar != null && tyVar.getVisibility() == 0 && tyVar.getAlpha() > 0.0f) {
                        float e42 = uyVar.e4();
                        if (tyVar.F != null && e42 > 0.0f) {
                            if (hh.k.b(tyVar.f40990a, nyVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                tyVar.f40990a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            qy qyVar = tyVar.f40990a;
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
                va1 va1Var = (va1) this.f37510b;
                d6 d6Var = (d6) this.d;
                u91 u91Var = va1Var.S;
                FrameLayout frameLayout = this.f37511c;
                if (u91Var != null) {
                    gh.d.a(u91Var, canvas, rectF, u91Var, frameLayout);
                }
                dc dcVar = va1Var.f41658i0;
                if (dcVar != null) {
                    org.telegram.ui.Components.zl0 zl0Var = dcVar.F;
                    gh.d.a(zl0Var, canvas, rectF, zl0Var, frameLayout);
                }
                me meVar = va1Var.f41659j0;
                if (meVar != null && meVar.getParent() == va1Var.f41657h0 && va1Var.f41659j0.getVisibility() == 0) {
                    va1Var.f41659j0.c0(canvas, rectF, d6Var);
                    return;
                }
                return;
        }
    }
}
