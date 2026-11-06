package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class x01 extends Drawable {
    public Paint f40122a;
    public RectF f40123b;

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = this.f40123b;
        rectF.set(getBounds());
        rectF.inset(org.telegram.messenger.g0.L(1.0f), (rectF.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f40122a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f40122a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
