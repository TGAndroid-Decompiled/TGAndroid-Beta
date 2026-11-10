package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class k01 extends Drawable {
    public final Paint f35134a = new Paint(1);
    public final RectF f35135b = new RectF();
    public final int f35136c;
    public final s01 d;

    public k01(s01 s01Var, int i7) {
        this.d = s01Var;
        this.f35136c = i7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f35135b;
        rectF.set(bounds);
        int i7 = this.f35136c;
        rectF.inset(i7, i7);
        float height = rectF.height() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, this.d.f37798e);
        Paint paint = this.f35134a;
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
