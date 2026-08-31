package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class y5 extends Drawable {
    public final RectF f22467a = new RectF();
    public final int f22468b;
    public final int f22469c;
    public final int d;
    public final int f22470e;
    public final float f22471f;

    public y5(int i10, int i11, int i12, int i13, float f10) {
        this.f22468b = i10;
        this.f22469c = i11;
        this.d = i12;
        this.f22470e = i13;
        this.f22471f = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f22467a;
        rectF.set(bounds);
        rectF.left += this.f22468b;
        rectF.top += this.f22469c;
        rectF.right -= this.d;
        rectF.bottom -= this.f22470e;
        float f10 = this.f22471f;
        canvas.drawRoundRect(rectF, f10, f10, k6.f22047z);
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
