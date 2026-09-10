package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class x5 extends Drawable {
    public final RectF f18754a = new RectF();
    public final int f18755b;
    public final int f18756c;
    public final int d;
    public final int e;
    public final float f18757f;

    public x5(int i10, int i11, int i12, int i13, float f7) {
        this.f18755b = i10;
        this.f18756c = i11;
        this.d = i12;
        this.e = i13;
        this.f18757f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f18754a;
        rectF.set(bounds);
        rectF.left += this.f18755b;
        rectF.top += this.f18756c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f18757f;
        canvas.drawRoundRect(rectF, f7, f7, j6.f18318z);
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
