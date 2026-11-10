package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class q5 extends Drawable {
    public final int f28424a;
    public final int f28425b;

    public q5(int i7, int i10) {
        this.f28424a = i7;
        this.f28425b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = this.f28424a;
        int i10 = this.f28425b;
        canvas.drawCircle((bounds.centerX() - i7) + i10, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i7 + i10, m6.f28293z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
