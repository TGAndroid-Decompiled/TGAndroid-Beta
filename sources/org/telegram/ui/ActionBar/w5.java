package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f21688a = new RectF();
    public final int f21689b;
    public final int f21690c;
    public final int d;
    public final int f21691e;
    public final float f21692f;

    public w5(int i10, int i11, int i12, int i13, float f7) {
        this.f21689b = i10;
        this.f21690c = i11;
        this.d = i12;
        this.f21691e = i13;
        this.f21692f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21688a;
        rectF.set(bounds);
        rectF.left += this.f21689b;
        rectF.top += this.f21690c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21691e;
        float f7 = this.f21692f;
        canvas.drawRoundRect(rectF, f7, f7, i6.f21196z);
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
