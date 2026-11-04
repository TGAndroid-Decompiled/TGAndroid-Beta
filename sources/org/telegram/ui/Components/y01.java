package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class y01 extends Drawable {
    public final Drawable f40563a;
    public final Paint f40564b = new Paint(1);
    public final RectF f40565c = new RectF();

    public y01(Context context) {
        this.f40563a = k2.p1.g(context, 2131231904);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f40564b;
        canvas.drawRoundRect(this.f40565c, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        this.f40563a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f40565c.set(rect);
        int centerX = rect.centerX() - org.telegram.messenger.g0.L(12.0f);
        int centerY = rect.centerY() - org.telegram.messenger.g0.L(12.0f);
        this.f40563a.setBounds(centerX, centerY, org.telegram.messenger.g0.L(24.0f) + centerX, org.telegram.messenger.g0.L(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i3) {
        this.f40564b.setAlpha(i3);
        this.f40563a.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
