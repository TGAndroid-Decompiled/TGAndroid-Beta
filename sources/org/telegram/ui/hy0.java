package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hy0 extends Drawable implements org.telegram.ui.ActionBar.t5 {
    public final org.telegram.ui.Components.e6 f37892a;
    public final Paint f37893b;
    public int f37894c;
    public float d;
    public float e;
    public final org.telegram.ui.Cells.j0 f37895f;
    public org.telegram.ui.Cells.s0 h;

    public hy0(String str) {
        Paint paint = new Paint(1);
        this.f37893b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f37895f = new org.telegram.ui.Cells.j0(this);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
        this.f37892a = e6Var;
        e6Var.setCallback(new ur(1, this));
        e6Var.t(str, true, true);
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.f25744b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f37893b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.d * this.e;
        if (f7 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f37895f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f37893b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f37894c;
        org.telegram.ui.Components.e6 e6Var = this.f37892a;
        e6Var.u(i10);
        e6Var.B = (int) (f7 * 255.0f);
        e6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        e6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(17.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f37892a.d + org.telegram.messenger.i0.L(11.0f));
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
