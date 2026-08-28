package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class s5 extends Drawable {
    public final RectF f23761a = new RectF();
    public final View f23762b;
    public final View f23763c;
    public final int d;
    public final Paint f23764e;

    public s5(View view, View view2, int i9, Paint paint) {
        this.f23762b = view;
        this.f23763c = view2;
        this.d = i9;
        this.f23764e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f23761a;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        f6.s(this.f23762b, this.f23763c, null);
        float f10 = this.d;
        Paint paint = this.f23764e;
        if (paint == null) {
            paint = f6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (f6.a1()) {
            canvas.drawRoundRect(rectF, f10, f10, f6.S0("paintChatActionBackgroundDarken"));
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
