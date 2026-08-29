package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class h01 extends Drawable implements org.telegram.ui.ActionBar.g5 {
    public final org.telegram.ui.Components.n6 f38711a;
    public final Paint f38712b;
    public int f38713c;
    public float d;
    public float f38714e;
    public final org.telegram.ui.Cells.l0 f38715f;
    public org.telegram.ui.Cells.v0 h;

    public h01(String str) {
        Paint paint = new Paint(1);
        this.f38712b = paint;
        this.d = 1.0f;
        this.f38714e = 1.0f;
        this.f38715f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.f38711a = n6Var;
        n6Var.setCallback(new mr(1, this));
        n6Var.q(str, true, true);
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.f30862b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f38712b;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9 = this.d * this.f38714e;
        if (f9 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        canvas.save();
        float a2 = this.f38715f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f38712b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f9));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f38713c;
        org.telegram.ui.Components.n6 n6Var = this.f38711a;
        n6Var.r(i10);
        n6Var.f30880w = (int) (f9 * 255.0f);
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
        return (int) (this.f38711a.d + AndroidUtilities.dp(11.0f));
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
