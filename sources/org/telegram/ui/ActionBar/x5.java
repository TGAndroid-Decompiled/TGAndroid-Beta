package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class x5 extends Drawable {
    public final RectF f20729a = new RectF();
    public final int f20730b;
    public final int f20731c;
    public final int d;
    public final int e;
    public final float f20732f;

    public x5(int i10, int i11, int i12, int i13, float f10) {
        this.f20730b = i10;
        this.f20731c = i11;
        this.d = i12;
        this.e = i13;
        this.f20732f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f20729a;
        rectF.set(bounds);
        rectF.left += this.f20730b;
        rectF.top += this.f20731c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f10 = this.f20732f;
        canvas.drawRoundRect(rectF, f10, f10, j6.f20292z);
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
