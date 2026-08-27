package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class d6 extends Drawable {

    public float[] f22867b;

    public Path f22866a = new Path();

    public boolean f22868c = true;

    public d6(float f10, float f11) {
        this.f22867b = new float[]{fDp, fDp, fDp, fDp, fDp, fDp, fDp, fDp};
        float fDp = AndroidUtilities.dp(f10);
        float fDp2 = AndroidUtilities.dp(f11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f22866a;
        if (this.f22868c) {
            this.f22868c = false;
            path.reset();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f22867b, Path.Direction.CW);
        }
        canvas.drawPath(path, g6.f23434z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f22868c = true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
