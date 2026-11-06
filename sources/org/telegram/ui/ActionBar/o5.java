package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class o5 extends Drawable {
    public final int f28344a;
    public final int f28345b;

    public o5(int i7, int i10) {
        this.f28344a = i7;
        this.f28345b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = this.f28344a;
        int i10 = this.f28345b;
        canvas.drawCircle((bounds.centerX() - i7) + i10, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i7 + i10, k6.f28251z);
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
