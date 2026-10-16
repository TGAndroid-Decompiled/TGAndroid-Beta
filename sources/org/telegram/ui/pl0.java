package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class pl0 extends Drawable {
    public final org.telegram.ui.Components.i11 f38972a;
    public final org.telegram.ui.ActionBar.c6 f38973b;

    public pl0(org.telegram.ui.Components.i11 i11Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f38972a = i11Var;
        this.f38973b = c6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f38972a.c(getBounds().centerX() - (this.f38972a.f25455c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.f38973b), canvas);
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
