package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class kl0 extends Drawable {
    public final org.telegram.ui.Components.v01 f35144a;
    public final org.telegram.ui.ActionBar.e6 f35145b;

    public kl0(org.telegram.ui.Components.v01 v01Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f35144a = v01Var;
        this.f35145b = e6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f35144a.c(getBounds().centerX() - (this.f35144a.f28868c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f35145b), canvas);
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
