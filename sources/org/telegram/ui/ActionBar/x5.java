package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class x5 extends Drawable {
    public final RectF f28749a = new RectF();
    public final int f28750b;
    public final int f28751c;
    public final int d;
    public final int f28752e;
    public final float f28753f;

    public x5(int i7, int i10, int i11, int i12, float f10) {
        this.f28750b = i7;
        this.f28751c = i10;
        this.d = i11;
        this.f28752e = i12;
        this.f28753f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f28749a;
        rectF.set(bounds);
        rectF.left += this.f28750b;
        rectF.top += this.f28751c;
        rectF.right -= this.d;
        rectF.bottom -= this.f28752e;
        float f10 = this.f28753f;
        canvas.drawRoundRect(rectF, f10, f10, k6.f28251z);
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
