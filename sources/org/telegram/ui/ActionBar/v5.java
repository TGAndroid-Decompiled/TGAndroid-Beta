package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v5 extends Drawable {
    public final RectF f21628a = new RectF();
    public final int f21629b;
    public final int f21630c;
    public final int d;
    public final int f21631e;
    public final float f21632f;

    public v5(int i10, int i11, int i12, int i13, float f7) {
        this.f21629b = i10;
        this.f21630c = i11;
        this.d = i12;
        this.f21631e = i13;
        this.f21632f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21628a;
        rectF.set(bounds);
        rectF.left += this.f21629b;
        rectF.top += this.f21630c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21631e;
        float f7 = this.f21632f;
        canvas.drawRoundRect(rectF, f7, f7, i6.f21226z);
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
