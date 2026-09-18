package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class x5 extends Drawable {
    public final RectF f19692a = new RectF();
    public final int f19693b;
    public final int f19694c;
    public final int d;
    public final int e;
    public final float f19695f;

    public x5(int i10, int i11, int i12, int i13, float f7) {
        this.f19693b = i10;
        this.f19694c = i11;
        this.d = i12;
        this.e = i13;
        this.f19695f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f19692a;
        rectF.set(bounds);
        rectF.left += this.f19693b;
        rectF.top += this.f19694c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f19695f;
        canvas.drawRoundRect(rectF, f7, f7, j6.f19257z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
