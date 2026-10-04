package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class fl0 extends Drawable {
    public final org.telegram.ui.Components.e11 f36348a;
    public final org.telegram.ui.ActionBar.d6 f36349b;

    public fl0(org.telegram.ui.Components.e11 e11Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f36348a = e11Var;
        this.f36349b = d6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f36348a.c(getBounds().centerX() - (this.f36348a.f25884c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f36349b), canvas);
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
