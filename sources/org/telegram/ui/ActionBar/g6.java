package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class g6 extends Drawable {
    public float[] f27494b;
    public Path f27493a = new Path();
    public boolean f27495c = true;

    public g6(float f10, float f11) {
        this.f27494b = r0;
        float L = org.telegram.messenger.g0.L(f10);
        float L2 = org.telegram.messenger.g0.L(f11);
        float[] fArr = {L, L, L, L, L2, L2, L2, L2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f27493a;
        if (this.f27495c) {
            this.f27495c = false;
            path.reset();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f27494b, Path.Direction.CW);
        }
        canvas.drawPath(path, k6.f28251z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27495c = true;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
