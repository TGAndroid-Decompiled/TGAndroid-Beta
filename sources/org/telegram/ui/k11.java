package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class k11 extends Drawable implements org.telegram.ui.ActionBar.i5 {
    public final org.telegram.ui.Components.o6 f34969a;
    public final Paint f34970b;
    public int f34971c;
    public float d;
    public float e;
    public final org.telegram.ui.Cells.l0 f34972f;
    public org.telegram.ui.Cells.w0 h;

    public k11(String str) {
        Paint paint = new Paint(1);
        this.f34970b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f34972f = new org.telegram.ui.Cells.l0(this);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, false, false, false);
        this.f34969a = o6Var;
        o6Var.setCallback(new xr(1, this));
        o6Var.q(str, true, true);
        o6Var.t(AndroidUtilities.dp(11.0f));
        o6Var.f26868b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i10) {
        Paint paint = this.f34970b;
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
        float a2 = this.f34972f.a(0.1f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Paint paint = this.f34970b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        paint.setAlpha(alpha);
        int i10 = this.f34971c;
        org.telegram.ui.Components.o6 o6Var = this.f34969a;
        o6Var.r(i10);
        o6Var.f26885w = (int) (f7 * 255.0f);
        o6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        o6Var.draw(canvas);
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
        return (int) (this.f34969a.d + AndroidUtilities.dp(11.0f));
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
