package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class aq0 implements bh.k {
    public final int f24701a;
    public final im0 f24702b;

    public aq0(im0 im0Var, int i10) {
        this.f24701a = i10;
        this.f24702b = im0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f24701a) {
            case 0:
                return ((fq0) this.f24702b).drawChild(canvas, view, j10);
            default:
                return ((ku0) this.f24702b).drawChild(canvas, view, j10);
        }
    }
}
