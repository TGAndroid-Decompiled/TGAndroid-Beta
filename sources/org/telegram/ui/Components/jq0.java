package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class jq0 implements ah.m {
    public final int f27761a;
    public final qm0 f27762b;

    public jq0(qm0 qm0Var, int i10) {
        this.f27761a = i10;
        this.f27762b = qm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f27761a) {
            case 0:
                return ((oq0) this.f27762b).drawChild(canvas, view, j3);
            default:
                return ((tu0) this.f27762b).drawChild(canvas, view, j3);
        }
    }
}
