package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f23850a = new RectF();
    public final int f23851b;
    public final int f23852c;
    public final int d;
    public final int f23853e;
    public final float f23854f;

    public u5(int i10, int i11, int i12, int i13, float f9) {
        this.f23851b = i10;
        this.f23852c = i11;
        this.d = i12;
        this.f23853e = i13;
        this.f23854f = f9;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f23850a;
        rectF.set(bounds);
        rectF.left += this.f23851b;
        rectF.top += this.f23852c;
        rectF.right -= this.d;
        rectF.bottom -= this.f23853e;
        float f9 = this.f23854f;
        canvas.drawRoundRect(rectF, f9, f9, g6.f23443z);
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
