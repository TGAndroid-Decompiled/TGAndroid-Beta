package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class eh0 extends Drawable {
    public final int f33396a;
    public final int f33397b;
    public final fh0 f33398c;

    public eh0(fh0 fh0Var, int i3, int i10) {
        this.f33398c = fh0Var;
        this.f33396a = i3;
        this.f33397b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.g0.Q;
        int centerX = getBounds().centerX();
        float f10 = this.f33396a;
        int L = centerX - (org.telegram.messenger.g0.L(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f33397b;
        rect.set(L, centerY - (org.telegram.messenger.g0.L(f11) / 2), (org.telegram.messenger.g0.L(f10) / 2) + getBounds().centerX(), (org.telegram.messenger.g0.L(f11) / 2) + getBounds().centerY());
        fh0 fh0Var = this.f33398c;
        fh0Var.f33799c.z0(rect);
        fh0Var.f33799c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f33398c.f33799c.setAlpha(i3 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33398c.f33799c.f21261p1 = colorFilter;
    }
}
