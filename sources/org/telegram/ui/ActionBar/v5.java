package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v5 extends Drawable {
    public final RectF f21823a = new RectF();
    public final int f21824b;
    public final int f21825c;
    public final int d;
    public final int e;
    public final float f21826f;

    public v5(int i10, int i11, int i12, int i13, float f7) {
        this.f21824b = i10;
        this.f21825c = i11;
        this.d = i12;
        this.e = i13;
        this.f21826f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21823a;
        rectF.set(bounds);
        rectF.left += this.f21824b;
        rectF.top += this.f21825c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f21826f;
        canvas.drawRoundRect(rectF, f7, f7, h6.f21388z);
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
