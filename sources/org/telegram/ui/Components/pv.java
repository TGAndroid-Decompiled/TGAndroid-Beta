package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class pv implements ig.j {
    public final int f31765a;
    public final ViewGroup f31766b;

    public pv(ViewGroup viewGroup, int i9) {
        this.f31765a = i9;
        this.f31766b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f31765a) {
            case 0:
                return ((ww) this.f31766b).drawChild(canvas, view, j10);
            case 1:
                return ((wk0) this.f31766b).drawChild(canvas, view, j10);
            case 2:
                fw fwVar = ((wy) this.f31766b).f34466z0;
                if (view instanceof wf.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) ((wf.c) view);
                    if (d8Var.H) {
                        d8Var.b(canvas, fwVar);
                    }
                    canvas.restore();
                }
                return fwVar.drawChild(canvas, view, j10);
            case 3:
                return ((so0) this.f31766b).drawChild(canvas, view, j10);
            default:
                return ((ws0) this.f31766b).drawChild(canvas, view, j10);
        }
    }
}
