package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v5 extends Drawable {
    public final RectF f21820a = new RectF();
    public final int f21821b;
    public final int f21822c;
    public final int d;
    public final int e;
    public final float f21823f;

    public v5(int i10, int i11, int i12, int i13, float f7) {
        this.f21821b = i10;
        this.f21822c = i11;
        this.d = i12;
        this.e = i13;
        this.f21823f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21820a;
        rectF.set(bounds);
        rectF.left += this.f21821b;
        rectF.top += this.f21822c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f21823f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f21385z);
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
