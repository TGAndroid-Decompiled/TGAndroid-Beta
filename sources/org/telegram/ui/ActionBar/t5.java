package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class t5 extends Drawable {
    public final RectF f23793a = new RectF();
    public final int f23794b;
    public final int f23795c;
    public final int d;
    public final int f23796e;
    public final float f23797f;

    public t5(int i9, int i10, int i11, int i12, float f10) {
        this.f23794b = i9;
        this.f23795c = i10;
        this.d = i11;
        this.f23796e = i12;
        this.f23797f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f23793a;
        rectF.set(bounds);
        rectF.left += this.f23794b;
        rectF.top += this.f23795c;
        rectF.right -= this.d;
        rectF.bottom -= this.f23796e;
        float f10 = this.f23797f;
        canvas.drawRoundRect(rectF, f10, f10, f6.f23379z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
