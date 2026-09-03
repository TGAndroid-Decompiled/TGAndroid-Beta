package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class x5 extends Drawable {
    public final RectF f20704a = new RectF();
    public final int f20705b;
    public final int f20706c;
    public final int d;
    public final int e;
    public final float f20707f;

    public x5(int i10, int i11, int i12, int i13, float f10) {
        this.f20705b = i10;
        this.f20706c = i11;
        this.d = i12;
        this.e = i13;
        this.f20707f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f20704a;
        rectF.set(bounds);
        rectF.left += this.f20705b;
        rectF.top += this.f20706c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f10 = this.f20707f;
        canvas.drawRoundRect(rectF, f10, f10, j6.f20267z);
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
