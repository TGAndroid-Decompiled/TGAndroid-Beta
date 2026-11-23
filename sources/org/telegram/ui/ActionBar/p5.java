package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class p5 extends Drawable {
    public final int f29893a;
    public final int f29894b;

    public p5(int i7, int i10) {
        this.f29893a = i7;
        this.f29894b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = this.f29893a;
        int i10 = this.f29894b;
        canvas.drawCircle((bounds.centerX() - i7) + i10, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i7 + i10, m6.f29785z);
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
