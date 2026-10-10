package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class v5 extends Drawable {
    public final RectF f21632a = new RectF();
    public final View f21633b;
    public final View f21634c;
    public final int d;
    public final Paint f21635e;

    public v5(View view, View view2, int i10, Paint paint) {
        this.f21633b = view;
        this.f21634c = view2;
        this.d = i10;
        this.f21635e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f21632a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        i6.s(this.f21633b, this.f21634c, null);
        float f7 = this.d;
        Paint paint = this.f21635e;
        if (paint == null) {
            paint = i6.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (i6.b1()) {
            canvas.drawRoundRect(rectF, f7, f7, i6.T0("paintChatActionBackgroundDarken"));
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
