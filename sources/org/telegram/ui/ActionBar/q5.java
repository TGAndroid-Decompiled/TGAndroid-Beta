package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class q5 extends Drawable {
    public final int f29907a;
    public final int f29908b;

    public q5(int i7, int i10) {
        this.f29907a = i7;
        this.f29908b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = this.f29907a;
        int i10 = this.f29908b;
        canvas.drawCircle((bounds.centerX() - i7) + i10, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i7 + i10, n6.f29798z);
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
