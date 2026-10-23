package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class x5 extends Drawable {
    public final RectF f21960a = new RectF();
    public final View f21961b;
    public final View f21962c;
    public final int d;
    public final Paint e;

    public x5(View view, View view2, int i10, Paint paint) {
        this.f21961b = view;
        this.f21962c = view2;
        this.d = i10;
        this.e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21960a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        k6.s(this.f21961b, this.f21962c, null);
        float f7 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = k6.U0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (k6.c1()) {
            canvas.drawRoundRect(rectF, f7, f7, k6.U0("paintChatActionBackgroundDarken"));
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
