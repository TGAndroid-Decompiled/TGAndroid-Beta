package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class l01 extends Drawable {
    public final Paint f35543a = new Paint(1);
    public final RectF f35544b = new RectF();
    public final int f35545c;
    public final t01 d;

    public l01(t01 t01Var, int i7) {
        this.d = t01Var;
        this.f35545c = i7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f35544b;
        rectF.set(bounds);
        int i7 = this.f35545c;
        rectF.inset(i7, i7);
        float height = rectF.height() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.O5, this.d.f38214e);
        Paint paint = this.f35543a;
        paint.setColor(w02);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
