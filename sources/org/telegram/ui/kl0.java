package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class kl0 extends Drawable {
    public final org.telegram.ui.Components.f01 f38088a;
    public final org.telegram.ui.ActionBar.f6 f38089b;

    public kl0(org.telegram.ui.Components.f01 f01Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f38088a = f01Var;
        this.f38089b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f38088a.c(getBounds().centerX() - (this.f38088a.f25847c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f38089b), canvas);
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
