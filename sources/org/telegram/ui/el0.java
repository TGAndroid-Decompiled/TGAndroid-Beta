package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class el0 extends Drawable {
    public final org.telegram.ui.Components.v01 f33283a;
    public final org.telegram.ui.ActionBar.e6 f33284b;

    public el0(org.telegram.ui.Components.v01 v01Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33283a = v01Var;
        this.f33284b = e6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f33283a.c(getBounds().centerX() - (this.f33283a.f28987c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f33284b), canvas);
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
