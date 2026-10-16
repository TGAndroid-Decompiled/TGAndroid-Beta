package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class kg implements ch.a {
    public final int f37375a;
    public final xm f37376b;

    public kg(xm xmVar, int i10) {
        this.f37375a = i10;
        this.f37376b = xmVar;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f37375a) {
            case 0:
            default:
                aVar.f2744a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        xm xmVar;
        switch (this.f37375a) {
            case 0:
                xm xmVar2 = this.f37376b;
                fo foVar = xmVar2.J0;
                fo foVar2 = foVar.f35622da;
                if (foVar2 != null) {
                    xmVar = foVar2.X0;
                } else {
                    xmVar = foVar.X0;
                }
                xm xmVar3 = xmVar;
                float f7 = foVar.yc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.g6.m1(f7 * 0.85f, foVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6)));
                }
                hh.d.b(new kg(xmVar2, 1), canvas, rectF, foVar.f35861x0, xmVar3, i10);
                bi.o0 o0Var = foVar.L3;
                if (o0Var != null) {
                    hh.d.b(o0Var, canvas, rectF, o0Var, xmVar3, i11);
                }
                di.h1 h1Var = foVar.f35770q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = foVar.f35770q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = foVar.f35770q1.getChildAt(i12);
                        if ((childAt instanceof ho) && childAt.getVisibility() == 0) {
                            ho hoVar = (ho) childAt;
                            go goVar = hoVar.f36617a;
                            xm xmVar4 = goVar.X0;
                            Objects.requireNonNull(xmVar4);
                            hh.d.a(new kg(xmVar4, 0), canvas, rectF, goVar.X0, hoVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                fo foVar3 = this.f37376b.J0;
                if (foVar3.f35861x0.Z0()) {
                    foVar3.f35861x0.f(canvas, rectF);
                    return;
                }
                foVar3.f35861x0.x1(canvas, rectF);
                for (int i13 = 0; i13 < foVar3.f35861x0.getChildCount(); i13++) {
                    View childAt2 = foVar3.f35861x0.getChildAt(i13);
                    if (!fo.e2(foVar3, childAt2, rectF)) {
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
                            foVar3.f35861x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (u1Var.U2()) {
                                canvas.save();
                                canvas.translate(u1Var.getX(), u1Var.getY());
                                u1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            foVar3.f35861x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).C(canvas);
                            canvas.restore();
                        } else {
                            foVar3.f35861x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                foVar3.f35861x0.y1(canvas, rectF);
                return;
        }
    }
}
