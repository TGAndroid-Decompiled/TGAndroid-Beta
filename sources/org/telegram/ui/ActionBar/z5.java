package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class z5 extends Drawable {
    public final RectF f30411a = new RectF();
    public final int f30412b;
    public final int f30413c;
    public final int d;
    public final int f30414e;
    public final float f30415f;

    public z5(int i7, int i10, int i11, int i12, float f10) {
        this.f30412b = i7;
        this.f30413c = i10;
        this.d = i11;
        this.f30414e = i12;
        this.f30415f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f30411a;
        rectF.set(bounds);
        rectF.left += this.f30412b;
        rectF.top += this.f30413c;
        rectF.right -= this.d;
        rectF.bottom -= this.f30414e;
        float f10 = this.f30415f;
        canvas.drawRoundRect(rectF, f10, f10, n6.f29855z);
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
