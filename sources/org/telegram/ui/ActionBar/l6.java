package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class l6 extends Drawable {
    public final RectF f22852a = new RectF();
    public final View f22853b;
    public final View f22854c;
    public final int d;
    public final Paint e;

    public l6(View view, View view2, int i10, Paint paint) {
        this.f22853b = view;
        this.f22854c = view2;
        this.d = i10;
        this.e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f22852a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        y6.s(this.f22853b, this.f22854c, null);
        float f7 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = y6.U0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (y6.c1()) {
            canvas.drawRoundRect(rectF, f7, f7, y6.U0("paintChatActionBackgroundDarken"));
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
