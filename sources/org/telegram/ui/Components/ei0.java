package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class ei0 extends Drawable {
    public final int f25843a;
    public final int f25844b;
    public final fi0 f25845c;

    public ei0(fi0 fi0Var, int i10, int i11) {
        this.f25845c = fi0Var;
        this.f25843a = i10;
        this.f25844b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = org.telegram.messenger.i0.Q;
        int centerX = getBounds().centerX();
        float f7 = this.f25843a;
        int L = centerX - (org.telegram.messenger.i0.L(f7) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.f25844b;
        rect.set(L, centerY - (org.telegram.messenger.i0.L(f10) / 2), (org.telegram.messenger.i0.L(f7) / 2) + getBounds().centerX(), (org.telegram.messenger.i0.L(f10) / 2) + getBounds().centerY());
        fi0 fi0Var = this.f25845c;
        fi0Var.f26173c.z0(rect);
        fi0Var.f26173c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25845c.f26173c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25845c.f26173c.f14398o1 = colorFilter;
    }
}
