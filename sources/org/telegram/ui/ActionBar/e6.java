package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class e6 extends Drawable {
    public float[] f20788b;
    public Path f20787a = new Path();
    public boolean f20789c = true;

    public e6(float f7, float f10) {
        this.f20788b = r0;
        float dp = AndroidUtilities.dp(f7);
        float dp2 = AndroidUtilities.dp(f10);
        float[] fArr = {dp, dp, dp, dp, dp2, dp2, dp2, dp2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f20787a;
        if (this.f20789c) {
            this.f20789c = false;
            path.reset();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f20788b, Path.Direction.CW);
        }
        canvas.drawPath(path, h6.f21388z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f20789c = true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
