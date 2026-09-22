package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class v5 extends Drawable {
    public final RectF f19628a = new RectF();
    public final View f19629b;
    public final View f19630c;
    public final int d;
    public final Paint e;

    public v5(View view, View view2, int i10, Paint paint) {
        this.f19629b = view;
        this.f19630c = view2;
        this.d = i10;
        this.e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f19628a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        i6.s(this.f19629b, this.f19630c, null);
        float f7 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = i6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (i6.a1()) {
            canvas.drawRoundRect(rectF, f7, f7, i6.S0("paintChatActionBackgroundDarken"));
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
