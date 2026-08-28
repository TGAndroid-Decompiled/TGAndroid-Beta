package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class l5 extends Drawable {
    public final int f23646a;
    public final int f23647b;

    public l5(int i9, int i10) {
        this.f23646a = i9;
        this.f23647b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i9 = this.f23646a;
        int i10 = this.f23647b;
        canvas.drawCircle((bounds.centerX() - i9) + i10, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i9 + i10, f6.f23379z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
