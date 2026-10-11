package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class t5 extends Drawable {
    public final RectF f21561a = new RectF();
    public final View f21562b;
    public final View f21563c;
    public final int d;
    public final Paint f21564e;

    public t5(View view, View view2, int i10, Paint paint) {
        this.f21562b = view;
        this.f21563c = view2;
        this.d = i10;
        this.f21564e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21561a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        h6.s(this.f21562b, this.f21563c, null);
        float f7 = this.d;
        Paint paint = this.f21564e;
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
