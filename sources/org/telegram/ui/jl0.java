package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class jl0 extends Drawable {
    public final org.telegram.ui.Components.h01 f34901a;
    public final org.telegram.ui.ActionBar.f6 f34902b;

    public jl0(org.telegram.ui.Components.h01 h01Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f34901a = h01Var;
        this.f34902b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f34901a.c(getBounds().centerX() - (this.f34901a.f24439c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f34902b), canvas);
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
