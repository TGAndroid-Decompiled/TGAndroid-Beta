package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class el0 extends Drawable {
    public final org.telegram.ui.Components.r11 f38907a;
    public final org.telegram.ui.ActionBar.u6 f38908b;

    public el0(org.telegram.ui.Components.r11 r11Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f38907a = r11Var;
        this.f38908b = u6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f38907a.c(getBounds().centerX() - (this.f38907a.f32090c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f38908b), canvas);
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
