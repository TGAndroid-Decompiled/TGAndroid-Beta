package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class ag implements og.a {
    public final int f32580a;
    public final rm f32581b;

    public ag(rm rmVar, int i10) {
        this.f32580a = i10;
        this.f32581b = rmVar;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        rm rmVar;
        switch (this.f32580a) {
            case 0:
                rm rmVar2 = this.f32581b;
                zn znVar = rmVar2.G0;
                zn znVar2 = znVar.f40520aa;
                if (znVar2 != null) {
                    rmVar = znVar2.U0;
                } else {
                    rmVar = znVar.U0;
                }
                rm rmVar3 = rmVar;
                float f10 = znVar.f40784vc.e;
                int i10 = (int) ((1.0f - f10) * 255.0f);
                int i11 = (int) (255.0f * f10);
                if (f10 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f10 * 0.85f, znVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6)));
                }
                tg.c.a(new ag(rmVar2, 1), canvas, rectF, znVar.f40759u0, rmVar3, i10);
                lh.e1 e1Var = znVar.I3;
                if (e1Var != null) {
                    tg.c.a(e1Var, canvas, rectF, e1Var, rmVar3, i11);
                }
                gk gkVar = znVar.f40675n1;
                if (gkVar != null && gkVar.getVisibility() == 0) {
                    int childCount = znVar.f40675n1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = znVar.f40675n1.getChildAt(i12);
                        if ((childAt instanceof bo) && childAt.getVisibility() == 0) {
                            bo boVar = (bo) childAt;
                            ao aoVar = boVar.f32924a;
                            rm rmVar4 = aoVar.U0;
                            Objects.requireNonNull(rmVar4);
                            tg.c.b(new ag(rmVar4, 0), canvas, rectF, aoVar.U0, boVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                zn znVar3 = this.f32581b.G0;
                if (znVar3.f40759u0.Y0()) {
                    znVar3.f40759u0.e(canvas, rectF);
                    return;
                }
                znVar3.f40759u0.v1(canvas, rectF);
                for (int i13 = 0; i13 < znVar3.f40759u0.getChildCount(); i13++) {
                    View childAt2 = znVar3.f40759u0.getChildAt(i13);
                    if (!zn.d2(znVar3, childAt2, rectF)) {
                        if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                            if (s1Var.C1()) {
                                canvas.save();
                                canvas.translate(0.0f, s1Var.S);
                                s1Var.D1(canvas, true, false);
                                canvas.restore();
                            }
                            canvas.restore();
                            znVar3.f40759u0.drawChild(canvas, childAt2, uptimeMillis);
                            if (s1Var.U2()) {
                                canvas.save();
                                canvas.translate(s1Var.getX(), s1Var.getY());
                                s1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            znVar3.f40759u0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.v0) childAt2).A(canvas);
                            canvas.restore();
                        } else {
                            znVar3.f40759u0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                znVar3.f40759u0.w1(canvas, rectF);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f32580a) {
            case 0:
            default:
                xVar.f6327b = true;
                return;
        }
    }
}
