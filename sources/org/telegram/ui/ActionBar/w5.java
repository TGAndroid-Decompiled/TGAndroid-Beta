package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f21470a = new RectF();
    public final int f21471b;
    public final int f21472c;
    public final int d;
    public final int f21473e;
    public final float f21474f;

    public w5(int i10, int i11, int i12, int i13, float f7) {
        this.f21471b = i10;
        this.f21472c = i11;
        this.d = i12;
        this.f21473e = i13;
        this.f21474f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21470a;
        rectF.set(bounds);
        rectF.left += this.f21471b;
        rectF.top += this.f21472c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21473e;
        float f7 = this.f21474f;
        canvas.drawRoundRect(rectF, f7, f7, j6.f21055z);
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
