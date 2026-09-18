package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class fg implements bh.a {
    public final int f33531a;
    public final rm f33532b;

    public fg(rm rmVar, int i10) {
        this.f33531a = i10;
        this.f33532b = rmVar;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f33531a) {
            case 0:
            default:
                aVar.f417a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        rm rmVar;
        switch (this.f33531a) {
            case 0:
                rm rmVar2 = this.f33532b;
                zn znVar = rmVar2.J0;
                zn znVar2 = znVar.f40249da;
                if (znVar2 != null) {
                    rmVar = znVar2.X0;
                } else {
                    rmVar = znVar.X0;
                }
                rm rmVar3 = rmVar;
                float f7 = znVar.xc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f7 * 0.85f, znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6)));
                }
                gh.d.b(new fg(rmVar2, 1), canvas, rectF, znVar.f40488x0, rmVar3, i10);
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, rmVar3, i11);
                }
                ci.i1 i1Var = znVar.f40398q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = znVar.f40398q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = znVar.f40398q1.getChildAt(i12);
                        if ((childAt instanceof bo) && childAt.getVisibility() == 0) {
                            bo boVar = (bo) childAt;
                            ao aoVar = boVar.f32418a;
                            rm rmVar4 = aoVar.X0;
                            Objects.requireNonNull(rmVar4);
                            gh.d.a(new fg(rmVar4, 0), canvas, rectF, aoVar.X0, boVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                zn znVar3 = this.f33532b.J0;
                if (znVar3.f40488x0.a1()) {
                    znVar3.f40488x0.f(canvas, rectF);
                    return;
                }
                znVar3.f40488x0.x1(canvas, rectF);
                for (int i13 = 0; i13 < znVar3.f40488x0.getChildCount(); i13++) {
                    View childAt2 = znVar3.f40488x0.getChildAt(i13);
                    if (!zn.d2(znVar3, childAt2, rectF)) {
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
                            znVar3.f40488x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (u1Var.U2()) {
                                canvas.save();
                                canvas.translate(u1Var.getX(), u1Var.getY());
                                u1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            znVar3.f40488x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                            canvas.restore();
                        } else {
                            znVar3.f40488x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                znVar3.f40488x0.y1(canvas, rectF);
                return;
        }
    }
}
