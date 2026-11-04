package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class h01 extends Drawable {
    public final Paint f34253a = new Paint(1);
    public final RectF f34254b = new RectF();
    public final int f34255c;
    public final n01 d;

    public h01(n01 n01Var, int i3) {
        this.d = n01Var;
        this.f34255c = i3;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f34254b;
        rectF.set(bounds);
        int i3 = this.f34255c;
        rectF.inset(i3, i3);
        float height = rectF.height() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.d.f36315e);
        Paint paint = this.f34253a;
        paint.setColor(w02);
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.5f), 0.0f, org.telegram.messenger.g0.L(0.5f), 436207616);
        canvas.drawRoundRect(rectF, height, height, paint);
        paint.setShadowLayer(org.telegram.messenger.g0.L(0.5f), 0.0f, 0.0f, 520093696);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
