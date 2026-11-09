package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class y5 extends Drawable {
    public final RectF f28810a = new RectF();
    public final int f28811b;
    public final int f28812c;
    public final int d;
    public final int f28813e;
    public final float f28814f;

    public y5(int i7, int i10, int i11, int i12, float f10) {
        this.f28811b = i7;
        this.f28812c = i10;
        this.d = i11;
        this.f28813e = i12;
        this.f28814f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f28810a;
        rectF.set(bounds);
        rectF.left += this.f28811b;
        rectF.top += this.f28812c;
        rectF.right -= this.d;
        rectF.bottom -= this.f28813e;
        float f10 = this.f28814f;
        canvas.drawRoundRect(rectF, f10, f10, l6.f28268z);
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
