package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class bh0 extends Drawable {
    public final int f32154a;
    public final int f32155b;
    public final ch0 f32156c;

    public bh0(ch0 ch0Var, int i7, int i10) {
        this.f32156c = ch0Var;
        this.f32154a = i7;
        this.f32155b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.g0.Q;
        int centerX = getBounds().centerX();
        float f10 = this.f32154a;
        int L = centerX - (org.telegram.messenger.g0.L(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f32155b;
        rect.set(L, centerY - (org.telegram.messenger.g0.L(f11) / 2), (org.telegram.messenger.g0.L(f10) / 2) + getBounds().centerX(), (org.telegram.messenger.g0.L(f11) / 2) + getBounds().centerY());
        ch0 ch0Var = this.f32156c;
        ch0Var.f32571c.z0(rect);
        ch0Var.f32571c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32156c.f32571c.setAlpha(i7 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32156c.f32571c.f21206o1 = colorFilter;
    }
}
