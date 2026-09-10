package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class jl0 extends Drawable {
    public final org.telegram.ui.Components.t01 f34131a;
    public final org.telegram.ui.ActionBar.f6 f34132b;

    public jl0(org.telegram.ui.Components.t01 t01Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f34131a = t01Var;
        this.f34132b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f34131a.c(getBounds().centerX() - (this.f34131a.f27247c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f34132b), canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
