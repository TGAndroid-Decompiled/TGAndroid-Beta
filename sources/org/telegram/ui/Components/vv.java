package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class vv implements lg.j {
    public final int f34182a;
    public final ViewGroup f34183b;

    public vv(ViewGroup viewGroup, int i10) {
        this.f34182a = i10;
        this.f34183b = viewGroup;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f34182a) {
            case 0:
                return ((dx) this.f34183b).drawChild(canvas, view, j10);
            case 1:
                return ((jl0) this.f34183b).drawChild(canvas, view, j10);
            case 2:
                lw lwVar = ((fz) this.f34183b).f28657z0;
                if (view instanceof zf.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) ((zf.c) view);
                    if (b8Var.H) {
                        b8Var.b(canvas, lwVar);
                    }
                    canvas.restore();
                }
                return lwVar.drawChild(canvas, view, j10);
            case 3:
                return ((dp0) this.f34183b).drawChild(canvas, view, j10);
            default:
                return ((ht0) this.f34183b).drawChild(canvas, view, j10);
        }
    }
}
