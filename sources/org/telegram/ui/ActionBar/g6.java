package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class g6 extends Drawable {
    public float[] f19737b;
    public Path f19736a = new Path();
    public boolean f19738c = true;

    public g6(float f10, float f11) {
        this.f19737b = r0;
        float dp = AndroidUtilities.dp(f10);
        float dp2 = AndroidUtilities.dp(f11);
        float[] fArr = {dp, dp, dp, dp, dp2, dp2, dp2, dp2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f19736a;
        if (this.f19738c) {
            this.f19738c = false;
            path.reset();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f19737b, Path.Direction.CW);
        }
        canvas.drawPath(path, j6.f20292z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f19738c = true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
