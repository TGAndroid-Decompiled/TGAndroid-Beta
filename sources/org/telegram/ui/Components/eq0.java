package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class eq0 implements bh.k {
    public final int f26092a;
    public final lm0 f26093b;

    public eq0(lm0 lm0Var, int i10) {
        this.f26092a = i10;
        this.f26093b = lm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f26092a) {
            case 0:
                return ((kq0) this.f26093b).drawChild(canvas, view, j10);
            default:
                return ((ou0) this.f26093b).drawChild(canvas, view, j10);
        }
    }
}
