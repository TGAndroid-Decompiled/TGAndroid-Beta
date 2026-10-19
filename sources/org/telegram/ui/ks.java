package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ks implements bh.k {
    public final int f38654a;
    public final org.telegram.ui.Components.im0 f38655b;

    public ks(org.telegram.ui.Components.im0 im0Var, int i10) {
        this.f38654a = i10;
        this.f38655b = im0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f38654a) {
            case 0:
            default:
                return this.f38655b.drawChild(canvas, view, j10);
        }
    }
}
