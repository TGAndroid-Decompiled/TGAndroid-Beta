package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class sp0 implements ah.n {
    public final int f28217a;
    public final wl0 f28218b;

    public sp0(wl0 wl0Var, int i10) {
        this.f28217a = i10;
        this.f28218b = wl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28217a) {
            case 0:
                return ((xp0) this.f28218b).drawChild(canvas, view, j3);
            default:
                return ((cu0) this.f28218b).drawChild(canvas, view, j3);
        }
    }
}
