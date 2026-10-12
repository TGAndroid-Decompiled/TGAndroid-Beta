package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class u5 extends Drawable {
    public final RectF f21359a = new RectF();
    public final int f21360b;
    public final int f21361c;
    public final int d;
    public final int f21362e;
    public final float f21363f;

    public u5(int i10, int i11, int i12, int i13, float f7) {
        this.f21360b = i10;
        this.f21361c = i11;
        this.d = i12;
        this.f21362e = i13;
        this.f21363f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21359a;
        rectF.set(bounds);
        rectF.left += this.f21360b;
        rectF.top += this.f21361c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21362e;
        float f7 = this.f21363f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f20957z);
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
