package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class n11 extends Drawable {
    public final Paint f28654a = new Paint(1);
    public final RectF f28655b = new RectF();
    public final int f28656c;
    public final t11 d;

    public n11(t11 t11Var, int i10) {
        this.d = t11Var;
        this.f28656c = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f28655b;
        rectF.set(bounds);
        int i10 = this.f28656c;
        rectF.inset(i10, i10);
        float height = rectF.height() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.d.e);
        Paint paint = this.f28654a;
        paint.setColor(w02);
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.5f), 0.0f, org.telegram.messenger.i0.L(0.5f), 436207616);
        canvas.drawRoundRect(rectF, height, height, paint);
        paint.setShadowLayer(org.telegram.messenger.i0.L(0.5f), 0.0f, 0.0f, 520093696);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
