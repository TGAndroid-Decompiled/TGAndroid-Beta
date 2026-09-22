package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f19898a = new RectF();
    public final int f19899b;
    public final int f19900c;
    public final int d;
    public final int e;
    public final float f19901f;

    public w5(int i10, int i11, int i12, int i13, float f7) {
        this.f19899b = i10;
        this.f19900c = i11;
        this.d = i12;
        this.e = i13;
        this.f19901f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f19898a;
        rectF.set(bounds);
        rectF.left += this.f19899b;
        rectF.top += this.f19900c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f19901f;
        canvas.drawRoundRect(rectF, f7, f7, j6.f19504z);
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
