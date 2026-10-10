package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class f6 extends Drawable {
    public float[] f20627b;
    public Path f20626a = new Path();
    public boolean f20628c = true;

    public f6(float f7, float f10) {
        this.f20627b = r0;
        float dp = AndroidUtilities.dp(f7);
        float dp2 = AndroidUtilities.dp(f10);
        float[] fArr = {dp, dp, dp, dp, dp2, dp2, dp2, dp2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f20626a;
        if (this.f20628c) {
            this.f20628c = false;
            path.reset();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f20627b, Path.Direction.CW);
        }
        canvas.drawPath(path, i6.f21196z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f20628c = true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
