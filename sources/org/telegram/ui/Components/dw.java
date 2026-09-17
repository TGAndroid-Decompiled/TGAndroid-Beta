package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class dw implements bh.k {
    public final int f25472a;
    public final ViewGroup f25473b;

    public dw(ViewGroup viewGroup, int i10) {
        this.f25472a = i10;
        this.f25473b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f25472a) {
            case 0:
                return ((kx) this.f25473b).drawChild(canvas, view, j3);
            case 1:
                return ((ll0) this.f25473b).drawChild(canvas, view, j3);
            case 2:
                tw twVar = ((kz) this.f25473b).D0;
                if (view instanceof pg.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) ((pg.c) view);
                    if (f8Var.L) {
                        f8Var.b(canvas, twVar);
                    }
                    canvas.restore();
                }
                return twVar.drawChild(canvas, view, j3);
            case 3:
                return ((jp0) this.f25473b).drawChild(canvas, view, j3);
            default:
                return ((pt0) this.f25473b).drawChild(canvas, view, j3);
        }
    }
}
