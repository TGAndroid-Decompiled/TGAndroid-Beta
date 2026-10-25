package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class m6 extends Drawable {
    public final RectF f22885a = new RectF();
    public final int f22886b;
    public final int f22887c;
    public final int d;
    public final int e;
    public final float f22888f;

    public m6(int i10, int i11, int i12, int i13, float f7) {
        this.f22886b = i10;
        this.f22887c = i11;
        this.d = i12;
        this.e = i13;
        this.f22888f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f22885a;
        rectF.set(bounds);
        rectF.left += this.f22886b;
        rectF.top += this.f22887c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f22888f;
        canvas.drawRoundRect(rectF, f7, f7, y6.f23758z);
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
