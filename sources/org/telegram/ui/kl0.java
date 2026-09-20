package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class kl0 extends Drawable {
    public final org.telegram.ui.Components.u01 f35207a;
    public final org.telegram.ui.ActionBar.f6 f35208b;

    public kl0(org.telegram.ui.Components.u01 u01Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35207a = u01Var;
        this.f35208b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f35207a.c(getBounds().centerX() - (this.f35207a.f28493c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f35208b), canvas);
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
