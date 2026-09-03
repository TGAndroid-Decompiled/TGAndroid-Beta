package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class h6 extends Drawable {
    public float[] f21445b;
    public Path f21444a = new Path();
    public boolean f21446c = true;

    public h6(float f10, float f11) {
        this.f21445b = r0;
        float dp = AndroidUtilities.dp(f10);
        float dp2 = AndroidUtilities.dp(f11);
        float[] fArr = {dp, dp, dp, dp, dp2, dp2, dp2, dp2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f21444a;
        if (this.f21446c) {
            this.f21446c = false;
            path.reset();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f21445b, Path.Direction.CW);
        }
        canvas.drawPath(path, k6.f22049z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f21446c = true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
