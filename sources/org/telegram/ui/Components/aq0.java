package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class aq0 implements bh.k {
    public final int f24676a;
    public final im0 f24677b;

    public aq0(im0 im0Var, int i10) {
        this.f24676a = i10;
        this.f24677b = im0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f24676a) {
            case 0:
                return ((gq0) this.f24677b).drawChild(canvas, view, j10);
            default:
                return ((lu0) this.f24677b).drawChild(canvas, view, j10);
        }
    }
}
