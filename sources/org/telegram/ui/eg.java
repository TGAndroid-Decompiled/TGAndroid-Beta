package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class eg implements bh.a {
    public final int f33287a;
    public final tm f33288b;

    public eg(tm tmVar, int i10) {
        this.f33287a = i10;
        this.f33288b = tmVar;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f33287a) {
            case 0:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        tm tmVar;
        switch (this.f33287a) {
            case 0:
                tm tmVar2 = this.f33288b;
                bo boVar = tmVar2.J0;
                bo boVar2 = boVar.f32281da;
                if (boVar2 != null) {
                    tmVar = boVar2.X0;
                } else {
                    tmVar = boVar.X0;
                }
                tm tmVar3 = tmVar;
                float f7 = boVar.xc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.l1(f7 * 0.85f, boVar.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6)));
                }
                gh.d.b(new eg(tmVar2, 1), canvas, rectF, boVar.f32519x0, tmVar3, i10);
                ai.w0 w0Var = boVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, tmVar3, i11);
                }
                ci.i1 i1Var = boVar.f32429q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = boVar.f32429q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = boVar.f32429q1.getChildAt(i12);
                        if ((childAt instanceof eo) && childAt.getVisibility() == 0) {
                            eo eoVar = (eo) childAt;
                            co coVar = eoVar.f33379a;
                            tm tmVar4 = coVar.X0;
                            Objects.requireNonNull(tmVar4);
                            gh.d.a(new eg(tmVar4, 0), canvas, rectF, coVar.X0, eoVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                bo boVar3 = this.f33288b.J0;
                if (boVar3.f32519x0.Z0()) {
                    boVar3.f32519x0.f(canvas, rectF);
                    return;
                }
                boVar3.f32519x0.w1(canvas, rectF);
                for (int i13 = 0; i13 < boVar3.f32519x0.getChildCount(); i13++) {
                    View childAt2 = boVar3.f32519x0.getChildAt(i13);
                    if (!bo.d2(boVar3, childAt2, rectF)) {
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                            if (t1Var.C1()) {
                                canvas.save();
                                canvas.translate(0.0f, t1Var.V);
                                t1Var.D1(canvas, true, false);
                                canvas.restore();
                            }
                            canvas.restore();
                            boVar3.f32519x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (t1Var.U2()) {
                                canvas.save();
                                canvas.translate(t1Var.getX(), t1Var.getY());
                                t1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            boVar3.f32519x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                            canvas.restore();
                        } else {
                            boVar3.f32519x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                boVar3.f32519x0.x1(canvas, rectF);
                return;
        }
    }
}
