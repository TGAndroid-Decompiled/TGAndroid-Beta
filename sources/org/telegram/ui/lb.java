package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class lb extends org.telegram.ui.Components.hv0 {
    public final ob f40152s0;

    public lb(ob obVar, Context context) {
        super(context, null);
        this.f40152s0 = obVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        ob obVar = this.f40152s0;
        if (obVar.A.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, obVar.A, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, obVar.A.getY());
        obVar.A.getClass();
        for (int i10 = 0; i10 < obVar.A.getChildCount(); i10++) {
            View childAt = obVar.A.getChildAt(i10);
            RectF rectF2 = obVar.S0;
            if (rectF != null && obVar.A != null && childAt != null) {
                rectF2.set(childAt.getX(), obVar.A.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), obVar.A.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            } else {
                z10 = false;
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, s1Var.R);
                        s1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    obVar.A.drawChild(canvas, childAt, uptimeMillis);
                    if (s1Var.U2()) {
                        canvas.save();
                        canvas.translate(s1Var.getX(), s1Var.getY());
                        s1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    obVar.A.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                    canvas.restore();
                } else {
                    obVar.A.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        obVar.A.getClass();
        canvas.restore();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }
}
