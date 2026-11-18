package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class z5 extends Drawable {
    public final RectF f30323a = new RectF();
    public final int f30324b;
    public final int f30325c;
    public final int d;
    public final int f30326e;
    public final float f30327f;

    public z5(int i7, int i10, int i11, int i12, float f10) {
        this.f30324b = i7;
        this.f30325c = i10;
        this.d = i11;
        this.f30326e = i12;
        this.f30327f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f30323a;
        rectF.set(bounds);
        rectF.left += this.f30324b;
        rectF.top += this.f30325c;
        rectF.right -= this.d;
        rectF.bottom -= this.f30326e;
        float f10 = this.f30327f;
        canvas.drawRoundRect(rectF, f10, f10, n6.f29800z);
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
