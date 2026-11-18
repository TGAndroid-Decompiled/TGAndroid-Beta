package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class z5 extends Drawable {
    public final RectF f30321a = new RectF();
    public final int f30322b;
    public final int f30323c;
    public final int d;
    public final int f30324e;
    public final float f30325f;

    public z5(int i7, int i10, int i11, int i12, float f10) {
        this.f30322b = i7;
        this.f30323c = i10;
        this.d = i11;
        this.f30324e = i12;
        this.f30325f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f30321a;
        rectF.set(bounds);
        rectF.left += this.f30322b;
        rectF.top += this.f30323c;
        rectF.right -= this.d;
        rectF.bottom -= this.f30324e;
        float f10 = this.f30325f;
        canvas.drawRoundRect(rectF, f10, f10, n6.f29798z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
