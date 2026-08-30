package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class zv implements ng.j {
    public final int f31444a;
    public final ViewGroup f31445b;

    public zv(ViewGroup viewGroup, int i10) {
        this.f31444a = i10;
        this.f31445b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f31444a) {
            case 0:
                return ((ix) this.f31445b).drawChild(canvas, view, j10);
            case 1:
                return ((sl0) this.f31445b).drawChild(canvas, view, j10);
            case 2:
                pw pwVar = ((kz) this.f31445b).A0;
                if (view instanceof bg.d) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) ((bg.d) view);
                    if (d8Var.I) {
                        d8Var.b(canvas, pwVar);
                    }
                    canvas.restore();
                }
                return pwVar.drawChild(canvas, view, j10);
            case 3:
                return ((mp0) this.f31445b).drawChild(canvas, view, j10);
            default:
                return ((pt0) this.f31445b).drawChild(canvas, view, j10);
        }
    }
}
