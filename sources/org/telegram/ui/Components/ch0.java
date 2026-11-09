package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class ch0 extends Drawable {
    public final int f32691a;
    public final int f32692b;
    public final dh0 f32693c;

    public ch0(dh0 dh0Var, int i7, int i10) {
        this.f32693c = dh0Var;
        this.f32691a = i7;
        this.f32692b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.g0.Q;
        int centerX = getBounds().centerX();
        float f10 = this.f32691a;
        int L = centerX - (org.telegram.messenger.g0.L(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f32692b;
        rect.set(L, centerY - (org.telegram.messenger.g0.L(f11) / 2), (org.telegram.messenger.g0.L(f10) / 2) + getBounds().centerX(), (org.telegram.messenger.g0.L(f11) / 2) + getBounds().centerY());
        dh0 dh0Var = this.f32693c;
        dh0Var.f32983c.z0(rect);
        dh0Var.f32983c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32693c.f32983c.setAlpha(i7 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32693c.f32983c.f21209o1 = colorFilter;
    }
}
