package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class rp0 implements ah.m {
    public final int f28015a;
    public final wl0 f28016b;

    public rp0(wl0 wl0Var, int i10) {
        this.f28015a = i10;
        this.f28016b = wl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28015a) {
            case 0:
                return ((wp0) this.f28016b).drawChild(canvas, view, j3);
            default:
                return ((bu0) this.f28016b).drawChild(canvas, view, j3);
        }
    }
}
