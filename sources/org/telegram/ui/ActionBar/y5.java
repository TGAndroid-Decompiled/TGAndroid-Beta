package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class y5 extends Drawable {
    public final RectF f22469a = new RectF();
    public final int f22470b;
    public final int f22471c;
    public final int d;
    public final int f22472e;
    public final float f22473f;

    public y5(int i10, int i11, int i12, int i13, float f10) {
        this.f22470b = i10;
        this.f22471c = i11;
        this.d = i12;
        this.f22472e = i13;
        this.f22473f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f22469a;
        rectF.set(bounds);
        rectF.left += this.f22470b;
        rectF.top += this.f22471c;
        rectF.right -= this.d;
        rectF.bottom -= this.f22472e;
        float f10 = this.f22473f;
        canvas.drawRoundRect(rectF, f10, f10, k6.f22049z);
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
