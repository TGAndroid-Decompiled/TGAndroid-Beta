package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class jb extends org.telegram.ui.Components.cu0 {
    public final lb f49077g0;

    public jb(lb lbVar, Context context) {
        super(context, null);
        this.f49077g0 = lbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        lb lbVar = this.f49077g0;
        if (lbVar.f49707w.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, lbVar.f49707w, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, lbVar.f49707w.getY());
        lbVar.f49707w.getClass();
        for (int i7 = 0; i7 < lbVar.f49707w.getChildCount(); i7++) {
            View childAt = lbVar.f49707w.getChildAt(i7);
            RectF rectF2 = lbVar.Q0;
            if (rectF != null && lbVar.f49707w != null && childAt != null) {
                rectF2.set(childAt.getX(), lbVar.f49707w.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), lbVar.f49707w.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            } else {
                z10 = false;
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.L0()) {
                        canvas.save();
                        canvas.translate(0.0f, r1Var.W);
                        r1Var.M0(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    lbVar.f49707w.drawChild(canvas, childAt, uptimeMillis);
                    if (r1Var.k2()) {
                        canvas.save();
                        canvas.translate(r1Var.getX(), r1Var.getY());
                        r1Var.i1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    lbVar.f49707w.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.v0) childAt).L(canvas);
                    canvas.restore();
                } else {
                    lbVar.f49707w.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        lbVar.f49707w.getClass();
        canvas.restore();
    }
}
