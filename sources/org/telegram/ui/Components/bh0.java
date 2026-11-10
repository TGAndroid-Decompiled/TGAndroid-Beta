package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class bh0 extends Drawable {
    public final int f32267a;
    public final int f32268b;
    public final ch0 f32269c;

    public bh0(ch0 ch0Var, int i7, int i10) {
        this.f32269c = ch0Var;
        this.f32267a = i7;
        this.f32268b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.g0.Q;
        int centerX = getBounds().centerX();
        float f10 = this.f32267a;
        int L = centerX - (org.telegram.messenger.g0.L(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f32268b;
        rect.set(L, centerY - (org.telegram.messenger.g0.L(f11) / 2), (org.telegram.messenger.g0.L(f10) / 2) + getBounds().centerX(), (org.telegram.messenger.g0.L(f11) / 2) + getBounds().centerY());
        ch0 ch0Var = this.f32269c;
        ch0Var.f32587c.z0(rect);
        ch0Var.f32587c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32269c.f32587c.setAlpha(i7 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32269c.f32587c.f21214o1 = colorFilter;
    }
}
