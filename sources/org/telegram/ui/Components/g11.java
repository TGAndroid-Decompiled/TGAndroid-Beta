package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class g11 extends Drawable {
    public final Drawable f34779a;
    public final Paint f34780b = new Paint(1);
    public final RectF f34781c = new RectF();

    public g11(Context context) {
        this.f34779a = i5.c.g(context, 2131231904);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f34780b;
        canvas.drawRoundRect(this.f34781c, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        this.f34779a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f34781c.set(rect);
        int centerX = rect.centerX() - org.telegram.messenger.g0.L(12.0f);
        int centerY = rect.centerY() - org.telegram.messenger.g0.L(12.0f);
        this.f34779a.setBounds(centerX, centerY, org.telegram.messenger.g0.L(24.0f) + centerX, org.telegram.messenger.g0.L(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34780b.setAlpha(i7);
        this.f34779a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
