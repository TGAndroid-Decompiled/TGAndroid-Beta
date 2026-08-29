package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class t5 extends Drawable {
    public final RectF f23815a = new RectF();
    public final View f23816b;
    public final View f23817c;
    public final int d;
    public final Paint f23818e;

    public t5(View view, View view2, int i10, Paint paint) {
        this.f23816b = view;
        this.f23817c = view2;
        this.d = i10;
        this.f23818e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f23815a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        g6.s(this.f23816b, this.f23817c, null);
        float f9 = this.d;
        Paint paint = this.f23818e;
        if (paint == null) {
            paint = g6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f9, f9, paint);
        if (g6.a1()) {
            canvas.drawRoundRect(rectF, f9, f9, g6.S0("paintChatActionBackgroundDarken"));
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
