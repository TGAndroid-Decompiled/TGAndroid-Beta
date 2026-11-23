package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class qh0 extends Drawable {
    public final int f38930a;
    public final int f38931b;
    public final rh0 f38932c;

    public qh0(rh0 rh0Var, int i7, int i10) {
        this.f38932c = rh0Var;
        this.f38930a = i7;
        this.f38931b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.g0.Q;
        int centerX = getBounds().centerX();
        float f10 = this.f38930a;
        int L = centerX - (org.telegram.messenger.g0.L(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f38931b;
        rect.set(L, centerY - (org.telegram.messenger.g0.L(f11) / 2), (org.telegram.messenger.g0.L(f10) / 2) + getBounds().centerX(), (org.telegram.messenger.g0.L(f11) / 2) + getBounds().centerY());
        rh0 rh0Var = this.f38932c;
        rh0Var.f39233c.z0(rect);
        rh0Var.f39233c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38932c.f39233c.setAlpha(i7 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38932c.f39233c.f22684p1 = colorFilter;
    }
}
