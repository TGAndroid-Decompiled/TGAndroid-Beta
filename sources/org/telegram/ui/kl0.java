package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class kl0 extends Drawable {
    public final org.telegram.ui.Components.n11 f39375a;
    public final org.telegram.ui.ActionBar.d6 f39376b;

    public kl0(org.telegram.ui.Components.n11 n11Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f39375a = n11Var;
        this.f39376b = d6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f39375a.c(getBounds().centerX() - (this.f39375a.f28902c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f39376b), canvas);
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
