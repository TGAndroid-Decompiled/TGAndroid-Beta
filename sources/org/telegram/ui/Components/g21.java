package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class g21 extends Drawable {
    public final Drawable f26239a;
    public final Paint f26240b = new Paint(1);
    public final RectF f26241c = new RectF();

    public g21(Context context) {
        this.f26239a = i0.a.f(context, 2131231903);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f26240b;
        canvas.drawRoundRect(this.f26241c, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint);
        this.f26239a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f26241c.set(rect);
        int centerX = rect.centerX() - org.telegram.messenger.i0.L(12.0f);
        int centerY = rect.centerY() - org.telegram.messenger.i0.L(12.0f);
        this.f26239a.setBounds(centerX, centerY, org.telegram.messenger.i0.L(24.0f) + centerX, org.telegram.messenger.i0.L(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26240b.setAlpha(i10);
        this.f26239a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
