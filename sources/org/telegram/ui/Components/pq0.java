package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class pq0 implements ah.m {
    public final int f29564a;
    public final wm0 f29565b;

    public pq0(wm0 wm0Var, int i10) {
        this.f29564a = i10;
        this.f29565b = wm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f29564a) {
            case 0:
                return ((uq0) this.f29565b).drawChild(canvas, view, j3);
            default:
                return ((zu0) this.f29565b).drawChild(canvas, view, j3);
        }
    }
}
