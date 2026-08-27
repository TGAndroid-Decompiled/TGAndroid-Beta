package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class u5 extends Drawable {

    public final RectF f23843a = new RectF();

    public final int f23844b;

    public final int f23845c;
    public final int d;

    public final int f23846e;

    public final float f23847f;

    public u5(int i10, int i11, int i12, int i13, float f10) {
        this.f23844b = i10;
        this.f23845c = i11;
        this.d = i12;
        this.f23846e = i13;
        this.f23847f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f23843a;
        rectF.set(bounds);
        rectF.left += this.f23844b;
        rectF.top += this.f23845c;
        rectF.right -= this.d;
        rectF.bottom -= this.f23846e;
        float f10 = this.f23847f;
        canvas.drawRoundRect(rectF, f10, f10, g6.f23434z);
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
