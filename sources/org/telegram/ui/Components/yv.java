package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class yv implements ng.j {
    public final int f31173a;
    public final ViewGroup f31174b;

    public yv(ViewGroup viewGroup, int i10) {
        this.f31173a = i10;
        this.f31174b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f31173a) {
            case 0:
                return ((ix) this.f31174b).drawChild(canvas, view, j10);
            case 1:
                return ((rl0) this.f31174b).drawChild(canvas, view, j10);
            case 2:
                pw pwVar = ((kz) this.f31174b).A0;
                if (view instanceof bg.d) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) ((bg.d) view);
                    if (c8Var.I) {
                        c8Var.b(canvas, pwVar);
                    }
                    canvas.restore();
                }
                return pwVar.drawChild(canvas, view, j10);
            case 3:
                return ((lp0) this.f31174b).drawChild(canvas, view, j10);
            default:
                return ((pt0) this.f31174b).drawChild(canvas, view, j10);
        }
    }
}
