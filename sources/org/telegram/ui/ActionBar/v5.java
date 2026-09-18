package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class v5 extends Drawable {
    public final RectF f19819a = new RectF();
    public final View f19820b;
    public final View f19821c;
    public final int d;
    public final Paint e;

    public v5(View view, View view2, int i10, Paint paint) {
        this.f19820b = view;
        this.f19821c = view2;
        this.d = i10;
        this.e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f19819a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        j6.s(this.f19820b, this.f19821c, null);
        float f7 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = j6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (j6.a1()) {
            canvas.drawRoundRect(rectF, f7, f7, j6.S0("paintChatActionBackgroundDarken"));
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
