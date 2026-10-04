package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v5 extends Drawable {
    public final RectF f21619a = new RectF();
    public final int f21620b;
    public final int f21621c;
    public final int d;
    public final int f21622e;
    public final float f21623f;

    public v5(int i10, int i11, int i12, int i13, float f7) {
        this.f21620b = i10;
        this.f21621c = i11;
        this.d = i12;
        this.f21622e = i13;
        this.f21623f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21619a;
        rectF.set(bounds);
        rectF.left += this.f21620b;
        rectF.top += this.f21621c;
        rectF.right -= this.d;
        rectF.bottom -= this.f21622e;
        float f7 = this.f21623f;
        canvas.drawRoundRect(rectF, f7, f7, i6.f21216z);
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
