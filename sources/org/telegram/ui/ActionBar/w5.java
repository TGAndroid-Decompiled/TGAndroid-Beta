package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f21496a = new RectF();
    public final int f21497b;
    public final int f21498c;
    public final int d;
    public final int f21499e;
    public final float f21500f;

    public w5(int i10, int i11, int i12, int i13, float f7) {
        this.f21497b = i10;
        this.f21498c = i11;
        this.d = i12;
        this.f21499e = i13;
        this.f21500f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21496a;
        rectF.set(bounds);
        rectF.left += this.f21497b;
        rectF.top += this.f21498c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21499e;
        float f7 = this.f21500f;
        canvas.drawRoundRect(rectF, f7, f7, j6.f21081z);
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
