package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class bw implements og.j {
    public final int f25693a;
    public final ViewGroup f25694b;

    public bw(ViewGroup viewGroup, int i10) {
        this.f25693a = i10;
        this.f25694b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f25693a) {
            case 0:
                return ((kx) this.f25694b).drawChild(canvas, view, j10);
            case 1:
                return ((sl0) this.f25694b).drawChild(canvas, view, j10);
            case 2:
                rw rwVar = ((mz) this.f25694b).A0;
                if (view instanceof cg.d) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) ((cg.d) view);
                    if (d8Var.I) {
                        d8Var.b(canvas, rwVar);
                    }
                    canvas.restore();
                }
                return rwVar.drawChild(canvas, view, j10);
            case 3:
                return ((mp0) this.f25694b).drawChild(canvas, view, j10);
            default:
                return ((pt0) this.f25694b).drawChild(canvas, view, j10);
        }
    }
}
