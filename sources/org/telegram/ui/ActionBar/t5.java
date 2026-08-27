package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class t5 extends Drawable {

    public final RectF f23805a = new RectF();

    public final View f23806b;

    public final View f23807c;
    public final int d;

    public final Paint f23808e;

    public t5(View view, View view2, int i10, Paint paint) {
        this.f23806b = view;
        this.f23807c = view2;
        this.d = i10;
        this.f23808e = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f10 = bounds.left;
        float f11 = bounds.top;
        float f12 = bounds.right;
        float f13 = bounds.bottom;
        RectF rectF = this.f23805a;
        rectF.set(f10, f11, f12, f13);
        g6.s(this.f23806b, this.f23807c, null);
        float f14 = this.d;
        Paint paintS0 = this.f23808e;
        if (paintS0 == null) {
            paintS0 = g6.S0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f14, f14, paintS0);
        if (g6.a1()) {
            canvas.drawRoundRect(rectF, f14, f14, g6.S0("paintChatActionBackgroundDarken"));
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
