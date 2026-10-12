package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class ml0 extends Drawable {
    public final org.telegram.ui.Components.r11 f40090a;
    public final org.telegram.ui.ActionBar.c6 f40091b;

    public ml0(org.telegram.ui.Components.r11 r11Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40090a = r11Var;
        this.f40091b = c6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f40090a.c(getBounds().centerX() - (this.f40090a.f29988c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f40091b), canvas);
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
