package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class fg implements bh.a {
    public final int f37545a;
    public final sm f37546b;

    public fg(sm smVar, int i10) {
        this.f37545a = i10;
        this.f37546b = smVar;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f37545a) {
            case 0:
            default:
                aVar.f536a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        sm smVar;
        switch (this.f37545a) {
            case 0:
                sm smVar2 = this.f37546b;
                zn znVar = smVar2.J0;
                zn znVar2 = znVar.f44748da;
                if (znVar2 != null) {
                    smVar = znVar2.X0;
                } else {
                    smVar = znVar.X0;
                }
                sm smVar3 = smVar;
                float f7 = znVar.yc.f16337e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.i6.m1(f7 * 0.85f, znVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6)));
                }
                gh.d.b(new fg(smVar2, 1), canvas, rectF, znVar.f44988x0, smVar3, i10);
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, smVar3, i11);
                }
                ci.h1 h1Var = znVar.f44897q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = znVar.f44897q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = znVar.f44897q1.getChildAt(i12);
                        if ((childAt instanceof bo) && childAt.getVisibility() == 0) {
                            bo boVar = (bo) childAt;
                            ao aoVar = boVar.f36357a;
                            sm smVar4 = aoVar.X0;
                            Objects.requireNonNull(smVar4);
                            gh.d.a(new fg(smVar4, 0), canvas, rectF, aoVar.X0, boVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                zn znVar3 = this.f37546b.J0;
                if (znVar3.f44988x0.Z0()) {
                    znVar3.f44988x0.f(canvas, rectF);
                    return;
                }
                znVar3.f44988x0.x1(canvas, rectF);
                for (int i13 = 0; i13 < znVar3.f44988x0.getChildCount(); i13++) {
                    View childAt2 = znVar3.f44988x0.getChildAt(i13);
                    if (!zn.e2(znVar3, childAt2, rectF)) {
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
                            znVar3.f44988x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (u1Var.U2()) {
                                canvas.save();
                                canvas.translate(u1Var.getX(), u1Var.getY());
                                u1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            znVar3.f44988x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).C(canvas);
                            canvas.restore();
                        } else {
                            znVar3.f44988x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                znVar3.f44988x0.y1(canvas, rectF);
                return;
        }
    }
}
