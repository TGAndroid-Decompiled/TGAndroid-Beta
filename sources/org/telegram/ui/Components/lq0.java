package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class lq0 implements ah.m {
    public final int f28418a;
    public final sm0 f28419b;

    public lq0(sm0 sm0Var, int i10) {
        this.f28418a = i10;
        this.f28419b = sm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28418a) {
            case 0:
                return ((qq0) this.f28419b).drawChild(canvas, view, j3);
            default:
                return ((vu0) this.f28419b).drawChild(canvas, view, j3);
        }
    }
}
