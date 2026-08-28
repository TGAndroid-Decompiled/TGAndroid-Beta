package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ns implements ig.j {
    public final int f40802a;
    public final org.telegram.ui.Components.wk0 f40803b;

    public ns(org.telegram.ui.Components.wk0 wk0Var, int i9) {
        this.f40802a = i9;
        this.f40803b = wk0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f40802a) {
            case 0:
            default:
                return this.f40803b.drawChild(canvas, view, j10);
        }
    }
}
