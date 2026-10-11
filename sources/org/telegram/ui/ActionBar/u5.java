package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f21620a = new RectF();
    public final int f21621b;
    public final int f21622c;
    public final int d;
    public final int f21623e;
    public final float f21624f;

    public u5(int i10, int i11, int i12, int i13, float f7) {
        this.f21621b = i10;
        this.f21622c = i11;
        this.d = i12;
        this.f21623e = i13;
        this.f21624f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21620a;
        rectF.set(bounds);
        rectF.left += this.f21621b;
        rectF.top += this.f21622c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21623e;
        float f7 = this.f21624f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f21218z);
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
