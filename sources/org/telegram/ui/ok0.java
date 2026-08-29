package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class ok0 extends Drawable {
    public final org.telegram.ui.Components.zz0 f41187a;
    public final org.telegram.ui.ActionBar.c6 f41188b;

    public ok0(org.telegram.ui.Components.zz0 zz0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41187a = zz0Var;
        this.f41188b = c6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f41187a.c(getBounds().centerX() - (this.f41187a.f35462c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.f41188b), canvas);
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
