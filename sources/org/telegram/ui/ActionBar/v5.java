package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class v5 extends Drawable {
    public static Paint f23906c;
    public Paint f23907a;
    public float f23908b;

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        Rect bounds = getBounds();
        float f9 = this.f23908b;
        if (Math.abs(f9 - (-1.0f)) < 0.01f) {
            dp = Math.max(bounds.width(), bounds.height()) / 2;
        } else if (Math.abs(f9 - (-2.0f)) < 0.01f) {
            dp = (int) Math.ceil(Math.sqrt(((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY())) + ((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX()))));
        } else {
            dp = AndroidUtilities.dp(f9);
        }
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), dp, this.f23907a);
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
