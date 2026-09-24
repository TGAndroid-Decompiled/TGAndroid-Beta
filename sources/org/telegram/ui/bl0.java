package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class bl0 extends Drawable {
    public final org.telegram.ui.Components.t01 f32434a;
    public final org.telegram.ui.ActionBar.d6 f32435b;

    public bl0(org.telegram.ui.Components.t01 t01Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f32434a = t01Var;
        this.f32435b = d6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f32434a.c(getBounds().centerX() - (this.f32434a.f28357c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.f32435b), canvas);
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
