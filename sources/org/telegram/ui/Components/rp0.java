package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class rp0 implements ah.m {
    public final int f28024a;
    public final wl0 f28025b;

    public rp0(wl0 wl0Var, int i10) {
        this.f28024a = i10;
        this.f28025b = wl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28024a) {
            case 0:
                return ((wp0) this.f28025b).drawChild(canvas, view, j3);
            default:
                return ((bu0) this.f28025b).drawChild(canvas, view, j3);
        }
    }
}
