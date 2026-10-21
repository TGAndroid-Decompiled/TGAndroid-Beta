package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ks implements bh.k {
    public final int f38661a;
    public final org.telegram.ui.Components.jm0 f38662b;

    public ks(org.telegram.ui.Components.jm0 jm0Var, int i10) {
        this.f38661a = i10;
        this.f38662b = jm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f38661a) {
            case 0:
            default:
                return this.f38662b.drawChild(canvas, view, j10);
        }
    }
}
