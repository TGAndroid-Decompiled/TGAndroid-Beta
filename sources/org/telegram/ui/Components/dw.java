package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class dw implements bh.k {
    public final int f25498a;
    public final ViewGroup f25499b;

    public dw(ViewGroup viewGroup, int i10) {
        this.f25498a = i10;
        this.f25499b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f25498a) {
            case 0:
                return ((kx) this.f25499b).drawChild(canvas, view, j3);
            case 1:
                return ((ll0) this.f25499b).drawChild(canvas, view, j3);
            case 2:
                tw twVar = ((kz) this.f25499b).D0;
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
                return ((jp0) this.f25499b).drawChild(canvas, view, j3);
            default:
                return ((pt0) this.f25499b).drawChild(canvas, view, j3);
        }
    }
}
