package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class ib extends org.telegram.ui.Components.qt0 {
    public final kb f46229g0;

    public ib(kb kbVar, Context context) {
        super(context, null);
        this.f46229g0 = kbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        kb kbVar = this.f46229g0;
        if (kbVar.f46885w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, kbVar.f46885w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, kbVar.f46885w.getY());
        kbVar.f46885w.getClass();
        for (int i3 = 0; i3 < kbVar.f46885w.getChildCount(); i3++) {
            View childAt = kbVar.f46885w.getChildAt(i3);
            RectF rectF2 = kbVar.Q0;
            if (rectF != null && kbVar.f46885w != null && childAt != null) {
                rectF2.set(childAt.getX(), kbVar.f46885w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), kbVar.f46885w.getY() + childAt.getY() + childAt.getHeight());
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
                    kbVar.f46885w.drawChild(canvas, childAt, uptimeMillis);
                    if (q1Var.j2()) {
                        canvas.save();
                        canvas.translate(q1Var.getX(), q1Var.getY());
                        q1Var.i1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    kbVar.f46885w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.t0) childAt).H(canvas);
                    canvas.restore();
                } else {
                    kbVar.f46885w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        kbVar.f46885w.getClass();
        canvas.restore();
    }
}
