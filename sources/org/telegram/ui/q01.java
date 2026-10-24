package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class q01 extends Drawable implements org.telegram.ui.ActionBar.m5 {
    public final org.telegram.ui.Components.n6 f40681a;
    public final Paint f40682b;
    public int f40683c;
    public float d;
    public float e;
    public final org.telegram.ui.Cells.k0 f40684f;
    public org.telegram.ui.Cells.v0 h;

    public q01(String str) {
        Paint paint = new Paint(1);
        this.f40682b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f40684f = new org.telegram.ui.Cells.k0(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false);
        this.f40681a = n6Var;
        n6Var.setCallback(new mr(1, this));
        n6Var.t(str, true, true);
        n6Var.w(AndroidUtilities.dp(11.0f));
        n6Var.f28797b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f40682b;
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
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f40684f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f40682b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f40683c;
        org.telegram.ui.Components.n6 n6Var = this.f40681a;
        n6Var.u(i10);
        n6Var.B = (int) (f7 * 255.0f);
        n6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        n6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(17.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f40681a.d + AndroidUtilities.dp(11.0f));
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
