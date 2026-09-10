package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class fg implements ah.a {
    public final int f32810a;
    public final vm f32811b;

    public fg(vm vmVar, int i10) {
        this.f32810a = i10;
        this.f32811b = vmVar;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        vm vmVar;
        switch (this.f32810a) {
            case 0:
                vm vmVar2 = this.f32811b;
                eo eoVar = vmVar2.J0;
                eo eoVar2 = eoVar.f32304da;
                if (eoVar2 != null) {
                    vmVar = eoVar2.X0;
                } else {
                    vmVar = eoVar.X0;
                }
                vm vmVar3 = vmVar;
                float f7 = eoVar.f32566yc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(f7 * 0.85f, eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6)));
                }
                fh.d.a(new fg(vmVar2, 1), canvas, rectF, eoVar.f32542x0, vmVar3, i10);
                bi.y1 y1Var = eoVar.L3;
                if (y1Var != null) {
                    fh.d.a(y1Var, canvas, rectF, y1Var, vmVar3, i11);
                }
                bi.p1 p1Var = eoVar.f32452q1;
                if (p1Var != null && p1Var.getVisibility() == 0) {
                    int childCount = eoVar.f32452q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = eoVar.f32452q1.getChildAt(i12);
                        if ((childAt instanceof go) && childAt.getVisibility() == 0) {
                            go goVar = (go) childAt;
                            fo foVar = goVar.f33142a;
                            vm vmVar4 = foVar.X0;
                            Objects.requireNonNull(vmVar4);
                            fh.d.b(new fg(vmVar4, 0), canvas, rectF, foVar.X0, goVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                eo eoVar3 = this.f32811b.J0;
                if (eoVar3.f32542x0.Y0()) {
                    eoVar3.f32542x0.e(canvas, rectF);
                    return;
                }
                eoVar3.f32542x0.v1(canvas, rectF);
                for (int i13 = 0; i13 < eoVar3.f32542x0.getChildCount(); i13++) {
                    View childAt2 = eoVar3.f32542x0.getChildAt(i13);
                    if (!eo.d2(eoVar3, childAt2, rectF)) {
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
                            eoVar3.f32542x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (t1Var.U2()) {
                                canvas.save();
                                canvas.translate(t1Var.getX(), t1Var.getY());
                                t1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            eoVar3.f32542x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                            canvas.restore();
                        } else {
                            eoVar3.f32542x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                eoVar3.f32542x0.w1(canvas, rectF);
                return;
        }
    }

    @Override
    public final void g(g.z zVar, RectF rectF) {
        switch (this.f32810a) {
            case 0:
            default:
                zVar.f8456b = true;
                return;
        }
    }
}
