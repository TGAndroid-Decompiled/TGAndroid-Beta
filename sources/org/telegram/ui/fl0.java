package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class fl0 extends Drawable {
    public final org.telegram.ui.Components.f11 f36356a;
    public final org.telegram.ui.ActionBar.d6 f36357b;

    public fl0(org.telegram.ui.Components.f11 f11Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f36356a = f11Var;
        this.f36357b = d6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f36356a.c(getBounds().centerX() - (this.f36356a.f26266c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f36357b), canvas);
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
