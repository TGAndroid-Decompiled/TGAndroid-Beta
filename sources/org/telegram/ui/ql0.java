package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class ql0 extends Drawable {
    public final org.telegram.ui.Components.h11 f39492a;
    public final org.telegram.ui.ActionBar.c6 f39493b;

    public ql0(org.telegram.ui.Components.h11 h11Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f39492a = h11Var;
        this.f39493b = c6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f39492a.c(getBounds().centerX() - (this.f39492a.f25473c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.f39493b), canvas);
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
