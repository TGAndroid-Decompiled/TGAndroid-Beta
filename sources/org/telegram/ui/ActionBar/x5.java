package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class x5 extends Drawable {
    public final RectF f28753a = new RectF();
    public final int f28754b;
    public final int f28755c;
    public final int d;
    public final int f28756e;
    public final float f28757f;

    public x5(int i7, int i10, int i11, int i12, float f10) {
        this.f28754b = i7;
        this.f28755c = i10;
        this.d = i11;
        this.f28756e = i12;
        this.f28757f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f28753a;
        rectF.set(bounds);
        rectF.left += this.f28754b;
        rectF.top += this.f28755c;
        rectF.right -= this.d;
        rectF.bottom -= this.f28756e;
        float f10 = this.f28757f;
        canvas.drawRoundRect(rectF, f10, f10, k6.f28255z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
