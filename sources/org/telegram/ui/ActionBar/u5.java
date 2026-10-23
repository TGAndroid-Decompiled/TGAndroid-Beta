package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class u5 extends Drawable {
    public final RectF f21771a = new RectF();
    public final View f21772b;
    public final View f21773c;
    public final int d;
    public final Paint e;

    public u5(View view, View view2, int i10, Paint paint) {
        this.f21772b = view;
        this.f21773c = view2;
        this.d = i10;
        this.e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21771a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        h6.s(this.f21772b, this.f21773c, null);
        float f7 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = h6.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (h6.b1()) {
            canvas.drawRoundRect(rectF, f7, f7, h6.T0("paintChatActionBackgroundDarken"));
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
