package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class pb extends org.telegram.ui.Components.qv0 {
    public final sb f40005t0;

    public pb(sb sbVar, Context context) {
        super(context, null);
        this.f40005t0 = sbVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z4;
        long uptimeMillis = SystemClock.uptimeMillis();
        sb sbVar = this.f40005t0;
        if (sbVar.B.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, sbVar.B, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, sbVar.B.getY());
        sbVar.B.getClass();
        for (int i10 = 0; i10 < sbVar.B.getChildCount(); i10++) {
            View childAt = sbVar.B.getChildAt(i10);
            RectF rectF2 = sbVar.T0;
            if (rectF != null && sbVar.B != null && childAt != null) {
                rectF2.set(childAt.getX(), sbVar.B.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), sbVar.B.getY() + childAt.getY() + childAt.getHeight());
                z4 = !rectF2.intersect(rectF);
            } else {
                z4 = false;
            }
            if (!z4) {
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, t1Var.S);
                        t1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    sbVar.B.drawChild(canvas, childAt, uptimeMillis);
                    if (t1Var.U2()) {
                        canvas.save();
                        canvas.translate(t1Var.getX(), t1Var.getY());
                        t1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    sbVar.B.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                    canvas.restore();
                } else {
                    sbVar.B.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        sbVar.B.getClass();
        canvas.restore();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }
}
