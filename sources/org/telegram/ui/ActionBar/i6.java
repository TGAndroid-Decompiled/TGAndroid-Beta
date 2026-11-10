package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class i6 extends Drawable {
    public float[] f27561b;
    public Path f27560a = new Path();
    public boolean f27562c = true;

    public i6(float f10, float f11) {
        this.f27561b = r0;
        float L = org.telegram.messenger.g0.L(f10);
        float L2 = org.telegram.messenger.g0.L(f11);
        float[] fArr = {L, L, L, L, L2, L2, L2, L2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f27560a;
        if (this.f27562c) {
            this.f27562c = false;
            path.reset();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f27561b, Path.Direction.CW);
        }
        canvas.drawPath(path, m6.f28293z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27562c = true;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
