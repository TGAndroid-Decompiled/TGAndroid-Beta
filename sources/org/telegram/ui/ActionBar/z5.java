package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class z5 extends Drawable {
    public final RectF f28848a = new RectF();
    public final int f28849b;
    public final int f28850c;
    public final int d;
    public final int f28851e;
    public final float f28852f;

    public z5(int i7, int i10, int i11, int i12, float f10) {
        this.f28849b = i7;
        this.f28850c = i10;
        this.d = i11;
        this.f28851e = i12;
        this.f28852f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f28848a;
        rectF.set(bounds);
        rectF.left += this.f28849b;
        rectF.top += this.f28850c;
        rectF.right -= this.d;
        rectF.bottom -= this.f28851e;
        float f10 = this.f28852f;
        canvas.drawRoundRect(rectF, f10, f10, m6.f28293z);
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
