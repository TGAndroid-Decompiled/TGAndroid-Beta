package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ks implements bh.k {
    public final int f38656a;
    public final org.telegram.ui.Components.im0 f38657b;

    public ks(org.telegram.ui.Components.im0 im0Var, int i10) {
        this.f38656a = i10;
        this.f38657b = im0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f38656a) {
            case 0:
            default:
                return this.f38657b.drawChild(canvas, view, j10);
        }
    }
}
