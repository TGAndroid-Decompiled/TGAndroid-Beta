package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class up0 implements ah.m {
    public final int f28907a;
    public final zl0 f28908b;

    public up0(zl0 zl0Var, int i10) {
        this.f28907a = i10;
        this.f28908b = zl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28907a) {
            case 0:
                return ((zp0) this.f28908b).drawChild(canvas, view, j3);
            default:
                return ((eu0) this.f28908b).drawChild(canvas, view, j3);
        }
    }
}
