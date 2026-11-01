package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class h6 extends Drawable {
    public final RectF f20383a = new RectF();
    public final int f20384b;
    public final int f20385c;
    public final int d;
    public final int e;
    public final float f20386f;

    public h6(int i10, int i11, int i12, int i13, float f7) {
        this.f20384b = i10;
        this.f20385c = i11;
        this.d = i12;
        this.e = i13;
        this.f20386f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f20383a;
        rectF.set(bounds);
        rectF.left += this.f20384b;
        rectF.top += this.f20385c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f20386f;
        canvas.drawRoundRect(rectF, f7, f7, t6.f21324z);
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
