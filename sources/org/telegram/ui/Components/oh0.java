package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class oh0 extends Drawable {
    public final int f38110a;
    public final int f38111b;
    public final ph0 f38112c;

    public oh0(ph0 ph0Var, int i7, int i10) {
        this.f38112c = ph0Var;
        this.f38110a = i7;
        this.f38111b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.g0.Q;
        int centerX = getBounds().centerX();
        float f10 = this.f38110a;
        int L = centerX - (org.telegram.messenger.g0.L(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f38111b;
        rect.set(L, centerY - (org.telegram.messenger.g0.L(f11) / 2), (org.telegram.messenger.g0.L(f10) / 2) + getBounds().centerX(), (org.telegram.messenger.g0.L(f11) / 2) + getBounds().centerY());
        ph0 ph0Var = this.f38112c;
        ph0Var.f38439c.z0(rect);
        ph0Var.f38439c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38112c.f38439c.setAlpha(i7 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38112c.f38439c.f22653p1 = colorFilter;
    }
}
