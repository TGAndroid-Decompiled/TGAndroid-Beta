package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class c6 extends Drawable {
    public float[] f22814b;
    public Path f22813a = new Path();
    public boolean f22815c = true;

    public c6(float f10, float f11) {
        this.f22814b = r0;
        float dp = AndroidUtilities.dp(f10);
        float dp2 = AndroidUtilities.dp(f11);
        float[] fArr = {dp, dp, dp, dp, dp2, dp2, dp2, dp2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f22813a;
        if (this.f22815c) {
            this.f22815c = false;
            path.reset();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f22814b, Path.Direction.CW);
        }
        canvas.drawPath(path, f6.f23379z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f22815c = true;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
