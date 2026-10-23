package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v5 extends Drawable {
    public final RectF f21827a = new RectF();
    public final int f21828b;
    public final int f21829c;
    public final int d;
    public final int e;
    public final float f21830f;

    public v5(int i10, int i11, int i12, int i13, float f7) {
        this.f21828b = i10;
        this.f21829c = i11;
        this.d = i12;
        this.e = i13;
        this.f21830f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21827a;
        rectF.set(bounds);
        rectF.left += this.f21828b;
        rectF.top += this.f21829c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f21830f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f21392z);
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
