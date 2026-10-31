package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class i6 extends Drawable {
    public static Paint f20432c;
    public Paint f20433a;
    public float f20434b;

    @Override
    public final void draw(Canvas canvas) {
        int L;
        Rect bounds = getBounds();
        float f7 = this.f20434b;
        if (Math.abs(f7 - (-1.0f)) < 0.01f) {
            L = Math.max(bounds.width(), bounds.height()) / 2;
        } else if (Math.abs(f7 - (-2.0f)) < 0.01f) {
            L = (int) Math.ceil(Math.sqrt(((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY())) + ((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX()))));
        } else {
            L = org.telegram.messenger.i0.L(f7);
        }
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), L, this.f20433a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
