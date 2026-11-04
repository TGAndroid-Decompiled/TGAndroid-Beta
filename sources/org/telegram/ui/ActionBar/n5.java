package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class n5 extends Drawable {
    public final int f28357a;
    public final int f28358b;

    public n5(int i3, int i10) {
        this.f28357a = i3;
        this.f28358b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i3 = this.f28357a;
        int i10 = this.f28358b;
        canvas.drawCircle((bounds.centerX() - i3) + i10, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i3 + i10, k6.f28283z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
