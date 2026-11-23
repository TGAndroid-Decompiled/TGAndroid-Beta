package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class r11 extends Drawable {
    public final Drawable f39051a;
    public final Paint f39052b = new Paint(1);
    public final RectF f39053c = new RectF();

    public r11(Context context) {
        this.f39051a = i5.c.g(context, 2131231905);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f39052b;
        canvas.drawRoundRect(this.f39053c, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        this.f39051a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f39053c.set(rect);
        int centerX = rect.centerX() - org.telegram.messenger.g0.L(12.0f);
        int centerY = rect.centerY() - org.telegram.messenger.g0.L(12.0f);
        this.f39051a.setBounds(centerX, centerY, org.telegram.messenger.g0.L(24.0f) + centerX, org.telegram.messenger.g0.L(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f39052b.setAlpha(i7);
        this.f39051a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
