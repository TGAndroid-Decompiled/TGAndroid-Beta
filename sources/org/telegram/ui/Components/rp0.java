package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class rp0 implements ah.n {
    public final int f27937a;
    public final vl0 f27938b;

    public rp0(vl0 vl0Var, int i10) {
        this.f27937a = i10;
        this.f27938b = vl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f27937a) {
            case 0:
                return ((wp0) this.f27938b).drawChild(canvas, view, j3);
            default:
                return ((bu0) this.f27938b).drawChild(canvas, view, j3);
        }
    }
}
