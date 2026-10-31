package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class di0 extends Drawable {
    public final int f25420a;
    public final int f25421b;
    public final ei0 f25422c;

    public di0(ei0 ei0Var, int i10, int i11) {
        this.f25422c = ei0Var;
        this.f25420a = i10;
        this.f25421b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.i0.Q;
        int centerX = getBounds().centerX();
        float f7 = this.f25420a;
        int L = centerX - (org.telegram.messenger.i0.L(f7) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.f25421b;
        rect.set(L, centerY - (org.telegram.messenger.i0.L(f10) / 2), (org.telegram.messenger.i0.L(f7) / 2) + getBounds().centerX(), (org.telegram.messenger.i0.L(f10) / 2) + getBounds().centerY());
        ei0 ei0Var = this.f25422c;
        ei0Var.f25809c.z0(rect);
        ei0Var.f25809c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25422c.f25809c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25422c.f25809c.f14397o1 = colorFilter;
    }
}
