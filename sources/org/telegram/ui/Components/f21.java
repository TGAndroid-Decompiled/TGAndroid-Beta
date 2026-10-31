package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class f21 extends Drawable {
    public Paint f25955a;
    public RectF f25956b;

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = this.f25956b;
        rectF.set(getBounds());
        rectF.inset(org.telegram.messenger.i0.L(1.0f), (rectF.height() - org.telegram.messenger.i0.L(28.0f)) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.f25955a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25955a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
