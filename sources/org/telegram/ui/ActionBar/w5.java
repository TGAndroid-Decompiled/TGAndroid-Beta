package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f19660a = new RectF();
    public final int f19661b;
    public final int f19662c;
    public final int d;
    public final int e;
    public final float f19663f;

    public w5(int i10, int i11, int i12, int i13, float f7) {
        this.f19661b = i10;
        this.f19662c = i11;
        this.d = i12;
        this.e = i13;
        this.f19663f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f19660a;
        rectF.set(bounds);
        rectF.left += this.f19661b;
        rectF.top += this.f19662c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f19663f;
        canvas.drawRoundRect(rectF, f7, f7, i6.f19227z);
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
