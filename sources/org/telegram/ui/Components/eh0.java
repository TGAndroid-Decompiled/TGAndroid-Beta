package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class eh0 extends Drawable {
    public final int f34318a;
    public final int f34319b;
    public final fh0 f34320c;

    public eh0(fh0 fh0Var, int i7, int i10) {
        this.f34320c = fh0Var;
        this.f34318a = i7;
        this.f34319b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.g0.Q;
        int centerX = getBounds().centerX();
        float f10 = this.f34318a;
        int L = centerX - (org.telegram.messenger.g0.L(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f34319b;
        rect.set(L, centerY - (org.telegram.messenger.g0.L(f11) / 2), (org.telegram.messenger.g0.L(f10) / 2) + getBounds().centerX(), (org.telegram.messenger.g0.L(f11) / 2) + getBounds().centerY());
        fh0 fh0Var = this.f34320c;
        fh0Var.f34612c.z0(rect);
        fh0Var.f34612c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34320c.f34612c.setAlpha(i7 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34320c.f34612c.f22290p1 = colorFilter;
    }
}
