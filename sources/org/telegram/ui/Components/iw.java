package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class iw implements zg.j {
    public final int f24143a;
    public final ViewGroup f24144b;

    public iw(ViewGroup viewGroup, int i10) {
        this.f24143a = i10;
        this.f24144b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f24143a) {
            case 0:
                return ((px) this.f24144b).drawChild(canvas, view, j3);
            case 1:
                return ((vl0) this.f24144b).drawChild(canvas, view, j3);
            case 2:
                yw ywVar = ((rz) this.f24144b).D0;
                if (view instanceof ng.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) ((ng.c) view);
                    if (g8Var.L) {
                        g8Var.b(canvas, ywVar);
                    }
                    canvas.restore();
                }
                return ywVar.drawChild(canvas, view, j3);
            case 3:
                return ((tp0) this.f24144b).drawChild(canvas, view, j3);
            default:
                return ((zt0) this.f24144b).drawChild(canvas, view, j3);
        }
    }
}
