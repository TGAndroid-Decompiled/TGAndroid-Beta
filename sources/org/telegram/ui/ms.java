package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ms implements lg.j {
    public final int f40629a;
    public final org.telegram.ui.Components.jl0 f40630b;

    public ms(org.telegram.ui.Components.jl0 jl0Var, int i10) {
        this.f40629a = i10;
        this.f40630b = jl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f40629a) {
            case 0:
            default:
                return this.f40630b.drawChild(canvas, view, j10);
        }
    }
}
