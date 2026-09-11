package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class x5 extends Drawable {
    public static Paint f21520c;
    public Paint f21521a;
    public float f21522b;

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        Rect bounds = getBounds();
        float f7 = this.f21522b;
        if (Math.abs(f7 - (-1.0f)) < 0.01f) {
            dp = Math.max(bounds.width(), bounds.height()) / 2;
        } else if (Math.abs(f7 - (-2.0f)) < 0.01f) {
            dp = (int) Math.ceil(Math.sqrt(((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY())) + ((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX()))));
        } else {
            dp = AndroidUtilities.dp(f7);
        }
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), dp, this.f21521a);
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
