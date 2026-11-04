package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class x01 extends Drawable {
    public Paint f40187a;
    public RectF f40188b;

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = this.f40188b;
        rectF.set(getBounds());
        rectF.inset(org.telegram.messenger.g0.L(1.0f), (rectF.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f40187a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f40187a.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
