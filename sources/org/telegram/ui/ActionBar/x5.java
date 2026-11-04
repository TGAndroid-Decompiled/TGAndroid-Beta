package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class x5 extends Drawable {
    public static Paint f28807c;
    public Paint f28808a;
    public float f28809b;

    @Override
    public final void draw(Canvas canvas) {
        int L;
        Rect bounds = getBounds();
        float f10 = this.f28809b;
        if (Math.abs(f10 - (-1.0f)) < 0.01f) {
            L = Math.max(bounds.width(), bounds.height()) / 2;
        } else if (Math.abs(f10 - (-2.0f)) < 0.01f) {
            L = (int) Math.ceil(Math.sqrt(((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY())) + ((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX()))));
        } else {
            L = org.telegram.messenger.g0.L(f10);
        }
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), L, this.f28808a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
