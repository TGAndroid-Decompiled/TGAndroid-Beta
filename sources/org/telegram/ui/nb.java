package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

public abstract class nb extends org.telegram.ui.Components.zu0 {

    public final qb f40716s0;

    public nb(qb qbVar, Context context) {
        super(context, null);
        this.f40716s0 = qbVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        qb qbVar = this.f40716s0;
        if (qbVar.A.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, qbVar.A, jUptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, qbVar.A.getY());
        qbVar.A.getClass();
        for (int i10 = 0; i10 < qbVar.A.getChildCount(); i10++) {
            View childAt = qbVar.A.getChildAt(i10);
            RectF rectF2 = qbVar.S0;
            if (rectF == null || qbVar.A == null || childAt == null) {
                z10 = false;
            } else {
                rectF2.set(childAt.getX(), qbVar.A.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), qbVar.A.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.B1()) {
                        canvas.save();
                        canvas.translate(0.0f, s1Var.R);
                        s1Var.C1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    qbVar.A.drawChild(canvas, childAt, jUptimeMillis);
                    if (s1Var.T2()) {
                        canvas.save();
                        canvas.translate(s1Var.getX(), s1Var.getY());
                        s1Var.W1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    qbVar.A.drawChild(canvas, childAt, jUptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.v0) childAt).B(canvas);
                    canvas.restore();
                } else {
                    qbVar.A.drawChild(canvas, childAt, jUptimeMillis);
                }
            }
        }
        qbVar.A.getClass();
        canvas.restore();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }
}
