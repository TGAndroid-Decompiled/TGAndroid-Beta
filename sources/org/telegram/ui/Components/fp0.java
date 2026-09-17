package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class fp0 implements ah.n {
    public final int f23971a;
    public final ml0 f23972b;

    public fp0(ml0 ml0Var, int i10) {
        this.f23971a = i10;
        this.f23972b = ml0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f23971a) {
            case 0:
                return ((kp0) this.f23972b).drawChild(canvas, view, j3);
            default:
                return ((rt0) this.f23972b).drawChild(canvas, view, j3);
        }
    }
}
