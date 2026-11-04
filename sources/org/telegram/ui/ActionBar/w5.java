package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f28780a = new RectF();
    public final int f28781b;
    public final int f28782c;
    public final int d;
    public final int f28783e;
    public final float f28784f;

    public w5(int i3, int i10, int i11, int i12, float f10) {
        this.f28781b = i3;
        this.f28782c = i10;
        this.d = i11;
        this.f28783e = i12;
        this.f28784f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f28780a;
        rectF.set(bounds);
        rectF.left += this.f28781b;
        rectF.top += this.f28782c;
        rectF.right -= this.d;
        rectF.bottom -= this.f28783e;
        float f10 = this.f28784f;
        canvas.drawRoundRect(rectF, f10, f10, k6.f28283z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
