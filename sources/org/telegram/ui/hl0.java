package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class hl0 extends Drawable {
    public final org.telegram.ui.Components.g01 f34321a;
    public final org.telegram.ui.ActionBar.e6 f34322b;

    public hl0(org.telegram.ui.Components.g01 g01Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f34321a = g01Var;
        this.f34322b = e6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f34321a.c(getBounds().centerX() - (this.f34321a.f24146c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f34322b), canvas);
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
