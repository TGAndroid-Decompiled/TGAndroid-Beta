package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class d6 extends Drawable {
    public float[] f22884b;
    public Path f22883a = new Path();
    public boolean f22885c = true;

    public d6(float f9, float f10) {
        this.f22884b = r0;
        float dp = AndroidUtilities.dp(f9);
        float dp2 = AndroidUtilities.dp(f10);
        float[] fArr = {dp, dp, dp, dp, dp2, dp2, dp2, dp2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f22883a;
        if (this.f22885c) {
            this.f22885c = false;
            path.reset();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f22884b, Path.Direction.CW);
        }
        canvas.drawPath(path, g6.f23443z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f22885c = true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
