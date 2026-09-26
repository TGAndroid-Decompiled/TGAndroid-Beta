package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f19835a = new RectF();
    public final int f19836b;
    public final int f19837c;
    public final int d;
    public final int e;
    public final float f19838f;

    public u5(int i10, int i11, int i12, int i13, float f7) {
        this.f19836b = i10;
        this.f19837c = i11;
        this.d = i12;
        this.e = i13;
        this.f19838f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f19835a;
        rectF.set(bounds);
        rectF.left += this.f19836b;
        rectF.top += this.f19837c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f19838f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f19454z);
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
