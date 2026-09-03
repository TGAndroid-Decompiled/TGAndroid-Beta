package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class x5 extends Drawable {
    public final RectF f22448a = new RectF();
    public final View f22449b;
    public final View f22450c;
    public final int d;
    public final Paint f22451e;

    public x5(View view, View view2, int i10, Paint paint) {
        this.f22449b = view;
        this.f22450c = view2;
        this.d = i10;
        this.f22451e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f22448a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        k6.s(this.f22449b, this.f22450c, null);
        float f10 = this.d;
        Paint paint = this.f22451e;
        if (paint == null) {
            paint = k6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (k6.a1()) {
            canvas.drawRoundRect(rectF, f10, f10, k6.S0("paintChatActionBackgroundDarken"));
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
