package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

public final class ov implements jg.j {

    public final int f31413a;

    public final ViewGroup f31414b;

    public ov(ViewGroup viewGroup, int i10) {
        this.f31413a = i10;
        this.f31414b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f31413a) {
            case 0:
                return ((ww) this.f31414b).drawChild(canvas, view, j10);
            case 1:
                return ((zk0) this.f31414b).drawChild(canvas, view, j10);
            case 2:
                ew ewVar = ((yy) this.f31414b).f35059z0;
                if (view instanceof xf.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) ((xf.c) view);
                    if (a8Var.H) {
                        a8Var.b(canvas, ewVar);
                    }
                    canvas.restore();
                }
                return ewVar.drawChild(canvas, view, j10);
            case 3:
                return ((so0) this.f31414b).drawChild(canvas, view, j10);
            default:
                return ((ys0) this.f31414b).drawChild(canvas, view, j10);
        }
    }
}
