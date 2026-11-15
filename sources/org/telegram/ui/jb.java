package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class jb extends org.telegram.ui.Components.st0 {
    public final lb f48290g0;

    public jb(lb lbVar, Context context) {
        super(context, null);
        this.f48290g0 = lbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        lb lbVar = this.f48290g0;
        if (lbVar.f48958w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, lbVar.f48958w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, lbVar.f48958w.getY());
        lbVar.f48958w.getClass();
        for (int i7 = 0; i7 < lbVar.f48958w.getChildCount(); i7++) {
            View childAt = lbVar.f48958w.getChildAt(i7);
            RectF rectF2 = lbVar.Q0;
            if (rectF != null && lbVar.f48958w != null && childAt != null) {
                rectF2.set(childAt.getX(), lbVar.f48958w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), lbVar.f48958w.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            } else {
                z10 = false;
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.L0()) {
                        canvas.save();
                        canvas.translate(0.0f, q1Var.W);
                        q1Var.M0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    lbVar.f48958w.drawChild(canvas, childAt, uptimeMillis);
                    if (q1Var.k2()) {
                        canvas.save();
                        canvas.translate(q1Var.getX(), q1Var.getY());
                        q1Var.i1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    lbVar.f48958w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.t0) childAt).J(canvas);
                    canvas.restore();
                } else {
                    lbVar.f48958w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        lbVar.f48958w.getClass();
        canvas.restore();
    }
}
