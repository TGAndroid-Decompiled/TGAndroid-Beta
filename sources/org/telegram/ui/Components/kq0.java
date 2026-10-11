package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class kq0 implements ah.m {
    public final int f28118a;
    public final rm0 f28119b;

    public kq0(rm0 rm0Var, int i10) {
        this.f28118a = i10;
        this.f28119b = rm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28118a) {
            case 0:
                return ((pq0) this.f28119b).drawChild(canvas, view, j3);
            default:
                return ((uu0) this.f28119b).drawChild(canvas, view, j3);
        }
    }
}
