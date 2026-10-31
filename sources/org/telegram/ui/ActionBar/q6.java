package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class q6 extends Drawable {
    public float[] f20705b;
    public Path f20704a = new Path();
    public boolean f20706c = true;

    public q6(float f7, float f10) {
        this.f20705b = r0;
        float L = org.telegram.messenger.i0.L(f7);
        float L2 = org.telegram.messenger.i0.L(f10);
        float[] fArr = {L, L, L, L, L2, L2, L2, L2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.f20704a;
        if (this.f20706c) {
            this.f20706c = false;
            path.reset();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.f20705b, Path.Direction.CW);
        }
        canvas.drawPath(path, t6.f21323z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f20706c = true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
