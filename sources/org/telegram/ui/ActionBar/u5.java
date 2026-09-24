package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f19821a = new RectF();
    public final int f19822b;
    public final int f19823c;
    public final int d;
    public final int e;
    public final float f19824f;

    public u5(int i10, int i11, int i12, int i13, float f7) {
        this.f19822b = i10;
        this.f19823c = i11;
        this.d = i12;
        this.e = i13;
        this.f19824f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f19821a;
        rectF.set(bounds);
        rectF.left += this.f19822b;
        rectF.top += this.f19823c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f19824f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f19440z);
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
