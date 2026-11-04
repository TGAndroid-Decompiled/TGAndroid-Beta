package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class mw0 extends Drawable implements org.telegram.ui.ActionBar.j5 {
    public final org.telegram.ui.Components.g6 f47802a;
    public final Paint f47803b;
    public int f47804c;
    public float d;
    public float f47805e;
    public final org.telegram.ui.Cells.j0 f47806f;
    public org.telegram.ui.Cells.t0 h;

    public mw0(String str) {
        Paint paint = new Paint(1);
        this.f47803b = paint;
        this.d = 1.0f;
        this.f47805e = 1.0f;
        this.f47806f = new org.telegram.ui.Cells.j0(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.f47802a = g6Var;
        g6Var.setCallback(new sq(1, this));
        g6Var.t(str, true, true);
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.f33983b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i3) {
        Paint paint = this.f47803b;
        if (paint.getColor() != i3) {
            paint.setColor(i3);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.d * this.f47805e;
        if (f10 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        canvas.save();
        float a10 = this.f47806f.a(0.1f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Paint paint = this.f47803b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i3 = this.f47804c;
        org.telegram.ui.Components.g6 g6Var = this.f47802a;
        g6Var.u(i3);
        g6Var.B = (int) (f10 * 255.0f);
        g6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        g6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(17.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f47802a.d + org.telegram.messenger.g0.L(11.0f));
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.d = i3 / 255.0f;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
