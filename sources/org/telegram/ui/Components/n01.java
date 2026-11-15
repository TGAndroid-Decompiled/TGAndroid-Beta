package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class n01 extends Drawable {
    public final Paint f37422a = new Paint(1);
    public final RectF f37423b = new RectF();
    public final int f37424c;
    public final v01 d;

    public n01(v01 v01Var, int i7) {
        this.d = v01Var;
        this.f37424c = i7;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f37423b;
        rectF.set(bounds);
        int i7 = this.f37424c;
        rectF.inset(i7, i7);
        float height = rectF.height() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.O5, this.d.f40215e);
        Paint paint = this.f37422a;
        paint.setColor(w02);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
