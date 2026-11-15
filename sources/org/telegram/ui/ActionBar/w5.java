package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f29836a = new RectF();
    public final int f29837b;
    public final int f29838c;
    public final int d;
    public final int f29839e;
    public final float f29840f;

    public w5(int i7, int i10, int i11, int i12, float f10) {
        this.f29837b = i7;
        this.f29838c = i10;
        this.d = i11;
        this.f29839e = i12;
        this.f29840f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f29836a;
        rectF.set(bounds);
        rectF.left += this.f29837b;
        rectF.top += this.f29838c;
        rectF.right -= this.d;
        rectF.bottom -= this.f29839e;
        float f10 = this.f29840f;
        canvas.drawRoundRect(rectF, f10, f10, j6.f29253z);
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
