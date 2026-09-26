package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class cg implements bh.a {
    public final int f32710a;
    public final pm f32711b;

    public cg(pm pmVar, int i10) {
        this.f32710a = i10;
        this.f32711b = pmVar;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f32710a) {
            case 0:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        pm pmVar;
        switch (this.f32710a) {
            case 0:
                pm pmVar2 = this.f32711b;
                wn wnVar = pmVar2.J0;
                wn wnVar2 = wnVar.f39456da;
                if (wnVar2 != null) {
                    pmVar = wnVar2.X0;
                } else {
                    pmVar = wnVar.X0;
                }
                pm pmVar3 = pmVar;
                float f7 = wnVar.xc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.l1(f7 * 0.85f, wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6)));
                }
                gh.d.b(new cg(pmVar2, 1), canvas, rectF, wnVar.f39694x0, pmVar3, i10);
                ai.w0 w0Var = wnVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, pmVar3, i11);
                }
                ci.i1 i1Var = wnVar.f39604q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = wnVar.f39604q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = wnVar.f39604q1.getChildAt(i12);
                        if ((childAt instanceof yn) && childAt.getVisibility() == 0) {
                            yn ynVar = (yn) childAt;
                            xn xnVar = ynVar.f40192a;
                            pm pmVar4 = xnVar.X0;
                            Objects.requireNonNull(pmVar4);
                            gh.d.a(new cg(pmVar4, 0), canvas, rectF, xnVar.X0, ynVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                wn wnVar3 = this.f32711b.J0;
                if (wnVar3.f39694x0.Z0()) {
                    wnVar3.f39694x0.f(canvas, rectF);
                    return;
                }
                wnVar3.f39694x0.w1(canvas, rectF);
                for (int i13 = 0; i13 < wnVar3.f39694x0.getChildCount(); i13++) {
                    View childAt2 = wnVar3.f39694x0.getChildAt(i13);
                    if (!wn.d2(wnVar3, childAt2, rectF)) {
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt2;
                            if (u1Var.C1()) {
                                canvas.save();
                                canvas.translate(0.0f, u1Var.V);
                                u1Var.D1(canvas, true, false);
                                canvas.restore();
                            }
                            canvas.restore();
                            wnVar3.f39694x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (u1Var.U2()) {
                                canvas.save();
                                canvas.translate(u1Var.getX(), u1Var.getY());
                                u1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            wnVar3.f39694x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                            canvas.restore();
                        } else {
                            wnVar3.f39694x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                wnVar3.f39694x0.x1(canvas, rectF);
                return;
        }
    }
}
