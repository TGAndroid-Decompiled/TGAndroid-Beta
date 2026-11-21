package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class y5 extends Drawable {
    public final RectF f30304a = new RectF();
    public final int f30305b;
    public final int f30306c;
    public final int d;
    public final int f30307e;
    public final float f30308f;

    public y5(int i7, int i10, int i11, int i12, float f10) {
        this.f30305b = i7;
        this.f30306c = i10;
        this.d = i11;
        this.f30307e = i12;
        this.f30308f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f30304a;
        rectF.set(bounds);
        rectF.left += this.f30305b;
        rectF.top += this.f30306c;
        rectF.right -= this.d;
        rectF.bottom -= this.f30307e;
        float f10 = this.f30308f;
        canvas.drawRoundRect(rectF, f10, f10, m6.f29782z);
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
