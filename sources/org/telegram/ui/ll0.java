package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class ll0 extends Drawable {
    public final org.telegram.ui.Components.m11 f39673a;
    public final org.telegram.ui.ActionBar.e6 f39674b;

    public ll0(org.telegram.ui.Components.m11 m11Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f39673a = m11Var;
        this.f39674b = e6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f39673a.c(getBounds().centerX() - (this.f39673a.f28602c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, this.f39674b), canvas);
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
