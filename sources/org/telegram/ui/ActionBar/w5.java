package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class w5 extends Drawable {
    public final RectF f21684a = new RectF();
    public final int f21685b;
    public final int f21686c;
    public final int d;
    public final int f21687e;
    public final float f21688f;

    public w5(int i10, int i11, int i12, int i13, float f7) {
        this.f21685b = i10;
        this.f21686c = i11;
        this.d = i12;
        this.f21687e = i13;
        this.f21688f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21684a;
        rectF.set(bounds);
        rectF.left += this.f21685b;
        rectF.top += this.f21686c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21687e;
        float f7 = this.f21688f;
        canvas.drawRoundRect(rectF, f7, f7, i6.f21192z);
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
