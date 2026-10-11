package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class kl0 extends Drawable {
    public final org.telegram.ui.Components.m11 f39409a;
    public final org.telegram.ui.ActionBar.d6 f39410b;

    public kl0(org.telegram.ui.Components.m11 m11Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f39409a = m11Var;
        this.f39410b = d6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f39409a.c(getBounds().centerX() - (this.f39409a.f28678c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f39410b), canvas);
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
