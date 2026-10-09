package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class ll0 extends Drawable {
    public final org.telegram.ui.Components.l11 f39627a;
    public final org.telegram.ui.ActionBar.e6 f39628b;

    public ll0(org.telegram.ui.Components.l11 l11Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f39627a = l11Var;
        this.f39628b = e6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f39627a.c(getBounds().centerX() - (this.f39627a.f28222c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, this.f39628b), canvas);
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
