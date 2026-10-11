package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f21584a = new RectF();
    public final int f21585b;
    public final int f21586c;
    public final int d;
    public final int f21587e;
    public final float f21588f;

    public u5(int i10, int i11, int i12, int i13, float f7) {
        this.f21585b = i10;
        this.f21586c = i11;
        this.d = i12;
        this.f21587e = i13;
        this.f21588f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21584a;
        rectF.set(bounds);
        rectF.left += this.f21585b;
        rectF.top += this.f21586c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21587e;
        float f7 = this.f21588f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f21182z);
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
