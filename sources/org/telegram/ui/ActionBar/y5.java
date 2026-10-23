package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class y5 extends Drawable {
    public final RectF f22013a = new RectF();
    public final int f22014b;
    public final int f22015c;
    public final int d;
    public final int e;
    public final float f22016f;

    public y5(int i10, int i11, int i12, int i13, float f7) {
        this.f22014b = i10;
        this.f22015c = i11;
        this.d = i12;
        this.e = i13;
        this.f22016f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f22013a;
        rectF.set(bounds);
        rectF.left += this.f22014b;
        rectF.top += this.f22015c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f22016f;
        canvas.drawRoundRect(rectF, f7, f7, k6.f21581z);
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
