package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class w5 extends Drawable {
    public final RectF f20693a = new RectF();
    public final View f20694b;
    public final View f20695c;
    public final int d;
    public final Paint e;

    public w5(View view, View view2, int i10, Paint paint) {
        this.f20694b = view;
        this.f20695c = view2;
        this.d = i10;
        this.e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f20693a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        j6.s(this.f20694b, this.f20695c, null);
        float f10 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = j6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (j6.a1()) {
            canvas.drawRoundRect(rectF, f10, f10, j6.S0("paintChatActionBackgroundDarken"));
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
