package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class kb extends org.telegram.ui.Components.rt0 {
    public final mb f47156f0;

    public kb(mb mbVar, Context context) {
        super(context, null);
        this.f47156f0 = mbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z9;
        long uptimeMillis = SystemClock.uptimeMillis();
        mb mbVar = this.f47156f0;
        if (mbVar.f47768w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, mbVar.f47768w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, mbVar.f47768w.getY());
        mbVar.f47768w.getClass();
        for (int i7 = 0; i7 < mbVar.f47768w.getChildCount(); i7++) {
            View childAt = mbVar.f47768w.getChildAt(i7);
            RectF rectF2 = mbVar.P0;
            if (rectF != null && mbVar.f47768w != null && childAt != null) {
                rectF2.set(childAt.getX(), mbVar.f47768w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), mbVar.f47768w.getY() + childAt.getY() + childAt.getHeight());
                z9 = !rectF2.intersect(rectF);
            } else {
                z9 = false;
            }
            if (!z9) {
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.L0()) {
                        canvas.save();
                        canvas.translate(0.0f, q1Var.V);
                        q1Var.M0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    mbVar.f47768w.drawChild(canvas, childAt, uptimeMillis);
                    if (q1Var.j2()) {
                        canvas.save();
                        canvas.translate(q1Var.getX(), q1Var.getY());
                        q1Var.i1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    mbVar.f47768w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.t0) childAt).G(canvas);
                    canvas.restore();
                } else {
                    mbVar.f47768w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        mbVar.f47768w.getClass();
        canvas.restore();
    }
}
