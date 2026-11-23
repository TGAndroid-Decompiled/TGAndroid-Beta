package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class y5 extends Drawable {
    public final RectF f30273a = new RectF();
    public final int f30274b;
    public final int f30275c;
    public final int d;
    public final int f30276e;
    public final float f30277f;

    public y5(int i7, int i10, int i11, int i12, float f10) {
        this.f30274b = i7;
        this.f30275c = i10;
        this.d = i11;
        this.f30276e = i12;
        this.f30277f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f30273a;
        rectF.set(bounds);
        rectF.left += this.f30274b;
        rectF.top += this.f30275c;
        rectF.right -= this.d;
        rectF.bottom -= this.f30276e;
        float f10 = this.f30277f;
        canvas.drawRoundRect(rectF, f10, f10, m6.f29751z);
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
