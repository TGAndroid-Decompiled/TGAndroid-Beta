package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class ml0 extends Drawable {
    public final org.telegram.ui.Components.r11 f40093a;
    public final org.telegram.ui.ActionBar.c6 f40094b;

    public ml0(org.telegram.ui.Components.r11 r11Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40093a = r11Var;
        this.f40094b = c6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f40093a.c(getBounds().centerX() - (this.f40093a.f29989c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f40094b), canvas);
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
