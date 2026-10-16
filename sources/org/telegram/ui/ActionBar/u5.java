package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f20422a = new RectF();
    public final int f20423b;
    public final int f20424c;
    public final int d;
    public final int e;
    public final float f20425f;

    public u5(int i10, int i11, int i12, int i13, float f7) {
        this.f20423b = i10;
        this.f20424c = i11;
        this.d = i12;
        this.e = i13;
        this.f20425f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f20422a;
        rectF.set(bounds);
        rectF.left += this.f20423b;
        rectF.top += this.f20424c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f20425f;
        canvas.drawRoundRect(rectF, f7, f7, g6.f19998z);
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
