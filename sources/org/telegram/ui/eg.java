package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class eg implements ch.a {
    public final int f36021a;
    public final um f36022b;

    public eg(um umVar, int i10) {
        this.f36021a = i10;
        this.f36022b = umVar;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f36021a) {
            case 0:
            default:
                aVar.f2648a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        um umVar;
        switch (this.f36021a) {
            case 0:
                um umVar2 = this.f36022b;
                co coVar = umVar2.J0;
                co coVar2 = coVar.f35234da;
                if (coVar2 != null) {
                    umVar = coVar2.X0;
                } else {
                    umVar = coVar.X0;
                }
                um umVar3 = umVar;
                float f7 = coVar.f35497yc.f15368e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f7 * 0.85f, coVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6)));
                }
                hh.d.a(new eg(umVar2, 1), canvas, rectF, coVar.f35473x0, umVar3, i10);
                bi.o0 o0Var = coVar.L3;
                if (o0Var != null) {
                    hh.d.a(o0Var, canvas, rectF, o0Var, umVar3, i11);
                }
                di.i1 i1Var = coVar.f35383q1;
                if (i1Var != null && i1Var.getVisibility() == 0) {
                    int childCount = coVar.f35383q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = coVar.f35383q1.getChildAt(i12);
                        if ((childAt instanceof fo) && childAt.getVisibility() == 0) {
                            fo foVar = (fo) childAt;
                            eo eoVar = foVar.f36437a;
                            um umVar4 = eoVar.X0;
                            Objects.requireNonNull(umVar4);
                            hh.d.b(new eg(umVar4, 0), canvas, rectF, eoVar.X0, foVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                co coVar3 = this.f36022b.J0;
                if (coVar3.f35473x0.Y0()) {
                    coVar3.f35473x0.f(canvas, rectF);
                    return;
                }
                coVar3.f35473x0.v1(canvas, rectF);
                for (int i13 = 0; i13 < coVar3.f35473x0.getChildCount(); i13++) {
                    View childAt2 = coVar3.f35473x0.getChildAt(i13);
                    if (!co.d2(coVar3, childAt2, rectF)) {
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
                            coVar3.f35473x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (t1Var.U2()) {
                                canvas.save();
                                canvas.translate(t1Var.getX(), t1Var.getY());
                                t1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            coVar3.f35473x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).A(canvas);
                            canvas.restore();
                        } else {
                            coVar3.f35473x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                coVar3.f35473x0.w1(canvas, rectF);
                return;
        }
    }
}
