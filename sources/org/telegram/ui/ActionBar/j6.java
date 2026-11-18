package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class j6 extends Drawable {
    public float[] f29053b;
    public Path f29052a = new Path();
    public boolean f29054c = true;

    public j6(float f10, float f11) {
        this.f29053b = r0;
        float L = org.telegram.messenger.g0.L(f10);
        float L2 = org.telegram.messenger.g0.L(f11);
        float[] fArr = {L, L, L, L, L2, L2, L2, L2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f29052a;
        if (this.f29054c) {
            this.f29054c = false;
            path.reset();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f29053b, Path.Direction.CW);
        }
        canvas.drawPath(path, n6.f29798z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f29054c = true;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
