package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f21469a = new RectF();
    public final int f21470b;
    public final int f21471c;
    public final int d;
    public final int f21472e;
    public final float f21473f;

    public w5(int i10, int i11, int i12, int i13, float f7) {
        this.f21470b = i10;
        this.f21471c = i11;
        this.d = i12;
        this.f21472e = i13;
        this.f21473f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21469a;
        rectF.set(bounds);
        rectF.left += this.f21470b;
        rectF.top += this.f21471c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21472e;
        float f7 = this.f21473f;
        canvas.drawRoundRect(rectF, f7, f7, j6.f21054z);
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
