package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f20722a = new RectF();
    public final int f20723b;
    public final int f20724c;
    public final int d;
    public final int e;
    public final float f20725f;

    public u5(int i10, int i11, int i12, int i13, float f7) {
        this.f20723b = i10;
        this.f20724c = i11;
        this.d = i12;
        this.e = i13;
        this.f20725f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f20722a;
        rectF.set(bounds);
        rectF.left += this.f20723b;
        rectF.top += this.f20724c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f20725f;
        canvas.drawRoundRect(rectF, f7, f7, g6.f20298z);
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
