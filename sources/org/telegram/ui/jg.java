package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class jg implements bh.a {
    public final int f39202a;
    public final wm f39203b;

    public jg(wm wmVar, int i10) {
        this.f39202a = i10;
        this.f39203b = wmVar;
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        switch (this.f39202a) {
            case 0:
            default:
                aVar.f538a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        wm wmVar;
        switch (this.f39202a) {
            case 0:
                wm wmVar2 = this.f39203b;
                eo eoVar = wmVar2.J0;
                eo eoVar2 = eoVar.f37238da;
                if (eoVar2 != null) {
                    wmVar = eoVar2.X0;
                } else {
                    wmVar = eoVar.X0;
                }
                wm wmVar3 = wmVar;
                float f7 = eoVar.yc.f16087e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.m1(f7 * 0.85f, eoVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6)));
                }
                gh.d.b(new jg(wmVar2, 1), canvas, rectF, eoVar.f37478x0, wmVar3, i10);
                ai.w0 w0Var = eoVar.L3;
                if (w0Var != null) {
                    gh.d.b(w0Var, canvas, rectF, w0Var, wmVar3, i11);
                }
                ci.h1 h1Var = eoVar.f37387q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = eoVar.f37387q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = eoVar.f37387q1.getChildAt(i12);
                        if ((childAt instanceof go) && childAt.getVisibility() == 0) {
                            go goVar = (go) childAt;
                            fo foVar = goVar.f38105a;
                            wm wmVar4 = foVar.X0;
                            Objects.requireNonNull(wmVar4);
                            gh.d.a(new jg(wmVar4, 0), canvas, rectF, foVar.X0, goVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                eo eoVar3 = this.f39203b.J0;
                if (eoVar3.f37478x0.Z0()) {
                    eoVar3.f37478x0.f(canvas, rectF);
                    return;
                }
                eoVar3.f37478x0.x1(canvas, rectF);
                for (int i13 = 0; i13 < eoVar3.f37478x0.getChildCount(); i13++) {
                    View childAt2 = eoVar3.f37478x0.getChildAt(i13);
                    if (!eo.e2(eoVar3, childAt2, rectF)) {
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
                            eoVar3.f37478x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (u1Var.U2()) {
                                canvas.save();
                                canvas.translate(u1Var.getX(), u1Var.getY());
                                u1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            eoVar3.f37478x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).B(canvas);
                            canvas.restore();
                        } else {
                            eoVar3.f37478x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                eoVar3.f37478x0.y1(canvas, rectF);
                return;
        }
    }
}
