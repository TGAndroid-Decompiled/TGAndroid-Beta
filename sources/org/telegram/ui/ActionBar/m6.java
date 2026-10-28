package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class m6 extends Drawable {
    public final RectF f22888a = new RectF();
    public final int f22889b;
    public final int f22890c;
    public final int d;
    public final int e;
    public final float f22891f;

    public m6(int i10, int i11, int i12, int i13, float f7) {
        this.f22889b = i10;
        this.f22890c = i11;
        this.d = i12;
        this.e = i13;
        this.f22891f = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f22888a;
        rectF.set(bounds);
        rectF.left += this.f22889b;
        rectF.top += this.f22890c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f7 = this.f22891f;
        canvas.drawRoundRect(rectF, f7, f7, y6.f23761z);
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
