package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class d11 extends Drawable {
    public final Drawable f32852a;
    public final Paint f32853b = new Paint(1);
    public final RectF f32854c = new RectF();

    public d11(Context context) {
        this.f32852a = jg.g.h(context, 2131231904);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f32853b;
        canvas.drawRoundRect(this.f32854c, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        this.f32852a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f32854c.set(rect);
        int centerX = rect.centerX() - org.telegram.messenger.g0.L(12.0f);
        int centerY = rect.centerY() - org.telegram.messenger.g0.L(12.0f);
        this.f32852a.setBounds(centerX, centerY, org.telegram.messenger.g0.L(24.0f) + centerX, org.telegram.messenger.g0.L(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32853b.setAlpha(i7);
        this.f32852a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
