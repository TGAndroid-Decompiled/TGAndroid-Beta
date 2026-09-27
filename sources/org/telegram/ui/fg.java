package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class fg implements bh.a {
    public final int f33549a;
    public final qm f33550b;

    public fg(qm qmVar, int i10) {
        this.f33549a = i10;
        this.f33550b = qmVar;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f33549a) {
            case 0:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        qm qmVar;
        switch (this.f33549a) {
            case 0:
                qm qmVar2 = this.f33550b;
                xn xnVar = qmVar2.J0;
                xn xnVar2 = xnVar.f39738da;
                if (xnVar2 != null) {
                    qmVar = xnVar2.X0;
                } else {
                    qmVar = xnVar.X0;
                }
                qm qmVar3 = qmVar;
                float f7 = xnVar.xc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.l1(f7 * 0.85f, xnVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6)));
                }
                gh.d.b(new fg(qmVar2, 1), canvas, rectF, xnVar.f39977x0, qmVar3, i10);
                ai.w0 w0Var = xnVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, qmVar3, i11);
                }
                ci.i1 i1Var = xnVar.f39887q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = xnVar.f39887q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = xnVar.f39887q1.getChildAt(i12);
                        if ((childAt instanceof zn) && childAt.getVisibility() == 0) {
                            zn znVar = (zn) childAt;
                            yn ynVar = znVar.f40556a;
                            qm qmVar4 = ynVar.X0;
                            Objects.requireNonNull(qmVar4);
                            gh.d.a(new fg(qmVar4, 0), canvas, rectF, ynVar.X0, znVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                xn xnVar3 = this.f33550b.J0;
                if (xnVar3.f39977x0.a1()) {
                    xnVar3.f39977x0.f(canvas, rectF);
                    return;
                }
                xnVar3.f39977x0.x1(canvas, rectF);
                for (int i13 = 0; i13 < xnVar3.f39977x0.getChildCount(); i13++) {
                    View childAt2 = xnVar3.f39977x0.getChildAt(i13);
                    if (!xn.d2(xnVar3, childAt2, rectF)) {
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
                            xnVar3.f39977x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (u1Var.U2()) {
                                canvas.save();
                                canvas.translate(u1Var.getX(), u1Var.getY());
                                u1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            xnVar3.f39977x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                            canvas.restore();
                        } else {
                            xnVar3.f39977x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                xnVar3.f39977x0.y1(canvas, rectF);
                return;
        }
    }
}
