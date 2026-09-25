package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f19836a = new RectF();
    public final int f19837b;
    public final int f19838c;
    public final int d;
    public final int e;
    public final float f19839f;

    public u5(int i10, int i11, int i12, int i13, float f7) {
        this.f19837b = i10;
        this.f19838c = i11;
        this.d = i12;
        this.e = i13;
        this.f19839f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f19836a;
        rectF.set(bounds);
        rectF.left += this.f19837b;
        rectF.top += this.f19838c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f19839f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f19455z);
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
