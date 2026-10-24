package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class h6 extends Drawable {
    public float[] f20944b;
    public Path f20943a = new Path();
    public boolean f20945c = true;

    public h6(float f7, float f10) {
        this.f20944b = r0;
        float dp = AndroidUtilities.dp(f7);
        float dp2 = AndroidUtilities.dp(f10);
        float[] fArr = {dp, dp, dp, dp, dp2, dp2, dp2, dp2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f20943a;
        if (this.f20945c) {
            this.f20945c = false;
            path.reset();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f20944b, Path.Direction.CW);
        }
        canvas.drawPath(path, k6.f21582z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f20945c = true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
