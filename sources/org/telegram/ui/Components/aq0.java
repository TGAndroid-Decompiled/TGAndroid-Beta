package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class aq0 implements bh.k {
    public final int f24694a;
    public final im0 f24695b;

    public aq0(im0 im0Var, int i10) {
        this.f24694a = i10;
        this.f24695b = im0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f24694a) {
            case 0:
                return ((fq0) this.f24695b).drawChild(canvas, view, j10);
            default:
                return ((ku0) this.f24695b).drawChild(canvas, view, j10);
        }
    }
}
