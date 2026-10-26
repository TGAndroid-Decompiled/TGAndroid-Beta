package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class cl0 extends Drawable {
    public final org.telegram.ui.Components.q11 f38496a;
    public final org.telegram.ui.ActionBar.u6 f38497b;

    public cl0(org.telegram.ui.Components.q11 q11Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f38496a = q11Var;
        this.f38497b = u6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f38496a.c(getBounds().centerX() - (this.f38496a.f31790c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f38497b), canvas);
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
