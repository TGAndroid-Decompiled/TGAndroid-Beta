package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class bq0 implements bh.k {
    public final int f25013a;
    public final jm0 f25014b;

    public bq0(jm0 jm0Var, int i10) {
        this.f25013a = i10;
        this.f25014b = jm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f25013a) {
            case 0:
                return ((hq0) this.f25014b).drawChild(canvas, view, j10);
            default:
                return ((mu0) this.f25014b).drawChild(canvas, view, j10);
        }
    }
}
