package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class qb extends org.telegram.ui.Components.vu0 {
    public final sb f40739f0;

    public qb(sb sbVar, Context context) {
        super(context, null);
        this.f40739f0 = sbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        sb sbVar = this.f40739f0;
        if (sbVar.f41329w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, sbVar.f41329w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, sbVar.f41329w.getY());
        sbVar.f41329w.getClass();
        for (int i10 = 0; i10 < sbVar.f41329w.getChildCount(); i10++) {
            View childAt = sbVar.f41329w.getChildAt(i10);
            RectF rectF2 = sbVar.P0;
            if (rectF != null && sbVar.f41329w != null && childAt != null) {
                rectF2.set(childAt.getX(), sbVar.f41329w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), sbVar.f41329w.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            } else {
                z10 = false;
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.J0()) {
                        canvas.save();
                        canvas.translate(0.0f, q1Var.V);
                        q1Var.K0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    sbVar.f41329w.drawChild(canvas, childAt, uptimeMillis);
                    if (q1Var.h2()) {
                        canvas.save();
                        canvas.translate(q1Var.getX(), q1Var.getY());
                        q1Var.g1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    sbVar.f41329w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.s0) childAt).I(canvas);
                    canvas.restore();
                } else {
                    sbVar.f41329w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        sbVar.f41329w.getClass();
        canvas.restore();
    }
}
