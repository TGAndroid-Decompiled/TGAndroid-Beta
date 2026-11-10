package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class c11 extends Drawable {
    public Paint f32418a;
    public RectF f32419b;

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = this.f32419b;
        rectF.set(getBounds());
        rectF.inset(org.telegram.messenger.g0.L(1.0f), (rectF.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f32418a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32418a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
